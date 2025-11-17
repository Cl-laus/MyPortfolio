package com.myportfolio.api_rest.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;

@Entity
public class Project {

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

    @Column(name = "sort_order")
    private Integer sortOrder = 0;

    // Relation avec Image
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
    @OrderBy("sortOrder ASC")
    private List<Image> images = new ArrayList<>();

    // Relation Many-to-Many avec Techno
    @ManyToMany
    @JoinTable(
        name = "project_techno",
        joinColumns = @JoinColumn(name = "project_id"),
        inverseJoinColumns = @JoinColumn(name = "techno_id")
    )
    private List<Techno> technologies = new ArrayList<>();

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }



    // getters & setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getShortDescription() { return shortDescription; }
    public void setShortDescription(String shortDescription) { this.shortDescription = shortDescription; }

    public String getCompleteDescription() { return completeDescription; }
    public void setCompleteDescription(String completeDescription) { this.completeDescription = completeDescription; }

    public String getLinkGithub() { return linkGithub; }
    public void setLinkGithub(String linkGithub) { this.linkGithub = linkGithub; }

    public String getLinkDemo() { return linkDemo; }
    public void setLinkDemo(String linkDemo) { this.linkDemo = linkDemo; }

    public String getLinkOther() { return linkOther; }
    public void setLinkOther(String linkOther) { this.linkOther = linkOther; }

    public String getVideoUrl() { return videoUrl; }
    public void setVideoUrl(String videoUrl) { this.videoUrl = videoUrl; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public Boolean getIsOnline() { return isOnline; }
    public void setIsOnline(Boolean isOnline) { this.isOnline = isOnline; }

    public Integer getSortOrder() { return sortOrder; }
    public void setSortOrder(Integer sortOrder) { this.sortOrder = sortOrder; }

    public List<Image> getImages() { return images; }
    public void setImages(List<Image> images) { this.images = images; }

    public List<Techno> getTechnologies() { return technologies; }
    public void setTechnologies(List<Techno> technologies) { this.technologies = technologies; }
}
