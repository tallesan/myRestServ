package com.example.myRestServ.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class defaultController {

  @GetMapping("/")
  public String init(Model model){
    return "redirect:/index";
  }

  @GetMapping("/index")
  public String getIndex(Model model){
    return "index";
  }

  @GetMapping("newUser")
  public String createUserReg(Model model){
    return "new_user";
  }

}
