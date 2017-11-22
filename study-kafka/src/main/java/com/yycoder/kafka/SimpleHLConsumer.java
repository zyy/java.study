package com.yycoder.kafka;

import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by yangyang.zhao on 2017/9/19.
 */
public class SimpleHLConsumer {
    private final ConsumerConnector consumer;
    private final String topic;

    public SimpleHLConsumer(String zookeeper, String groupId, String topic) {
        Properties props = new Properties();
        props.put("zookeeper.connect", zookeeper);
        props.put("group.id", groupId);
        props.put("zookeeper.session.timeout.ms", "500");
        props.put("zookeeper.sync.time.ms", "250");
        props.put("auto.commit.interval.ms", "1000");

        consumer = Consumer.createJavaConsumerConnector(new ConsumerConfig(props));
        this.topic = topic;
    }

    public void testConsumer() throws Exception {
        String fileName = "logX.txt";
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));

        Map<String, Integer> topicCount = new HashMap<String, Integer>();
        topicCount.put(topic, 1);

        Map<String, List<KafkaStream<byte[], byte[]>>> consumerStreams = consumer.createMessageStreams(topicCount);
        List<KafkaStream<byte[], byte[]>> streams = consumerStreams.get(topic);
        for (final KafkaStream stream : streams) {
            ConsumerIterator<byte[], byte[]> it = stream.iterator();
            while (it.hasNext()) {
                String msg = new String(it.next().message(), Charset.forName("UTF-8"));
                System.out.println("Message from Single Topic: " + msg);
                out.write(msg, 0, msg.length());
                out.write('\n');
                out.flush();
            }
        }
        if (consumer != null) {
            consumer.shutdown();
        }
        if (null != out) {
            out.close();
        }
    }

    public static void main(String[] args) {
        SimpleHLConsumer simpleHLConsumer = new SimpleHLConsumer("192.168.53.101:2181", "testgroup", "log-service-v4");
        try {
            simpleHLConsumer.testConsumer();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
