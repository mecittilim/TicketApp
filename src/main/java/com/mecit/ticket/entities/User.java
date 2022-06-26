package com.mecit.ticket.entities;

import lombok.*;
import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private  String lastName;
    @Column(name = "age")
    private int age;
    @Column(name = "gender")
    private String gender;
    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id")
    private Role role;*/
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;

}
