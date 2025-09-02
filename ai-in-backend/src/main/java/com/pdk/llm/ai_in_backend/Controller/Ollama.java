package com.pdk.llm.ai_in_backend.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/ollama")
public class Ollama {

    private ChatClient chatClient;

    public Ollama(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping("/hello")
    public String welcome(@RequestParam(value = "q") String query) {
        var response = this.chatClient.prompt(query).call().content();
        System.out.println(""+response);
        return new String(response);
    }

}
