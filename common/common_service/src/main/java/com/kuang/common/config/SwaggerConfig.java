package com.kuang.common.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket gatewayDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("gateway")
                .apiInfo(createApiInfo("gateway","网关api"))
                .select()
                .paths(Predicates.and(PathSelectors.regex("/api/.**")))
                .build();
    }

    @Bean
    public Docket memberDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("member")
                .apiInfo(createApiInfo("member","用户模块api"))
                .select()
                .paths(Predicates.and(PathSelectors.regex("/member/.**")))
                .build();
    }

    @Bean
    public Docket videoDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("video")
                .apiInfo(createApiInfo("video","视频模块api"))
                .select()
                .paths(Predicates.and(PathSelectors.regex("/video/.**")))
                .build();
    }

    private ApiInfo createApiInfo(String title,String description){
        return new ApiInfoBuilder()
                .title(title)
                .description(description)
                .version("1.0")
                .contact(new Contact("kuang","http://www.bilibili,com","1400584782@qq.com"))
                .build();
    }
}
