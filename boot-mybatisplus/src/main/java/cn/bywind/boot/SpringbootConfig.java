package cn.bywind.boot;

import cn.bywind.boot.interceptor.HelloInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringbootConfig implements WebMvcConfigurer {

    @Bean
    public HelloInterceptor getHelloInterceptor(){
        return new HelloInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getHelloInterceptor())
                .addPathPatterns("/test/pass")
                .excludePathPatterns("/test/fail");


    }
}
