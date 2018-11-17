package cn.byiwnd.mqconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class DirectConsumer {

    @RabbitListener(queues = "test_01")
    public void handler_test01(String msg) {
        System.out.println("Receiver--01--  : " + msg);
    }

    @RabbitListener(queues = "test_01")
    public void handler_test02(String msg) {
        System.out.println("Receiver--02--  : " + msg);
    }

    @RabbitListener(queues = "test_02")
    public void handler_test03(String msg) {
        System.out.println("Receiver--03--  : " + msg);
    }
    @RabbitListener(queues = "test_02")
    public void handler_test04(String msg) {
        System.out.println("Receiver--04--  : " + msg);
    }
}
