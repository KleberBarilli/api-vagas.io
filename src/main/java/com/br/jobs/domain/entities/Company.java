package com.br.jobs.domain.entities;

import java.util.Optional;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document("companies")
public class Company {

    @Id
    private String id;

    private String name;

    private Optional<String> description;

    @Field("photo_url")
    private Optional<String> photoUrl;
}
