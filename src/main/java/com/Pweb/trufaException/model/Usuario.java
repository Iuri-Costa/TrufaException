package com.Pweb.trufaException.model;

public class Usuario {
    private Long id;
    private String name;
    private String email;
    private String password;

    public Usuario() {
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }

    public void setId(Long id) { this.id = id; }
    public void setName(String nome) { this.name = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String senha) { this.password = senha; }
}