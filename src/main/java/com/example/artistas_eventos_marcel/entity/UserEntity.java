package com.example.artistas_eventos_marcel.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "USUARIOSDEMARCE")
@Entity
public class UserEntity implements Serializable {
    @GeneratedValue
    @Id
    @Column(name="ID")
    private long id;

    @Column(name="USER")
    private String user;

    @Column(name="NAME")
    private String name;

    @Column(name = "PASSWORD")
    private String password;

    public UserEntity(){

    }

    public UserEntity(long id, String user, String name, String password) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.password = password;
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
