package com.Pweb.trufaException.controller;

import com.Pweb.trufaException.model.Usuario;
import com.Pweb.trufaException.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/cadastro")
    public String cadastrar(@ModelAttribute Usuario usuario) {
        usuarioService.criarUsuario(usuario.getName(), usuario.getEmail(), usuario.getPassword());
        System.out.println("Usuário cadastrado:" + usuario.getId());
        return "redirect:/login";
    }
}