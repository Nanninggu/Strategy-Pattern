package com.example.Strategy.Pattern.controller;

import com.example.Strategy.Pattern.dto.User;
import com.example.Strategy.Pattern.service.UserStrategyContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserStrategyContext userStrategyContext;

    @GetMapping("/admin")
    public List<User> getAdminUsers() {
        return userStrategyContext.executeStrategy("adminUserStrategy");
    }

    @GetMapping("/regular")
    public List<User> getRegularUsers() {
        return userStrategyContext.executeStrategy("regularUserStrategy");
    }

    @GetMapping("/other")
    public List<User> getOtherUsers() {
        return userStrategyContext.executeStrategy("otherUserStrategy");
    }

    @GetMapping("/manager")
    public List<User> getManagerUsers() {
        return userStrategyContext.executeStrategy("managerUserStrategy");
    }

}
