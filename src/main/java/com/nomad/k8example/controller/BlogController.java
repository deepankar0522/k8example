package com.nomad.k8example.controller;

import com.nomad.k8example.dto.Blog;
import com.nomad.k8example.service.BlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    private static final Logger logger = LoggerFactory.getLogger(BlogController.class);

    @Autowired
    BlogService blogService;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Blog> getBlog() {
        List<Blog> blogs = blogService.getBlogs();
        return blogs;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Blog getBlog(@PathVariable("id") int id) {
        Blog blog = blogService.getBlog(id);
        return blog;
    }

    @GetMapping("/{title}")
    @ResponseStatus(HttpStatus.OK)
    public Blog getBlog(@PathVariable("title") String title) {
        Blog blog = blogService.getBlogByTitle(title);
        return blog;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Blog addBlog(@RequestBody Blog blog) {
        Blog newblog = blogService.addBlog(blog);
        return newblog;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void addBlog(@PathVariable("id") Long id) {
        blogService.deleteBlog(id);
    }
}
