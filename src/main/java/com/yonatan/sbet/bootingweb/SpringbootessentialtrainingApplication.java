package com.yonatan.sbet.bootingweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootessentialtrainingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootessentialtrainingApplication.class, args);
    }

    //The @RestController annotation tells Spring that this code describes an endpoint
    //that should be made available over the web. The @GetMapping(“/hello”) tells Spring to
    //use our hello() method to answer requests that get sent to the http://localhost:8080/hello address.
    //Finally, the @RequestParam is telling Spring to expect a name value in the request, but if it’s not there, it will use
    //the word “World” by default.
    //What should happen if you add ?name=Amy to the end of the URL?
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}
