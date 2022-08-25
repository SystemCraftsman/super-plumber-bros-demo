package com.redhat.training.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

public class Plumber extends PanacheEntityBase {

    private Long id;
    private String name;
    private PlumberStatus status;
    private Long score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlumberStatus getStatus() {
        return status;
    }

    public void setStatus(PlumberStatus status) {
        this.status = status;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }
}
