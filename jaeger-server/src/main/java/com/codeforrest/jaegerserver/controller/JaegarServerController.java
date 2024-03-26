package com.codeforrest.jaegerserver.controller;


import com.codeforrest.jaegerserver.service.JaegarServerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/jaegar/server")
public class JaegarServerController {
   private JaegarServerService jaegarServerService;

   public JaegarServerController(JaegarServerService jaegarServerService) {
      this.jaegarServerService = jaegarServerService;
   }
   @GetMapping("/{id}")
   public Mono<String> get(@PathVariable("id") Integer id) {
      return jaegarServerService.get(id);
   }

}
