package com.br.jobs.services;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.jobs.entities.Job;
import com.br.jobs.entities.JobType;
import com.br.jobs.repositories.JobsRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CreateJobService {

    @Autowired
    private JobsRepository jobsRepository;

    public Job execute() {
        var job = new Job();
        System.out.println("SERVICE");
        job.setApplyLink("Apply");
        job.setCompany("Company");
        job.setHardSkills(Arrays.asList("node", "java", "web development"));
        job.setSoftSkills(Arrays.asList("communication", "troubleshooting"));
        job.setSalary(new BigDecimal("10000"));
        job.setType(JobType.CONTRACT);
        job.setDescription("DESCRIPTION");
        job.setRemote(false);
        job.setLocation("SP");

        return this.jobsRepository.insert(job);
    }
}
