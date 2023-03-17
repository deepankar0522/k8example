package com.nomad.k8example.dto;

import com.nomad.k8example.entity.Comment;
import com.nomad.k8example.entity.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogDto {
    private String title;
    private String content;
    private Date createdDate;
    private Date updatedDate;
    private int rating;
    private User author;
    private List<Comment> comments = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "BlogDto{" +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", rating=" + rating +
                ", author=" + author +
                ", comments=" + comments +
                '}';
    }
}
