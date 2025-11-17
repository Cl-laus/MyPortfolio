package com.myportfolio.api_rest.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.PrePersist;

@Entity
public class project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 200)
    private String title;
    @Lob
    @Column(name = "short_description")
    private String shortDescription;
    @Lob
    @Column(name = "complete_description")
    private String completeDescription;

    @Column(name = "link_github", length = 500)
    private String linkGithub;

    @Column(name = "link_demo", length = 500)
    private String linkDemo;

    @Column(name = "link_other", length = 500)
    private String linkOther;

    @Column(name = "video_url", length = 500)
    private String videoUrl;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "is_online", nullable = false)
    private Boolean isOnline = false;

    private Integer order = 0;

    // relations avec Image
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
    @OrderBy("order ASC")
    private List<image> images = new ArrayList<>();

    //relations avec techno via une table de liaision
    @ManyToMany

    //on definit la table de liaison pour controller les noms
    @JoinTable(
        name = "project_techno",
        joinColumns = @JoinColumn(name = "project_id"),
        inverseJoinColumns = @JoinColumn(name = "techno_id")
    )
    private List<techno> technologies = new ArrayList<>();

    // gere la date de creation automatiquement
    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getCompleteDescription() {
        return completeDescription;
    }

    public void setCompleteDescription(String completeDescription) {
        this.completeDescription = completeDescription;
    }

    public String getLinkGithub() {
        return linkGithub;
    }

    public void setLinkGithub(String linkGithub) {
        this.linkGithub = linkGithub;
    }

    public String getLinkDemo() {
        return linkDemo;
    }

    public void setLinkDemo(String linkDemo) {
        this.linkDemo = linkDemo;
    }

    public String getLinkOther() {
        return linkOther;
    }

    public void setLinkOther(String linkOther) {
        this.linkOther = linkOther;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public List<image> getImages() {
        return images;
    }

    public void setImages(List<image> images) {
        this.images = images;
    }

    public List<techno> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<techno> technologies) {
        this.technologies = technologies;
    }
}
