package com.microservices.question_service.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.microservices.question_service.model.Question;

public interface QuestionDAO extends JpaRepository<Question, Long> {

  List<Question> findByCategory(String category);

  @Query(value = "SELECT * FROM question q WHERE q.category= :category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
  List<Question> findRandomQuestionsByCategory(String category, Integer numQ);
}
