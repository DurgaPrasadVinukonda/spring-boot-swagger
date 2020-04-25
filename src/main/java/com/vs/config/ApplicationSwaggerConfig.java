package com.vs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

// these are the below dependencies we need to write when using aswagger in our tool
@Configuration
@EnableSwagger2WebMvc
@Import(SpringDataRestConfiguration.class)
public class ApplicationSwaggerConfig { 
	// Docket is method were we write our types
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build().apiInfo(getApiInfo());                                   
    }
    
    public ApiInfo getApiInfo() {
    	return new ApiInfoBuilder()
    			.title(" Employee Api")
    			.version("1.0")
    			.description("This API Saves the data")
    			.build();
    }

    // Here by using this method we can add title and name 
}
