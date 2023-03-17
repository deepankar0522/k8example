package com.nomad.k8example.service.impl;

import com.nomad.k8example.dao.BlogRepository;
import com.nomad.k8example.dto.BlogDto;
import com.nomad.k8example.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepository blogRepository;

    @Override
    public BlogDto getBlogs() {
        return blogRepository.getBlogs();
    }
}
