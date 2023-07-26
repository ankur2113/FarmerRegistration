package com.reset.FarmerRegistration.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.reset.FarmerRegistration.api.model.Farmer;

@Repository
public interface FarmerRepository extends MongoRepository<Farmer, Integer>{

}
