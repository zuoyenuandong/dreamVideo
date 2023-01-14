package com.kuang.service.member.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "result")
@Data
public class NacosConfig {

    String text;
}
