package com.aula.aula_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AulaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaApiApplication.class, args);
	}

	@Scheduled(cron = "0 0/5 * * * *")
    public void preventIdle() {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("https://www.google.com/", String.class);
        System.out.println(response);
    }
}
