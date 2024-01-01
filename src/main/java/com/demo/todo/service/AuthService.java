package com.demo.todo.service;

import com.demo.todo.dto.LoginDto;
import com.demo.todo.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);
    String login(LoginDto loginDto);
}
