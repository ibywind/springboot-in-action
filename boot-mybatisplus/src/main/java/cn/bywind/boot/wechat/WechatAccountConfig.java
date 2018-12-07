package cn.bywind.boot.wechat;
 

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
 

@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {
 
    private String mpAppId;
 
    private String mpAppSecret;
 
}
