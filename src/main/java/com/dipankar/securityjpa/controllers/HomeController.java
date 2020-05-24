package com.dipankar.securityjpa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome</h1>");
    }

    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome user</h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome admin</h1>");
    }

    @GetMapping("/error")
    public String error() {
        return ("<h1>Error</h1>");
    }
}
