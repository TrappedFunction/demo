package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    //  具体的sql文件在该mapper的同名文件中
    String getPasswordByUsername(@Param("username") String username);
    void insertAll(@Param("username") String username, @Param("password") String password, @Param("salt") String salt);
    String[] getAllUsername();
    String getSaltByUsername(@Param("username") String username);
    boolean existsByUsername(String username);
}
