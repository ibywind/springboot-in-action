package cn.bywind.boot;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("cn.bywind.boot.mapper")
@EnableTransactionManagement
@EnableScheduling
public class BootApplication{


	public static void main(String[] args) {
		//	这是正常的启动模式
		SpringApplication.run(BootApplication.class, args);
		//  这里是 外部部署的方式 需要注释上面
//		new SpringApplicationBuilder(TomcatApplication.class).web(WebApplicationType.SERVLET).run(args);
	}

	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}

	@Bean
	@Profile({"dev","test"})// 设置 dev test 环境开启
	public PerformanceInterceptor performanceInterceptor() {
		return new PerformanceInterceptor();
	}


}
