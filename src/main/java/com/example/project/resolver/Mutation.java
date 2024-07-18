package com.example.project.resolver;

import com.example.project.model.User;
import com.example.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class Mutation implements GraphQLMutationResolver {

    private  UserRepository userRepository;

    @Autowired
    public Mutation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String username, String phone) {
        User user = new User();
        user.setUsername(username);
        user.setPhone(phone);
        return userRepository.save(user);
    }

    public User updateUser(String id, String username, String phone) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setUsername(username);
            user.setPhone(phone);
            return userRepository.save(user);
        }
        return null;
       
    }

    public String deleteUser(String id) {
        userRepository.deleteById(id);
        return id;
    }
}
