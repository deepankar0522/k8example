package com.nomad.k8example.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.nomad.k8example.entity.Comment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonFormat
public class Blog {
    private Long blogId;
    private String title;
    private String content;
    private Date createdDate;
    private Date updatedDate;
    private int rating;
    private User author;
    private List<Comment> comments = new ArrayList<>();

}
