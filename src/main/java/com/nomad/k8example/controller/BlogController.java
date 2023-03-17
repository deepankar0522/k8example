package com.nomad.k8example.controller;

import com.nomad.k8example.dto.BlogDto;
import com.nomad.k8example.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping
    public ResponseEntity<BlogDto> getBlog() {
        ResponseEntity<BlogDto> response = ResponseEntity.ok(blogService.getBlogs());
        return response;
    }
}
