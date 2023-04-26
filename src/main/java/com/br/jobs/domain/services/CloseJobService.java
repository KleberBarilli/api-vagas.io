package com.br.jobs.domain.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.jobs.domain.entities.Job;
import com.br.jobs.domain.repositories.JobsRepository;

@Service
public class CloseJobService {

    @Autowired
    private JobsRepository jobsRepository;

    public void execute(String jobId) {
        Optional<Job> jobFound = this.jobsRepository.findById(jobId);

        if (!jobFound.isPresent()) {
            throw new Error("Job not found");
        }
        Job job = jobFound.get();

        job.setOpen(false);

        this.jobsRepository.save(job);

    }
}
