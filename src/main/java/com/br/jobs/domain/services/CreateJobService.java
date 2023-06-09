package com.br.jobs.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.br.jobs.domain.entities.Job;
import com.br.jobs.domain.repositories.JobsRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CreateJobService {

    @Autowired
    private JobsRepository jobsRepository;

    @Transactional
    public Job execute(Job job) {
        return this.jobsRepository.insert(job);
    }
}
