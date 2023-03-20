package com.nomad.k8example.service.impl;

import com.nomad.k8example.dao.BlogRepository;
import com.nomad.k8example.dto.Blog;
import com.nomad.k8example.entity.User;
import com.nomad.k8example.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepository blogRepository;

    @Override
    public Blog getBlogByTitle(String title) {
        Blog blog = convertEntityToDto(blogRepository.findByTitle(title));
        return blog;
    }

    @Override
    public List<Blog> getBlogs() {
        List<com.nomad.k8example.entity.Blog> blogsData = blogRepository.findAll();
        List<Blog> blogs = blogsData.stream().map(blog -> convertEntityToDto(blog)).collect(Collectors.toList());
        return blogs;
    }

    @Override
    public Blog addBlog(Blog createBlog) {
        Blog blog = convertEntityToDto(blogRepository.save(convertDtoToEntity(createBlog)));
        return blog;
    }

    @Override
    public void deleteBlog(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Blog getBlog(int id) {
        return null;
    }

    private com.nomad.k8example.dto.Blog convertEntityToDto(com.nomad.k8example.entity.Blog blogEntity) {
        Blog blogDto = new Blog();
        blogDto.setBlogId(blogEntity.getBlogId());
        blogDto.setTitle(blogDto.getTitle());
        blogDto.setContent(blogEntity.getContent());
        blogDto.setCreatedDate(blogEntity.getCreatedDate());
        blogDto.setUpdatedDate(blogEntity.getUpdatedDate());
        blogDto.setRating(blogEntity.getRating());
        blogDto.setAuthor(blogDto.getAuthor());
        blogDto.setComments(blogEntity.getComments());
        return blogDto;
    }

    private com.nomad.k8example.entity.Blog convertDtoToEntity(com.nomad.k8example.dto.Blog blogDto) {
        com.nomad.k8example.entity.Blog blogEntity = new com.nomad.k8example.entity.Blog();
        com.nomad.k8example.entity.User userEntity = new User();

        blogEntity.setBlogId(blogDto.getBlogId());
        blogEntity.setTitle(blogDto.getTitle());
        blogEntity.setContent(blogDto.getContent());
        blogEntity.setCreatedDate(new Date());
        blogEntity.setUpdatedDate(new Date());
        blogEntity.setRating(blogDto.getRating());
        userEntity.setEmail(blogDto.getAuthor().getEmail());
        userEntity.setFullName(blogDto.getAuthor().getFullName());
        userEntity.setUsername(blogDto.getAuthor().getUsername());
        blogEntity.setAuthor(userEntity);
        blogEntity.setComments(blogDto.getComments());
        return blogEntity;
    }
}
