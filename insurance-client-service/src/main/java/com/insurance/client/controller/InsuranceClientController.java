package com.insurance.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class InsuranceClientController {

	@Autowired
	RestTemplate restTemplate;

	@Value("${insurance.provider.uri}")
	private String url;

	@GetMapping("/getPlans")
	public List<String> getPlans() {
		List<String> plans = restTemplate.getForObject(url, List.class);
		return plans;
	}

}
