package com.insurance.provider.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.provider.entity.Plan;

public interface InsuranceRepository extends JpaRepository<Plan, Long>{

}
