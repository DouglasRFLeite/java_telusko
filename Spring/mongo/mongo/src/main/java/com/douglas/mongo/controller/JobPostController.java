package com.douglas.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.douglas.mongo.model.JobPost;
import com.douglas.mongo.repo.JobPostRepository;

@RestController
@RequestMapping("/")
public class JobPostController {

  @Autowired
  JobPostRepository repository;

  @GetMapping("allJobs")
  public List<JobPost> getAllPosts() {
    return repository.findAll();
  }

  @GetMapping("job/{searchText}")
  public List<JobPost> searchJob(@PathVariable String searchText) {
    return repository.findAll();
  }

  @PostMapping("addJob")
  public JobPost postMethodName(@RequestBody JobPost jobPost) {
    jobPost = repository.save(jobPost);

    return jobPost;
  }

}
