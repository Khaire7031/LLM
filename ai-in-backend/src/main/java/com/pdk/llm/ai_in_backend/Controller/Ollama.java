package com.pdk.llm.ai_in_backend.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/ollama")
public class Ollama {

    @GetMapping("/hello")
    public String welcome() {
        return new String("Welcome to Ollama Controller");
    }

}
