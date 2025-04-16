package com.douglas.security;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class UserEntity {
  @Id
  private long id;
  private String username;
  private String password;
}
