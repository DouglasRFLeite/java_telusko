package com.douglas.mvc_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

  @Autowired
  AlienRepository repository;

  @RequestMapping("/")
  public String home() {
    return "index";
  }

  @PostMapping("/addAlien")
  public String addAlien(@ModelAttribute("result") Alien alien) {
    repository.save(alien);

    return "showAliens";
  }

  @GetMapping("/getAlien")
  public String getAlien(@RequestParam int id, Model m) {

    m.addAttribute("result", repository.findById(id));

    return "showAliens";
  }

  @GetMapping("getAlienByName")
  public String getAlienByName(@RequestParam String name, Model m) {
    m.addAttribute("result", repository.findUsingTheName(name));

    return "showAliens";
  }

  @GetMapping("/getAliens")
  public String getAlien(Model m) {
    m.addAttribute("result", repository.findAll());

    return "showAliens";
  }

  @ModelAttribute
  public void modelData(Model m) {
    m.addAttribute("name", "Aliens");
  }

}
