package me.dio.service;

import me.dio.domain.model.User;

public interface UserService {
    User findById(int id);
    User create(User user);
}