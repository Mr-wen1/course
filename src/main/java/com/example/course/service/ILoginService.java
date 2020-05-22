package com.example.course.service;

import com.example.course.entity.Login;


public interface ILoginService {
    Login login(String username, String password);

    void add(String id, String username, String password, String permission);

    Login query(String username);
}
