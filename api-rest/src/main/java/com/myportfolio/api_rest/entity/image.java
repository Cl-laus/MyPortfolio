package com.myportfolio.api_rest.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@Entity
public class image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;



    @Column(nullable = false, length = 500)
    private String url;
    @Column(nullable = false, length = 150)
    private String title;
    private Integer order = 0;
    @Column(name = "uploaded_at", nullable = false)
    private LocalDateTime uploadedAt;


    // relations avec Project(mappé de l'autre coté)
    @ManyToOne
    private project project;


    @PrePersist
    @PreUpdate
    private void updateTime() {
        uploadedAt = LocalDateTime.now();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public Integer getOrder() {
        return order;
    }


    public void setOrder(Integer order) {
        this.order = order;
    }


    public LocalDateTime getUploadedAt() {
        return uploadedAt;
    }


    public void setUploadedAt(LocalDateTime uploadedAt) {
        this.uploadedAt = uploadedAt;
    }


    public project getProject() {
        return project;
    }


    public void setProject(project project) {
        this.project = project;
    }


}
