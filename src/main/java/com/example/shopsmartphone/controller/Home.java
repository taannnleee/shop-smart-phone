package com.example.shopsmartphone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Home {
    @GetMapping("/")
    public String login(Model model){
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(Model model, @RequestParam String username, @RequestParam String password) {
        if (username.equals("admin") && password.equals("123")) {
            return "main"; // Chuyển hướng đến trang "main.html"
        } else {
            model.addAttribute("error", "Tên đăng nhập hoặc mật khẩu không đúng.");
            return "login";
        }
    }
}
