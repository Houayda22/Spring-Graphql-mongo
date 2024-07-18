package com.example.project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;;
@Document(collection = "projects")
public class Project {
    @Id
    private String id ;
    private String name ; 
    private String descrption ;
    private String creationTime ;
    private User owner ;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescrption() {
        return descrption;
    }
    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }
    public String getCreationTime() {
        return creationTime;
    }
    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }
    public User getOwner() {
        return owner;
    }
    public void setOwner(User owner) {
        this.owner = owner;
    } 


    

    
}
