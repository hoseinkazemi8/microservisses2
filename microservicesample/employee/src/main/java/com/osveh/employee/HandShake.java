package com.osveh.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/handshake")

public class HandShake {

    @GetMapping("/sayhello")
    public String sayHello(){
        return "sayHello";
    }
}
