package com.nomad.k8example.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.nomad.k8example.entity.BlogData;
import com.nomad.k8example.entity.User;

import java.util.Date;

@JsonFormat
public class Comment {
    private String content;
    private Date createdDate;
    private Date updatedDate;
    private BlogData blog;
    private User author;

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

    public BlogData getBlog() {
        return blog;
    }

    public void setBlog(BlogData blog) {
        this.blog = blog;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "content='" + content + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", blog=" + blog +
                ", author=" + author +
                '}';
    }
}
