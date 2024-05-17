package com.example.Strategy.Pattern.strategy;

import com.example.Strategy.Pattern.dto.User;
import com.example.Strategy.Pattern.excute.UserStrategy;
import com.example.Strategy.Pattern.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OtherUserStrategy implements UserStrategy {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> execute() {
        return userMapper.getOtherUsers();
    }

}
