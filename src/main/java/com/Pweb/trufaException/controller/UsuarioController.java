package com.Pweb.trufaException.controller;

import com.Pweb.trufaException.model.Usuario;
import com.Pweb.trufaException.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password,
                        HttpSession session) {

        Usuario usuario = usuarioService.buscarPorEmail(email);

        if (usuario != null && usuario.getPassword().equals(password)) {
            session.setAttribute("usuarioLogado", usuario);
            return "redirect:/index";
        }
        return "redirect:/login";
    }
}