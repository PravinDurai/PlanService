package com.pravin.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pravin.entity.BenefitPlanAssociationEntity;

@Repository
public interface BenefitPlanAssociationRepo extends CrudRepository<BenefitPlanAssociationEntity, Long>{
	BenefitPlanAssociationEntity findByUsername(String username);
}