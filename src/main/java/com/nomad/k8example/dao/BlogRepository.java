package com.nomad.k8example.dao;

import com.nomad.k8example.dto.BlogDto;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository {
    BlogDto getBlogs();
}
