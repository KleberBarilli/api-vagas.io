package com.br.jobs.infra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.jobs.domain.entities.Job;
import com.br.jobs.domain.services.CloseJobService;
import com.br.jobs.domain.services.CreateJobService;
import com.br.jobs.domain.services.FindOneJobService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/jobs")
@AllArgsConstructor
public class JobsController {

    @Autowired
    private CreateJobService createJobService;

    @Autowired
    private FindOneJobService findOneJobService;

    @Autowired
    private CloseJobService closeJobService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Job add(@Valid @RequestBody Job job) {
        return this.createJobService.execute(job);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> findOne(@PathVariable String id) {
        return this.findOneJobService.execute(id)
                .map(job -> ResponseEntity.ok(job))
                .orElse(ResponseEntity.notFound().build());
    }

    @PatchMapping("/{id}/close")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void closeJob(@PathVariable String id) {
        this.closeJobService.execute(id);
    }

}
