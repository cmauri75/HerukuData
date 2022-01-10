package com.example.dataload;

import javax.persistence.*;

@Entity
@Table(name = "userdata")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    public User() {
        super();
    }

    public User(String username) {
        super();
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUname() {
        return username;
    }

    public void setUname(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", uname=" + username + "]";
    }
}