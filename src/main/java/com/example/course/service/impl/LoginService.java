package com.example.course.service.impl;

import com.example.course.dao.ILoginDao;
import com.example.course.entity.Login;
import com.example.course.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService {

    @Autowired
    private ILoginDao iLoginDao;

    @Override
    public Login login(String username, String password) {

        return iLoginDao.login(username, password);
    }

    @Override
    public void add(String id, String username, String password, String permission) {
        iLoginDao.add(id, username, password, permission);
    }

    @Override
    public Login query(String username) {
        return iLoginDao.query(username);
    }
}
