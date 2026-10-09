package com.taskflow.taskflow.service;

import com.taskflow.taskflow.model.Task;
import com.taskflow.taskflow.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TaskServiceTest {

    @Mock
    private TaskRepository taskRepository; // Mocking the database repository

    @InjectMocks
    private TaskService taskService; // Injecting the mock into our service

    @Test
    public void testCreateTask() {
        // Arrange
        Task task = new Task();
        task.setTitle("Test Task");
        task.setStatus("TODO");
        task.setPriority("HIGH");

        when(taskRepository.save(any(Task.class))).thenReturn(task);

        // Act
        Task createdTask = taskService.createTask(task);

        // Assert
        assertEquals("Test Task", createdTask.getTitle());
        assertEquals("TODO", createdTask.getStatus());
    }
}