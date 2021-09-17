package com.augustczar.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Component
@ConfigurationProperties("greeting-service")
public class GreetingConfiguration {
	
	private String greeting;
	private String defaultValue;

}
