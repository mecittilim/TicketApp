package com.mecit.ticket.services;

import com.mecit.ticket.entities.Role;

import java.util.List;

public interface IRoleService {
    void addRole(Role role);
    void deleteRole(Role role);
    Role getRoleById(Long roleId);

    List<Role> getRoleList();
}
