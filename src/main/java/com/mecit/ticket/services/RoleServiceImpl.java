package com.mecit.ticket.services;

import com.mecit.ticket.entities.Role;
import com.mecit.ticket.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService{
    @Autowired
    RoleRepository roleRepository;

    @Override
    public void addRole(Role role) {
        roleRepository.save(role);
    }

    @Override
    public void deleteRole(Role role) {
        roleRepository.delete(role);
    }

    @Override
    public Role getRoleById(Long roleId) {
        return roleRepository.getReferenceById(roleId);
    }

    @Override
    public List<Role> getRoleList() {
        return roleRepository.findAll();
    }
}
