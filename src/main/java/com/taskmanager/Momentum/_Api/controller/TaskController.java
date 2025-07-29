package com.taskmanager.Momentum._Api.controller;

import com.taskmanager.Momentum._Api.model.Task;
import com.taskmanager.Momentum._Api.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
   private TaskService taskService;

   TaskController(TaskService taskService){
       this.taskService=taskService;
   }

   @PostMapping
   public Task createTask(@RequestBody Task task) {
         return taskService.createTask(task);

   }

   @GetMapping
   public List<Task> getAllTasks(){
       return taskService.getAllTasks();
   }

   @GetMapping("/{id}")
   public Optional<Task> getTaskById(@PathVariable Long id){
       return taskService.getTaskById(id);
   }

   @PutMapping("/{id}")
   public Optional<Task> updateTask(@PathVariable Long id, @RequestBody Task taskDetails){
      return Optional.ofNullable(taskService.updateTask(id, taskDetails));
   }

   @DeleteMapping("/{id}")
   public void deleteTask(@PathVariable Long id){
       taskService.deleteTask(id);
       System.out.println("SuccessFully Deleted: ");
   }
}
