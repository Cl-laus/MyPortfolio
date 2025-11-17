package com.myportfolio.api_rest.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
public class techno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 100)
    private String name;

    // lien vers icon
    @Column(length = 500)
    private String icon;

    @Column(length = 50)
    private String category;
    // exemple: frontend, backend, database, 3D

    // Relation Many-to-Many inverse
    @ManyToMany(mappedBy = "technologies")
    @JsonIgnore
    private List<project> projects = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<project> getProjects() {
        return projects;
    }

    public void setProjects(List<project> projects) {
        this.projects = projects;
    }
}
