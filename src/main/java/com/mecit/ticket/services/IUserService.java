package com.mecit.ticket.services;


import com.mecit.ticket.entities.User;

import java.util.List;

public interface IUserService {
    void addUser(User user);
    List<User> getUserList();
    User getUserByUsername(String username);
    void deleteUser(Long userId);

}
