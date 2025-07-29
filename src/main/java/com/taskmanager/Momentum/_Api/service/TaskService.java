package com.taskmanager.Momentum._Api.service;

import com.taskmanager.Momentum._Api.model.Task;
import com.taskmanager.Momentum._Api.repository.TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    TaskService(TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }

    public Task createTask(Task task){
        task.setStatus("Pending");
        return taskRepository.save(task);
    }

     public List<Task> getAllTasks(){
        return taskRepository.findAll();
     }


     public Optional<Task> getTaskById(@PathVariable Long id){
           return taskRepository.findById(id);
     }

     public Task updateTask(Long id,Task taskDetails){
        Optional<Task> optionalTask=taskRepository.findById(id);

        if(optionalTask.isPresent()){
          Task exsitingTask=optionalTask.get();
          exsitingTask.setTitle(taskDetails.getTitle());
          exsitingTask.setDescription(taskDetails.getDescription());
          exsitingTask.setStatus(taskDetails.getStatus());
          exsitingTask.setDueDate(taskDetails.getDueDate());
          return taskRepository.save(exsitingTask);
        }

        return null;
     }


     public void deleteTask(Long id){
        taskRepository.deleteById(id);
     }
}
