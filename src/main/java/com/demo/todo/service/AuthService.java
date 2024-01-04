package com.demo.todo.service;

import com.demo.todo.dto.JwtAuthResponse;
import com.demo.todo.dto.LoginDto;
import com.demo.todo.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);
    JwtAuthResponse login(LoginDto loginDto);
}
