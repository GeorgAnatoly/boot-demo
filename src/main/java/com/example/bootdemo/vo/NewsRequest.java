package com.example.bootdemo.vo;

import com.example.bootdemo.models.Category;
import com.example.bootdemo.models.Tag;
import lombok.Data;

import java.util.Set;

@Data
public class NewsRequest {
    String title;
    String content;
    Set<Category> categories;
    Set<Tag> tags;
}
