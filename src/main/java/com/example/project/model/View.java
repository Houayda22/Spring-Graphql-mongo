package com.example.project.model;

import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class View {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    Map<String,String> permissions;
}
