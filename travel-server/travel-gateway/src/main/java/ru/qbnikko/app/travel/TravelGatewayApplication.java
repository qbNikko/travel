package ru.qbnikko.app.travel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.PropertySource;

import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@SpringBootApplication
@EnableEurekaClient
@PropertySource(value = "file:application.yaml", ignoreResourceNotFound = true)
public class TravelGatewayApplication  {

    public static void main(String[] args) {
        SpringApplication.run(TravelGatewayApplication.class, args);
    }

}
