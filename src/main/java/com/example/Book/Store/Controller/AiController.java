//package com.example.Book.Store.Controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.reactive.function.client.WebClient;
//import reactor.core.publisher.Mono;
//
//import java.io.*;
//import java.util.Map;
//
//
//@Controller
//public class AiController {
//
//
//    private final String apiUrl = "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.0-pro:generateContent?key=AIzaSyCuGKV1ITMTIaYCXq1HFrAia7N3IUm1cQk";
//    private final String model = "gemini-1.0-pro";
//    private WebClient webClient ;
//    private final String apiKey = "AIzaSyCuGKV1ITMTIaYCXq1HFrAia7N3IUm1cQk";  // Store securely in application.properties
//
//    public AiController(WebClient.Builder webClientBuilder) {
//        this.webClient = webClientBuilder.baseUrl("https://generativelanguage.googleapis.com/v1beta/models/gemini-1.0-pro:generateContent").build();
//    }
//
//    @PostMapping("/gemini")
//    @ResponseBody
//    public Mono<String> gemini(@RequestBody Map<String, String> request) {
//        String message = request.get("message");
//
//        return webClient.post()
//                .uri(uriBuilder -> uriBuilder.queryParam("key", apiKey).build())
//                .bodyValue(Map.of("prompt", Map.of("text", message)))
//                .retrieve()
//                .bodyToMono(String.class);
//    }
//}
////}