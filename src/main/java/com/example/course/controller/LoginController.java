package com.example.course.controller;

import com.example.course.entity.Login;
import com.example.course.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private ILoginService iLoginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    private Login login(@RequestParam String username, @RequestParam String password) {
        return iLoginService.login(username, password);
    }

    @RequestMapping(value = "/login2", method = RequestMethod.POST)
    private Login login(@RequestBody Login login) {
        return iLoginService.login(login.getUsername(), login.getPassword());
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    private void add(@RequestParam String id, @RequestParam String username,
                     @RequestParam String password, @RequestParam String permission) {
        iLoginService.add(id, username, password, permission);
    }

    @RequestMapping(value = "/add2", method = RequestMethod.POST)
    private void add(@RequestBody Login login) {
        iLoginService.add(login.getId(), login.getUsername(), login.getPassword(), login.getPermission());
    }

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    private Login query(@RequestBody Login login) {
        return iLoginService.query(login.getUsername());
    }
}
