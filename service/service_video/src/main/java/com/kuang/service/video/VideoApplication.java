package com.kuang.service.video;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableFeignClients
//@EnableDiscoveryClient
@SpringBootApplication
@MapperScan({"com.kuang.service.video.mapper"})
public class VideoApplication {
    public static void main(String[] args) {
        SpringApplication.run(VideoApplication.class,args);
    }
}
