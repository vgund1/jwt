package com.medi.svmkrd;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Sample application for demonstrating security with JWT Tokens
 * 
 * @author vladimir.stankovic
 *
 * Aug 3, 2016
 */
/*@SpringBootApplication
@EnableConfigurationProperties
public class SpringbootSecurityJwtApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootSecurityJwtApplication.class, args);
	}
}*/


//uncomment below code for deployment


@SpringBootApplication
@EnableConfigurationProperties
public class SpringbootSecurityJwtApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure (SpringApplicationBuilder builder) {
        return builder.sources(SpringbootSecurityJwtApplication.class);
    }
}