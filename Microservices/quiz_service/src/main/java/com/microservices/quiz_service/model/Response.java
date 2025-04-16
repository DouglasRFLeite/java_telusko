package com.microservices.quiz_service.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Response {
  private Long questionId;
  private String response;
}
