package com.studentmedicalfacilitator.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Student {

    @NotBlank
    private String name;
    @Id
    private int id;

    public Student(@JsonProperty("id") int id, @JsonProperty("name") String name) {
        this.name = name;
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
