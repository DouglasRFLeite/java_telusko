package com.microservices.question_service.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.microservices.question_service.dao.QuestionDAO;
import com.microservices.question_service.model.Question;
import com.microservices.question_service.model.Response;

@Component
public class QuestionService {
  @Autowired
  private QuestionDAO repository;

  public ResponseEntity<List<Question>> getAllQuestions() {
    try {
      return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
  }

  public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {
    try {
      return new ResponseEntity<>(repository.findByCategory(category), HttpStatus.OK);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
  }

  public ResponseEntity<String> addQuestion(Question question) {
    repository.save(question);
    return new ResponseEntity<>("success", HttpStatus.CREATED);
  }

  public ResponseEntity<List<Long>> getQuestionsForQuiz(String category, Integer numQuestions) {
    return new ResponseEntity<>(
        repository.findRandomQuestionsByCategory(category, numQuestions).stream()
            .map(q -> q.getId()).toList(),
        HttpStatus.OK);
  }

  public ResponseEntity<List<Question>> getQuestionsById(List<Long> questionIdList) {
    List<Question> questions = questionIdList.stream().map(qId -> repository.findById(qId).orElse(null)).toList();

    return new ResponseEntity<>(questions, HttpStatus.OK);
  }

  public ResponseEntity<Integer> getScore(List<Response> responses) {
    return new ResponseEntity<>((int) responses.stream().map(res -> {
      Optional<Question> question = repository.findById(res.getQuestionId());
      return question.isPresent() && question.get().getRightAnswer().equals(res.getResponse());
    }).filter(r -> r == true).count(), HttpStatus.OK);
  }
}
