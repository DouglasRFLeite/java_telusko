package com.microservices.quiz_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.microservices.quiz_service.dao.QuizRepository;
import com.microservices.quiz_service.feign.QuestionFeignInterface;
import com.microservices.quiz_service.model.Question;
import com.microservices.quiz_service.model.Quiz;
import com.microservices.quiz_service.model.Response;

@Service
public class QuizService {

  @Autowired
  private QuizRepository repository;

  @Autowired
  private QuestionFeignInterface questionInterface;

  public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
    List<Long> questionIdList = questionInterface.getQuestionsForQuiz(category, numQ).getBody();

    Quiz quiz = new Quiz();
    quiz.setQuestionIdList(questionIdList);
    quiz.setTitle(title);

    repository.save(quiz);

    return new ResponseEntity<>("Success", HttpStatus.OK);
  }

  public ResponseEntity<List<Question>> getQuizQuestions(Long id) {
    Quiz quiz = repository.findById(id).get();
    List<Question> questions = questionInterface.getQuestionsById(quiz.getQuestionIdList()).getBody();

    return new ResponseEntity<>(questions, HttpStatus.OK);
  }

  public ResponseEntity<Integer> calculateResult(Long id, List<Response> responses) {
    Integer score = questionInterface.getScore(responses).getBody();
    return new ResponseEntity<>(score, HttpStatus.OK);
  }

}
