package com.dipankar.securityjpa.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter @Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private  String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "roles")
    private String roles;
}
