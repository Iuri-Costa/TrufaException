package com.Pweb.trufaException.service;

import com.Pweb.trufaException.model.Usuario;
import com.Pweb.trufaException.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario criarUsuario(String name, String email, String password) {
        Usuario u = new Usuario();
        u.setName(name);
        u.setEmail(email);
        u.setPassword(password);
        return usuarioRepository.save(u);
    }
    public Usuario buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }
}