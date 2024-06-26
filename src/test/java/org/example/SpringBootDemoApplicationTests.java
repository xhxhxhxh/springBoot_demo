package org.example;

import org.example.service.UsersService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDemoApplicationTests {

  @Autowired
  private UsersService usersService;

  @Test
  void contextLoads() {
    usersService.save();
  }

}
