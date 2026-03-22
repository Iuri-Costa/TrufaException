package com.Pweb.trufaException.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RotasController {
    @GetMapping({"/", "/index"})
    public String index() {
        return "home/index";
    }
    @GetMapping("/login")
    public String login() {
        return "auth/login";
    }
    @GetMapping("/cadastro")
    public String register() {
        return "auth/cadastro";
    }
}
