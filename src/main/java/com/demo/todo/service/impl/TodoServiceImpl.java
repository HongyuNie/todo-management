package com.demo.todo.service.impl;

import com.demo.todo.dto.TodoDto;
import com.demo.todo.entity.Todo;
import com.demo.todo.repository.TodoRepository;
import com.demo.todo.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TodoServiceImpl implements TodoService {
    //dependency
    private TodoRepository todoRepository;

    @Override
    public TodoDto addTodo(TodoDto todoDto) {
        //convert TodoDto to Todo jpa entity
        Todo todo = new Todo();
        todo.setTitle(todoDto.getTitle());
        todo.setDescription(todoDto.getDescription());
        todo.setCompleted(todoDto.isCompleted());

        //save entity to database
        Todo savedTodo = todoRepository.save(todo);

        // convert saved todo jpa entity into todoDto object
        TodoDto savedTodoDto = new TodoDto();
        savedTodoDto.setId(savedTodo.getId());
        savedTodoDto.setTitle(savedTodo.getTitle());
        savedTodoDto.setDescription(savedTodo.getDescription());
        savedTodoDto.setCompleted(savedTodo.isCompleted());

        return savedTodoDto;
    }
}
