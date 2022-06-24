package com.berke.atmproject.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;

    @ManyToMany
    @JoinTable(
            name = "roles_privileges",
            joinColumns = @JoinColumn(name = "role_id",
            referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "privilege_id",
            referencedColumnName = "id")
    )
    private Collection<Privilege> privileges;

}
