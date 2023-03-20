package com.nomad.k8example.service;

import com.nomad.k8example.dto.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BlogService {

    Blog getBlogByTitle(String title);

    List<Blog> getBlogs();

    Blog addBlog(Blog blog);

    void deleteBlog(Long id);

    Blog getBlog(int id);
}
