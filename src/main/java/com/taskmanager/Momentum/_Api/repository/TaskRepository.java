package com.taskmanager.Momentum._Api.repository;

import com.taskmanager.Momentum._Api.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long>{


}