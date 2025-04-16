package com.douglas.security;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {
  @GetMapping("/")
  public String home() {
    return "home.jsp";
  }

  @RequestMapping("/login")
  public String loginPage() {
    return "login.jsp";
  }

  @RequestMapping("/logout-success")
  public String logoutPage() {
    return "logout.jsp";
  }

  @RequestMapping("user")
  @ResponseBody
  public Principal user(Principal principal) {
    return principal;
  }

}
