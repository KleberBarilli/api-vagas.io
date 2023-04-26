package com.br.jobs.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.br.jobs.domain.entities.Job;
import com.br.jobs.domain.repositories.JobsRepository;
import com.br.jobs.domain.services.CreateJobService;

@SpringBootTest
public class CreateJobServiceTest {

    @InjectMocks
    private CreateJobService createJobService;

    @Mock
    private JobsRepository jobsRepository;

    @Test
    void shouldBeAbleToCreateAJobOpportunity() {
        Job job = new Job();
        job.setCompany("Minha empresa");
        job.setDescription("Descrição do trabalho");
        job.setHardSkills(Arrays.asList("Java", "Spring"));
        job.setSoftSkills(Arrays.asList("Comunicação", "Trabalho em equipe"));
        job.setSalary(new BigDecimal("5000"));
        job.setLocation("São Paulo");
        job.setRemote(true);
        job.setApplyLink("https://www.exemplo.com.br/vagas");
        job.setOpen(true);

        when(jobsRepository.insert(job)).thenReturn(job);

        Job createdJob = createJobService.execute(job);

        assertEquals(job, createdJob);

    }

}
