package com.br.jobs.entities;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Document("jobs")
public class Job {

    @Id
    private String id;

    @NotBlank
    @Size(max = 100)
    private String company;

    private String image;

    @NotBlank
    private String description;

    @Field("hard_skills")
    private List<String> hardSkills;

    @Field("soft_skills")
    private List<String> softSkills;

    @Positive
    private BigDecimal salary;

    @NotBlank
    private String location;

    @Field("is_remote")
    private boolean isRemote;

    private JobType type = JobType.FULL_TIME;

    @NotBlank
    @Field("apply_link")
    private String applyLink;

    @Field("is_open")
    private boolean isOpen = true;

}
