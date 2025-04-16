package com.microservices.quiz_service.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.microservices.quiz_service.model.Question;
import com.microservices.quiz_service.model.Response;

@FeignClient("QUESTION-SERVICE")
public interface QuestionFeignInterface {

  // generate
  @GetMapping("question/generateQuiz")
  public ResponseEntity<List<Long>> getQuestionsForQuiz(@RequestParam String category,
      @RequestParam Integer numQuestions);

  // getQuestions (questionid)
  @PostMapping("question/getQuestions")
  public ResponseEntity<List<Question>> getQuestionsById(@RequestBody List<Long> questionIdList);

  // getScore
  @PostMapping("question/getScore")
  public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses);
}
