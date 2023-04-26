package com.br.jobs.domain.entities;

public enum JobType {
    FULL_TIME("Full-time"),
    PART_TIME("Part-time"),
    CONTRACT("Contract"),
    INTERNSHIP("Internship"),
    FREELANCE("Freelance");

    private final String label;

    private JobType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
