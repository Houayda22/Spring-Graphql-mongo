package com.example.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.example.project.model.Cohort;
@EnableMongoRepositories
public interface CohortRepository extends MongoRepository<Cohort,String>{
    
}
