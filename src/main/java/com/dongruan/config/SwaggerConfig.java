package com.dongruan.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author: 代伟
 * @create: 2020-05-14 18:02
 */
@Configuration
@EnableSwagger2
// 只有配置中swagger.enable为true时才生效
@ConditionalOnProperty(name="swagger.enable", havingValue = "true")
public class SwaggerConfig {

    //配置docket以配置Swagger具体参数
    @Bean
    public Docket docket1() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //配置扫描位置
                .select().apis(RequestHandlerSelectors.basePackage("com.dongruan.controller")).build()
                //设置分组, 默认为default。如需设置多个分组, 则将多个Docket加入容器即可。
                .groupName("代伟");
    }

    //配置文档信息
    private ApiInfo apiInfo() {
        //联系人信息
        Contact contact = new Contact("代伟", "", "844783926@");

        return new ApiInfo(
                "Swagger Demo",  // 标题
                "这时一个Swagger Demo", // 描述
                "v1.0",  // 版本
                "",  // 组织链接
                contact,   // 联系人信息
                "Apache 2.0 许可",  // 许可
                "",   // 许可连接
                new ArrayList<>()  // 扩展
        );
    }
}
