package cn.bywind.mqproducer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MqProducerApplicationTests {

	@Autowired
	DirectProducer directProducer;

	@Autowired
	FanoutSender fanoutSender;

	@Autowired
	TopicSender topicSender;



	@Test
	public void testProduceMsg() throws InterruptedException {
		directProducer.produceMsg_01();
	}

	@Test
	public void testProduceMsgOne2Many() throws InterruptedException {
		for (int i = 0; i < 100; i++) {
			Thread.sleep(2*1000);
			directProducer.produceMsg_01();
		}
	}

	@Test
	public void testProduceMsgMany2Many() {
		for (int i = 0; i < 100; i++) {
			directProducer.produceMsg_01();
			directProducer.produceMsg_02();
		}

	}

	@Test
	public void testProduceObj() throws InterruptedException {
		for (int i = 0; i < 100; i++) {
			Thread.sleep(1*1000);
			directProducer.produceObj();

		}
	}


	@Test
	public void testFanout() throws InterruptedException {
		for (int i = 0; i < 100; i++) {
			Thread.sleep(1*1000);
			fanoutSender.send();

		}
	}

	@Test
	public void testTopic() throws InterruptedException {
		for (int i = 0; i < 100; i++) {
			Thread.sleep(1*1000);
			topicSender.send();
			topicSender.send1();
			topicSender.send2();

		}
	}

}
