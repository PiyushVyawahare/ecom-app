package com.vyawpiy.ecom_backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("http://localhost:5173")
public class HelloController {

  @GetMapping("hello")
  public String helloCalling() {
    return "Hello World";
  }
  
}