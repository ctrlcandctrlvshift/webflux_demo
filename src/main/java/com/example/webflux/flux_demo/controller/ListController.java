package com.example.webflux.flux_demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class ListController {
    @GetMapping("/test")
    public Mono<String> testC(){
        log.info(Thread.currentThread().getName()+"   "+"this is webFlux");
        return Mono.just("This is webFlux");
    }
}