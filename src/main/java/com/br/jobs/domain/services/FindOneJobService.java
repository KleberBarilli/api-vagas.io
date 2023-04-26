package com.br.jobs.domain.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.jobs.domain.entities.Job;
import com.br.jobs.domain.repositories.JobsRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FindOneJobService {

    @Autowired
    private JobsRepository jobsRepository;

    public Optional<Job> execute(String id) {
        return this.jobsRepository.findById(id);
    }

}
