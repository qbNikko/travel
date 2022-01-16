package ru.qbnikko.app.travel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableGlobalMethodSecurity(prePostEnabled = true)
@PropertySource("file:application.yaml")
public class TravelAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelAuthApplication.class, args);
    }

}
