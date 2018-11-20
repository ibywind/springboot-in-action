package cn.bywind.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("cn.bywind.boot.dao")
@EnableTransactionManagement
@EnableScheduling
public class BootApplication /**extends SpringBootServletInitializer*/{

	public static void main(String[] args) {
		//	这是正常的启动模式
		SpringApplication.run(BootApplication.class, args);
		//  这里是 外部部署的方式
//		 new SpringApplicationBuilder(Application.class).web(WebApplicationType.SERVLET).run(args);
	}

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(BootApplication.class);
//	}
}
