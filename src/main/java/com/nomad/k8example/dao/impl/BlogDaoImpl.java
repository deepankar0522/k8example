package com.nomad.k8example.dao.impl;

import com.nomad.k8example.dao.BlogDao;
import com.nomad.k8example.dto.BlogDto;
import org.springframework.stereotype.Repository;

@Repository
public class BlogDaoImpl implements BlogDao {
    @Override
    public BlogDto getBlogs() {
        return null;
    }
}
