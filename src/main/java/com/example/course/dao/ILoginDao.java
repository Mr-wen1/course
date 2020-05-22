package com.example.course.dao;

import com.example.course.entity.Login;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoginDao {

    Login login(@Param("username") String username, @Param("password") String password);

    void add(@Param("id") String id, @Param("username") String username,
              @Param("password") String password, @Param("permission") String permission);

    Login query(@Param("username") String username);
}
