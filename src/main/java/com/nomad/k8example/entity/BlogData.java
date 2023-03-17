package com.nomad.k8example.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Blog")
public class BlogData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blog_id")
    private Long blogId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(name = "created_date", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name = "updated_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;

    @Column(nullable = false)
    private int rating;

    @ManyToOne(targetEntity = User.class, cascade = CascadeType.ALL)
    private User user;

    @OneToMany(targetEntity = Comment.class, cascade = CascadeType.ALL)
    private List<Comment> comments;
}
