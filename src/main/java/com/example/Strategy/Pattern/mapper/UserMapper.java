package com.example.Strategy.Pattern.mapper;

import com.example.Strategy.Pattern.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM strategy WHERE role = 'admin'")
    List<User> getAdminUsers();

    @Select("SELECT * FROM strategy WHERE role = 'user'")
    List<User> getRegularUsers();

    @Select("SELECT * FROM strategy WHERE role = 'other'")
    List<User> getOtherUsers();

    @Select("SELECT * FROM strategy WHERE role = 'manager'")
    List<User> getManagerUsers();

}