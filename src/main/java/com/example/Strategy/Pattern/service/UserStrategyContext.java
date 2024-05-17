package com.example.Strategy.Pattern.service;

import com.example.Strategy.Pattern.dto.User;
import com.example.Strategy.Pattern.excute.UserStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserStrategyContext {
    private Map<String, UserStrategy> strategies;

    @Autowired
    public UserStrategyContext(Map<String, UserStrategy> strategies) {
        this.strategies = strategies;
    }

    public List<User> executeStrategy(String strategyId) {
        UserStrategy userStrategy = strategies.get(strategyId);
        if (userStrategy != null) {
            return userStrategy.execute();
        }
        throw new IllegalArgumentException("No strategy found for " + strategyId);
    }
}