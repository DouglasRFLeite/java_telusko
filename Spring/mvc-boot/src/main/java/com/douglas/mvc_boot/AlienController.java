package com.douglas.mvc_boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AlienController {
  @Autowired
  AlienRepository alienRepository;

  @GetMapping(path = "aliens", produces = { "application/xml" })
  @ResponseBody
  public List<Alien> getAliens() {
    return alienRepository.findAll();
  }

  @GetMapping("alien/{id}")
  @ResponseBody
  public Alien getAlien(@PathVariable("id") int id) {
    return alienRepository.findById(id).orElse(null);
  }

  @PostMapping(path = "/alien", consumes = { MediaType.APPLICATION_XML_VALUE })
  @ResponseBody
  public Alien addAlien(@RequestBody Alien alien) {
    alienRepository.save(alien);

    return alien;
  }

}
