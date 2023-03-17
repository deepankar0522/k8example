package com.nomad.k8example.service.impl;

import com.nomad.k8example.dao.BlogDao;
import com.nomad.k8example.dto.BlogDto;
import com.nomad.k8example.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogDao blogDao;

    @Override
    public BlogDto getBlogs() {
        return blogDao.getBlogs();
    }
}
