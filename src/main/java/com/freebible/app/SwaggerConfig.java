package com.freebible.app;


import java.time.LocalDateTime;

import java.util.Collections;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import springfox.documentation.swagger.web.DocExpansion;
import springfox.documentation.swagger.web.ModelRendering;
import springfox.documentation.swagger.web.OperationsSorter;
import springfox.documentation.swagger.web.TagsSorter;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
 

	@Bean
    public Docket api() {

		  
        return ((Docket) new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build())
                .directModelSubstitute(LocalDateTime.class, java.util.Date.class)
                .apiInfo(getApiInfo())
                ;
        }   
     
       private ApiInfo getApiInfo() {
            return new ApiInfo(
                    "API Free Bible",
                    "API FreeBible Documentation",
                    "1.0",
                    "https://freebible.me",
                    new Contact("Oscar Sierra", "https://freebible.me", "oscarsierracontreras@gmail.com"),
                    "LICENSE",
                    "https://freebible.me",
                    Collections.emptyList()
                    );
        }
       @Bean
       UiConfiguration uiConfig() {
           return UiConfigurationBuilder.builder()
                   .deepLinking(false)
                   
                   .displayOperationId(false)
                   .defaultModelsExpandDepth(-1)
                   .defaultModelExpandDepth(0)
                   .defaultModelRendering(ModelRendering.EXAMPLE)
                   .displayRequestDuration(false)
                   .docExpansion(DocExpansion.NONE)
                   .filter(false)
                   .maxDisplayedTags(null)
                   .operationsSorter(OperationsSorter.ALPHA)
                   .showExtensions(false)
                   .tagsSorter(TagsSorter.ALPHA)
                   .supportedSubmitMethods(UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS)
                   .validatorUrl(null)
                   .build();
       }





     
}