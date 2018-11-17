package cn.bywind.mqproducer;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirectQueue {

    public static final String TEST_01 = "test_01";
    public static final String TEST_02 = "test_02";


    @Bean
    public Queue test01(){
        return new Queue(TEST_01);
    }

    @Bean
    public Queue test02(){
        return new Queue(TEST_02);
    }
}
