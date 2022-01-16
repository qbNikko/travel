package ru.qbnikko.app.travel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("file:application.yaml")
@EnableConfigServer
public class TravelConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelConfigApplication.class, args);
    }

}
