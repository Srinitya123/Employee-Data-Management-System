package com.cts.employeeservice;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}
	
	@Bean
    public Docket configureSwagger() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .paths(PathSelectors.ant("/employee/**")) 
                .apis(RequestHandlerSelectors.basePackage("com.cts.employeeservice.controller")).build()
                .apiInfo(apiInfo());
    }
	
	private ApiInfo apiInfo() {
        return new ApiInfo("Employee Service Api", "Sample API for Employee", "1.0", "path/to/terms",
                new Contact("Cognizant", "http://www.google.com", "cts@gmail.com"), "API License",
                "http://www.google.com", Collections.emptyList());
    }

}
