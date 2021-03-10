package com.example.SpringBoot.RestServices;

import io.swagger.annotations.ApiModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
@ApiModel(description = "Swagger configuration class")
public class SwaggerConfig {
    public static Contact contact=new Contact("Aditya Singh","tothenew.com","aditya.singh1@tothenew.com");
    public static final ApiInfo DEFAULTCONSTANT= new ApiInfo("Rest With SpringBoot", "CRUD operations using Employee class as an example", "1.0", "urn:tos", contact, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList());

    @Bean
        public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.example.SpringBoot")).build().apiInfo(DEFAULTCONSTANT);
}
}
