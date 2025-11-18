package com.myportfolio.api_rest.controller.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.myportfolio.api_rest.entity.Image;
import com.myportfolio.api_rest.entity.Techno;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ProjectDetailDTO {
    @NotBlank
    private Integer id;

    @NotBlank
    private String title;

    @NotBlank
    @Size(max = 500, message = "La description ne peut pas dépasser 500 caractères")
    private String shortDescription;

    @NotBlank
    @Size(max = 2000, message = "La description ne peut pas dépasser 2000 caractères")
    private String completeDescription;

    @NotBlank
    private String linkGithub;

    private String linkDemo;

    private String linkOther;

    private String videoUrl;

    @NotBlank
    private LocalDateTime createdAt;

    @NotBlank
    private Boolean isOnline;

    @NotBlank
    private Integer sortOrder;

    @NotBlank
    private List<Image> images;

    @NotBlank
    private List<Techno> technologies;

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

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Techno> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<Techno> technologies) {
        this.technologies = technologies;
    }

}
