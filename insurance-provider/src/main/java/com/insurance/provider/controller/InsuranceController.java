package com.insurance.provider.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.provider.service.InsuraceDetailService;

@RestController
public class InsuranceController {
	
	@Autowired
	InsuraceDetailService insuraceDetailService;

	@GetMapping("/updatedPlans")
	public List<String> getAllPlans()
	{
		return Arrays.asList("plan A","plan B","plan C");
	}
	
	@GetMapping("/getPlan")
	public List<String> addPlan()
	{
		return insuraceDetailService.getPlans();
	}
	
}
