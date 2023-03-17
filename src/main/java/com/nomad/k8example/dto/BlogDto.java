package com.nomad.k8example.dto;

import com.nomad.k8example.entity.Comment;

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

}
