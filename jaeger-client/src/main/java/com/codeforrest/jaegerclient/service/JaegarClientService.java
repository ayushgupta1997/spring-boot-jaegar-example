package com.codeforrest.jaegerclient.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class JaegarClientService {
   private WebClient webClient;

   public JaegarClientService(WebClient webClient) {
      this.webClient = webClient;
   }
   public Mono<String> get(Integer id) {
      return webClient.get().uri("http://localhost:8082/jaegar/server/" + id)
              .retrieve()
              .bodyToMono(String.class);
   }

}
