package com.vericred.university;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VericredCampusApplication {

    public static void main(String[] args) {
        SpringApplication.run(VericredCampusApplication.class, args);
    }

    // A simple endpoint to verify our backend is alive
    @GetMapping("/api/health")
    public String healthCheck() {
        return "VeriCred Campus Backend is up and running!";
    }
}