package com.devs4j.dragonball.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devs4j.dragonball.config.DragonBallConfig;

@RestController
@RequestMapping("/application")
public class ApplicationNameController {

    private final DragonBallConfig configuration;

    @Value("${spring.profiles.active}")
    private String activeProfile;

    public ApplicationNameController(DragonBallConfig configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/name")
    public ResponseEntity<String> getAppName() {
        return ResponseEntity.ok(configuration.getName());
    }

    @GetMapping("/profile")
    public ResponseEntity<String> getActiveProfile() {
        return ResponseEntity.ok(activeProfile);
    }
}
