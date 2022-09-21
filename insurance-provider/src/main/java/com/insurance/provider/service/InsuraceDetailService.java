package com.insurance.provider.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.provider.entity.Plan;
import com.insurance.provider.repository.InsuranceRepository;

@Service
public class InsuraceDetailService {

	@Autowired
	private InsuranceRepository insuranceRepository;

	public List<String> getPlans() {

		List<Plan> plans = insuranceRepository.findAll();
		List<String> planDetails = plans.stream().map(p -> p.getPlanName()).collect(Collectors.toList());
		System.out.println(planDetails);
		return planDetails;
	}

}
