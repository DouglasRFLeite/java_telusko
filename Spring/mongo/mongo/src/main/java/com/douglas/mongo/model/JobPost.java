package com.douglas.mongo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "JobPost")
public class JobPost {
  private String profile;
  private String desc;
  private int exp;
  private String techs[];
}
