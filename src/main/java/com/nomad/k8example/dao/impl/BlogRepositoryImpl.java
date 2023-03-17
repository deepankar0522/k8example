package com.nomad.k8example.dao.impl;

import com.nomad.k8example.dao.BlogRepository;
import com.nomad.k8example.dto.BlogDto;
import org.springframework.stereotype.Repository;

@Repository
public class BlogRepositoryImpl implements BlogRepository {
    @Override
    public BlogDto getBlogs() {
        return null;
    }
}
