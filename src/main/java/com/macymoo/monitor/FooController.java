package com.macymoo.monitor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {
    @Value("${app.name}")
    private String appName;

    @GetMapping("/foo")
    public String name(){
        return "App Name: " + appName;
    }
}
