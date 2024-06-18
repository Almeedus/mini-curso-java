package com.almeedus.todolist.user;

public class UserModel {

    private String username;
    private String name;
    private String password;

    //getters - buscar informações
    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
    

    //setters - alterar informações
    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
