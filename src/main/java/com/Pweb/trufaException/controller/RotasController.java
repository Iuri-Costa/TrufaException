package com.Pweb.trufaException.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RotasController {

    @GetMapping("/login")
    public String login() {
        return "auth/login";
    }

    @GetMapping("/")
    public String boot(){
        return "home/boot";
    }

    @GetMapping({"/index"})
    public String index(HttpSession session, Model model) {
        Object usuario = session.getAttribute("usuarioLogado");
        model.addAttribute("logado", usuario != null);
        return "home/index";
    }

    @GetMapping("/cadastro")
    public String register() {
        return "auth/cadastro";
    }
}