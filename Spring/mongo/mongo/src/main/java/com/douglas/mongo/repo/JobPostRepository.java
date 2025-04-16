package com.douglas.mongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.douglas.mongo.model.JobPost;

public interface JobPostRepository extends MongoRepository<JobPost, String> {

}
