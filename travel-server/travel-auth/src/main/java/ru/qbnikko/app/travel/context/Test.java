package ru.qbnikko.app.travel.context;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @Value("${eureka.instance.instance-id}") String id;
    @GetMapping( "/ss")
    public String get(){
        return "ID: " + id;
    }
}
