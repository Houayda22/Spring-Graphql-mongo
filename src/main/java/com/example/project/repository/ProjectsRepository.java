package com.example.project.repository;
import com.example.project.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
public interface ProjectsRepository extends MongoRepository<Project ,String > {
    
}
