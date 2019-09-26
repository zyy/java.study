import io.prometheus.client.Counter;
import io.prometheus.client.Gauge;
import io.prometheus.client.exporter.HTTPServer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class MetricReportTest {
    static final Counter requests = Counter.build()
            .name("net_requests_total").help("Net Total requests.").labelNames("channel").register();

    public MetricReportTest() throws IOException {
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        HTTPServer server = new HTTPServer(8888);

        long begin = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            requests.labels("福网v1").inc();
            requests.labels("福网v2").inc(2);
        }
        System.out.println("--------" + (System.currentTimeMillis() - begin));

        while (true) {
            requests.labels("福网v1").inc();
            requests.labels("福网v2").inc(2);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
