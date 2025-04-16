package com.microservices.quiz_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.quiz_service.model.Question;
import com.microservices.quiz_service.model.Response;
import com.microservices.quiz_service.service.QuizService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("quiz")
public class QuizController {

  @Autowired
  private QuizService service;

  @PostMapping("create")
  public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ,
      @RequestParam String title) {
    return service.createQuiz(category, numQ, title);
  }

  @GetMapping("getQuestions/{id}")
  public ResponseEntity<List<Question>> getQuizQuestions(@PathVariable Long id) {
    return service.getQuizQuestions(id);
  }

  @PostMapping("submitResponses/{id}")
  public ResponseEntity<Integer> submitQuizResponses(@PathVariable Long id, @RequestBody List<Response> responses) {
    return service.calculateResult(id, responses);
  }

}
