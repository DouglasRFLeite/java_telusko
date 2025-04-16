package com.douglas.mvc_mvn;

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
  private AlienDAO alienDAO;

  @RequestMapping("/")
  public String home() {
    return "index";
  }

  @PostMapping(value = "/addAlien")
  public String addAlien(@ModelAttribute("result") Alien alien) {
    alienDAO.addAlien(alien);

    return "showAliens";
  }

  @GetMapping("getAliens")
  public String getAliens(Model m) {
    m.addAttribute("result", alienDAO.getAliens().toString());

    return "showAliens";
  }

  @GetMapping("getAlien")
  public String getAlien(@RequestParam int id, Model m) {
    m.addAttribute("result", alienDAO.getAlien(id));

    return "showAliens";
  }

  @ModelAttribute
  public void modelData(Model m) {
    m.addAttribute("name", "Aliens");
  }

}
