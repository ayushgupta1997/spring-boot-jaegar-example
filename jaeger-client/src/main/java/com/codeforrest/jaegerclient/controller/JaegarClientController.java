package com.codeforrest.jaegerclient.controller;

import com.codeforrest.jaegerclient.service.JaegarClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/jaegar/client")
public class JaegarClientController {
   private JaegarClientService jaegarClientService;

   public JaegarClientController(JaegarClientService jaegarClientService) {
      this.jaegarClientService = jaegarClientService;
   }
   @GetMapping("/{id}")
   public Mono<String> get(@PathVariable("id") Integer id) {
      return jaegarClientService.get(id);
   }

}
