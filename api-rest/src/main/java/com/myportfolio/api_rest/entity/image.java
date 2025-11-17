package com.myportfolio.api_rest.entity;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 500)
    private String url;

    @Column(nullable = false, length = 150)
    private String title;

    @Column(name = "sort_order")
    private Integer sortOrder = 0;

    @Column(name = "uploaded_at", nullable = false)
    private LocalDateTime uploadedAt;

    // Relation avec Project
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @PrePersist
    @PreUpdate
    private void updateTime() {
        uploadedAt = LocalDateTime.now();
    }

    // getters & setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Integer getSortOrder() { return sortOrder; }
    public void setSortOrder(Integer sortOrder) { this.sortOrder = sortOrder; }

    public LocalDateTime getUploadedAt() { return uploadedAt; }
    public void setUploadedAt(LocalDateTime uploadedAt) { this.uploadedAt = uploadedAt; }

    public Project getProject() { return project; }
    public void setProject(Project project) { this.project = project; }
}
