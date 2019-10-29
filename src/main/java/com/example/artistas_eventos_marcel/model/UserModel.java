package com.example.artistas_eventos_marcel.model;

import com.example.artistas_eventos_marcel.entity.UserEntity;

public class UserModel {
    private long id;
    private String user;
    private String name;
    private String password;

    public UserModel(){

    }

    public UserModel(UserEntity user) {
        this.id = user.getId();
        this.user = user.getUser();
        this.name = user.getName();
        this.password = user.getPassword();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
