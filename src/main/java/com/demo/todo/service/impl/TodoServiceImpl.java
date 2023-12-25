package com.demo.todo.service.impl;

import com.demo.todo.dto.TodoDto;
import com.demo.todo.entity.Todo;
import com.demo.todo.repository.TodoRepository;
import com.demo.todo.service.TodoService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TodoServiceImpl implements TodoService {
    //dependency
    private TodoRepository todoRepository;
    private ModelMapper modelMapper;

    @Override
    public TodoDto addTodo(TodoDto todoDto) {
        //convert TodoDto to Todo jpa entity
        Todo todo = modelMapper.map(todoDto, Todo.class);

        //save entity to database
        Todo savedTodo = todoRepository.save(todo);

        // convert saved todo jpa entity into todoDto object
        TodoDto savedTodoDto = modelMapper.map(savedTodo, TodoDto.class);

        return savedTodoDto;
    }
}
