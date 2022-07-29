package com.lcs.demo4;

import com.lcs.demo4.service.UserService;
import com.lcs.demo4.service.UserServiceImpl;

public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    @Override
    public void add() {
        userService.add();
    }

    @Override
    public void delete() {
        userService.delete();
    }

    @Override
    public void update() {
        userService.update();
    }

    @Override
    public void query() {
        userService.query();
    }

    public UserServiceImpl getUserService() {
        return userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }
}
