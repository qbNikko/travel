package ru.qbnikko.app.travel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.ws.rs.GET;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//@EnableOAuth2Sso
//@EnableAuthorizationServer
@PropertySource("file:application.yaml")
public class TravelAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelAuthApplication.class, args);
    }

}
