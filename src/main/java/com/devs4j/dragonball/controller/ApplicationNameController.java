package com.devs4j.dragonball.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devs4j.dragonball.config.DragonBallConfig;

@RestController
@RequestMapping("/application-name")
public class ApplicationNameController {

	private final DragonBallConfig configuration;
	
	public ApplicationNameController(DragonBallConfig configuration) {
		this.configuration = configuration;
	}


	@GetMapping
	public ResponseEntity<String> getAppName() {
		return ResponseEntity.ok(configuration.getName());
	}

}