package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.domain.User;

import java.util.List;

@Mapper
public interface UsersDao {
  @Select("select * from user_tb")
  List<User> checkAll();
}
