package com.example.project.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.project.model.User;
import com.example.project.repository.UserRepository;


@Component
public class MutationResolver implements GraphQLMutationResolver {

    private UserRepository userRepository;
    @Autowired
    public MutationResolver(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User newUser(String username, String phone) {
        User user = new User();
        user.setUsername(username);
        user.setPhone(phone);
       userRepository.save(user);
       return user ;

    }

    public User updateUser(Long id, String username, String phone) {
        User user = userRepository.findById(id).orElse(null);
        if (user == null) {
            return null;
        }
        user.setUsername(username);
        user.setPhone(phone);

        return userRepository.save(user);
    }

    public Boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id); // Utilisez deleteById pour supprimer un utilisateur par ID
            return true;
        }
        return false;
    }
}

