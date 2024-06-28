package org.example.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.domain.User;

import java.util.List;
@Mapper
public interface UsersDao extends BaseMapper<User> {
//  @Select("select * from user_tb")
//  List<User> checkAll();
}
