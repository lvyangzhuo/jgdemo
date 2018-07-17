package com.jpush.jgdemo.config.properties;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author lenovo
 */
@Data
@NoArgsConstructor
@Component
@ConfigurationProperties(prefix = "jpush")
public class JPushConfigProperties {

    public String appKey;
    public String masterSecret;
    public boolean isPattern = false;

}

