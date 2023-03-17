package com.nomad.k8example.service;

import com.nomad.k8example.dto.BlogDto;
import org.springframework.stereotype.Service;

@Service
public interface BlogService {
    BlogDto getBlogs();
}
