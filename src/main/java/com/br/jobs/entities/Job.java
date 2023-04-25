package com.br.jobs.entities;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

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

    private String company;

    private Optional<String> image;

    private String description;

    @Field("hard_skills")
    private List<String> hardSkills;

    @Field("soft_skills")
    private List<String> softSkills;

    private Optional<BigDecimal> salary;

    private String location;

    @Field("is_remote")
    private boolean isRemote;

    private JobType type;

    @Field("apply_link")
    private String applyLink;

}
