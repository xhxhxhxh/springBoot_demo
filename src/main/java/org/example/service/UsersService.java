package org.example.service;

import org.example.dao.UsersDao;
import org.example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UsersService {
  @Autowired
  private UsersDao usersDao;


  public void save() {
    List<User> users = usersDao.selectList(null);
    System.out.println(Arrays.toString(users.toArray()));
    System.out.println("save");
  }
}
