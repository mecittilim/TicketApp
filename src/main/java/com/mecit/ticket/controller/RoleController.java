package com.mecit.ticket.controller;

import com.mecit.ticket.entities.Role;
import com.mecit.ticket.services.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/role")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @GetMapping(name = "/getRoleList")
    public List<Role> getRoleList(){
        return roleService.getRoleList();
    }

    @PostMapping(name = "/addRole")
    public void addRole(@RequestBody() Role role){
        roleService.addRole(role);
    }
}
