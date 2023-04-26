package com.br.jobs.domain.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.br.jobs.domain.entities.Job;

public interface JobsRepository extends MongoRepository<Job, String> {

}
