package com.microservices.quiz_service.model;

import lombok.Data;

@Data
public class Question {
  private Long id;
  private String questionTitle;
  private String option1;
  private String option2;
  private String option3;
  private String option4;
  private String rightAnswer;
  private String difficultyLevel;
  private String category;
}
