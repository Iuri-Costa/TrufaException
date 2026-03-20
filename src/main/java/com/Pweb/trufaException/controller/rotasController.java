package com.Pweb.trufaException.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class rotasController {
    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/cadastro")
    public String register() {
        return "cadastro";
    }
}
