package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.project.model.Cohort;

public interface CohortRepository extends JpaRepository<Cohort,Long>{
    
}
