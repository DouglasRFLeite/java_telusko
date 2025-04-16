package com.microservices.question_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.question_service.model.Question;
import com.microservices.question_service.model.Response;
import com.microservices.question_service.service.QuestionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("question")
public class QuestionController {
  @Autowired
  QuestionService service;

  @Autowired
  Environment env;

  @GetMapping("allQuestions")
  public ResponseEntity<List<Question>> getAllQuestions() {
    return service.getAllQuestions();
  }

  @GetMapping("category/{category}")
  public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
    return service.getQuestionsByCategory(category);
  }

  @PostMapping("add")
  public ResponseEntity<String> addQuestion(@RequestBody Question question) {
    return service.addQuestion(question);
  }

  // generate
  @GetMapping("generateQuiz")
  public ResponseEntity<List<Long>> getQuestionsForQuiz(@RequestParam String category,
      @RequestParam Integer numQuestions) {
    return service.getQuestionsForQuiz(category, numQuestions);
  }

  // getQuestions (questionid)
  @PostMapping("getQuestions")
  public ResponseEntity<List<Question>> getQuestionsById(@RequestBody List<Long> questionIdList) {
    System.out.println(env.getProperty("local.server.port"));
    return service.getQuestionsById(questionIdList);
  }

  // getScore
  @PostMapping("getScore")
  public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses) {
    return service.getScore(responses);
  }

}
