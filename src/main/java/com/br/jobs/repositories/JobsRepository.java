package com.br.jobs.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.br.jobs.entities.Job;

public interface JobsRepository extends MongoRepository<Job, String> {

}
