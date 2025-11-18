package com.myportfolio.api_rest.controller.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;

public class ImageDTO {
    @NotBlank
    private Integer id;
    @NotBlank
    private String url;
    @NotBlank
    private String title;
    @NotBlank
    private Integer sortOrder;
    @NotBlank
    private LocalDateTime uploadedAt;



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
    public Integer getSortOrder() {
        return sortOrder;
    }
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
    public LocalDateTime getUploadedAt() {
        return uploadedAt;
    }
    public void setUploadedAt(LocalDateTime uploadedAt) {
        this.uploadedAt = uploadedAt;
    }


}
