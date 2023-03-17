package com.nomad.k8example.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "blog_comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long commentId;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private int rating;

}
