package com.jwt.security.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")


public class DemoController {
    @GetMapping("/auth/demo-controller")
    public ResponseEntity<String>sayHello(){
        return ResponseEntity.ok("Hello From Secured Endpoint");
    }

    @GetMapping("/public/demo1")
    public ResponseEntity<String>sayHello2(){
        return ResponseEntity.ok("Hello Without Secured Endpoint");
    }
}
