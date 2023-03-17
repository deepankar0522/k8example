package com.nomad.k8example.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.nomad.k8example.entity.BlogData;
import java.util.Date;

@JsonFormat
public class Comment {
    private String content;
    private Date createdDate;
    private Date updatedDate;
    private BlogData blog;

}
