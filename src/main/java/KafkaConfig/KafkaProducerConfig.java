package KafkaConfig;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaProducerConfig {

    @Value("${spring.kafka.bootstrap-servers}")
    private String bootStrapServer;


    public AbstractMap<String, Object> producerConfig() {
       HashMap<String, Object> property = new HashMap<>();
       property.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootStrapServer);
       property.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
       property.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
       return property;
    }
}
