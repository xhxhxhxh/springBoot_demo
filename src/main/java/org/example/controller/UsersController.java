package org.example.controller;

import org.example.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
  @Value("${name}")
  private String name;

  @Autowired
  private Environment environment;

  @Autowired
  private Enterprise enterprise;

  @GetMapping
  public String hello() {
    System.out.println(enterprise.toString());
    return "hello" + name + environment.getProperty("server.port");
  }
}
