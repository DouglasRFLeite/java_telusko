package com.jdbc.spring_jdbc.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Scope("prototype")
public class Alien {
  private int id;
  private String name;
  private String tech;
}
