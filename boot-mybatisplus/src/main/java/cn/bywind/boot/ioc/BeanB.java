package cn.bywind.boot.ioc;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanB {

    private BeanA beanA;

    @Bean
    public BeanA getBeanA() {

        return new BeanA();
    }
}
