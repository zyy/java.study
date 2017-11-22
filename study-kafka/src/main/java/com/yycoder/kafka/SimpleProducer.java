package com.yycoder.kafka;
import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

import java.util.Properties;

/**
 * Created by yangyang.zhao on 2017/9/19.
 */
public class SimpleProducer {
    private static Producer<Integer, String> producer;
    private final Properties properties = new Properties();

    public SimpleProducer() {
        properties.put("metadata.broker.list", "192.168.53.101:9092");
        properties.put("serializer.class", "kafka.serializer.StringEncoder");
        properties.put("request.required.acks", "1");
        producer = new Producer<Integer, String>(new ProducerConfig(properties));
    }

    public static void main(String[] args) {
        new SimpleProducer();
        KeyedMessage<Integer, String> data = new KeyedMessage<Integer, String>("test-1", "hello");
        producer.send(data);
        producer.close();
    }
}
