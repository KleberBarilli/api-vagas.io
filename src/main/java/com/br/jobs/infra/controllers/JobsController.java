package com.br.jobs.infra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.jobs.domain.entities.Job;
import com.br.jobs.domain.services.CreateJobService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/jobs")
@AllArgsConstructor
public class JobsController {

    @Autowired
    private CreateJobService createJobService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Job add(@Valid @RequestBody Job job) {
        return createJobService.execute(job);
    }

}
