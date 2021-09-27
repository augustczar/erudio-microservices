package com.augustczar.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.augustczar.configuration.GreetingConfiguration;
import com.augustczar.model.Greeting;

@RequestMapping(value = "/greeting")
public class GreetingController {

	private static final String template = "%s, %s!";
	
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private GreetingConfiguration greetingConfiguration;

	@GetMapping
	public ResponseEntity<Greeting> greeting(@RequestParam(value = "name", defaultValue = "") String name) {
		
		if(name.isEmpty())
			name = greetingConfiguration.getDefaultValue();
		
		Greeting greet =  new Greeting(counter.incrementAndGet(), String.format(template, greetingConfiguration.getGreeting(), name));
		
		return ResponseEntity.ok(greet);
	}

}
