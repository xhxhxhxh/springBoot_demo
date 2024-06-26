package org.example.service;

import org.example.dao.UsersDao;
import org.example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
  @Autowired
  private UsersDao usersDao;

  public void save() {
    List<User> users = usersDao.checkAll();
    System.out.println(users.toArray().toString());
    System.out.println("save");
  }
}
