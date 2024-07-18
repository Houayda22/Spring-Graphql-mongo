package com.example.project.resolver;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.project.model.User;
import com.example.project.repository.UserRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {
    private  UserRepository userRepository;
  @Autowired
    public Query(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> getAllUsers(){
        return userRepository.findAll();    }

    public User getUserById(String id){
        return userRepository.findById(id).orElse(null);
    }
    
}
