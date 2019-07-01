package com;
 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
 
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient //Eureka Client
public class AppMain {
    public static void main(String[] args) {
        new SpringApplicationBuilder(AppMain.class).web(true).run(args);
    }
}