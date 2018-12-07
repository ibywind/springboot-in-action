package cn.bywind.boot;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class TomcatApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BootApplication.class);
    }
    
    public static void main(String[] args) {
        new SpringApplicationBuilder(TomcatApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}