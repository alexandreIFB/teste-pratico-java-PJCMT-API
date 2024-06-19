package br.gov.alexandre.teste_pratico_java_pjcmt_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordAPI {

    @GetMapping
    public String get() {
        return "Hello Word";
    }
}
