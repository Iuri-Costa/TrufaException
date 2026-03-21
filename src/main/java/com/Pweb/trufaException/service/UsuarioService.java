package com.Pweb.trufaException.service;

import com.Pweb.trufaException.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private final List<Usuario> usuarios = new ArrayList<>();
    private long contador = 1L;

    public Usuario criarUsuario(String name, String email, String password) {
        Usuario u = new Usuario();
        u.setId(contador++);
        u.setName(name);
        u.setEmail(email);
        u.setPassword(password);
        usuarios.add(u);
        return u;
    }
}