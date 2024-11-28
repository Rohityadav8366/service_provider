package com.example.service_provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ServiceController {
	
	@GetMapping("/home")
    public String homePage() {
        // Returning the name of the Thymeleaf template (base.html will be extended by other templates)
        return "base";
    }
}
