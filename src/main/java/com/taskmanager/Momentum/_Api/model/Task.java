package com.taskmanager.Momentum._Api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Task {

    @Id
    @GeneratedValue
    Long id;

    String title;
    String description;
    String status;
    LocalDate dueDate;

}
