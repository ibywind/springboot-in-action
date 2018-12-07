package cn.byiwnd.boot.tx;

import com.mysql.jdbc.Driver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.jta.JtaTransactionManager;
import org.springframework.transaction.support.ResourceTransactionManager;

import java.sql.Connection;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TxApplicationTests {

	@Test
	public void contextLoads() {
	}

}
