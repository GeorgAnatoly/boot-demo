package com.example.bootdemo.vo;

import com.example.bootdemo.models.Role;
import lombok.Data;

@Data
public class UserRequest {
    String identity;
    String name;
    Role role;
}
