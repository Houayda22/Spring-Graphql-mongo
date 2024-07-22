package com.example.project.resolver;

import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.project.model.User;
import com.example.project.repository.UserRepository;

import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;


@Component
public class QueryResolver implements GraphQLQueryResolver {

    
    private UserRepository userRepository;

   GraphQLScalarType longScalar =
      ExtendedScalars.newAliasedScalar("Long")
          .aliasedScalar(ExtendedScalars.GraphQLLong)
          .build();
        


    public QueryResolver(UserRepository userRepository) {
    this.userRepository = userRepository;
}

    public Iterable<User> findAllUsers() {
        return userRepository.findAll();
    }

    
}
