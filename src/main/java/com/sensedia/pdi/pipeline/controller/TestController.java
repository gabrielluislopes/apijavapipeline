package com.sensedia.pdi.pipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TestController {

    @GetMapping
    public void teste() {
        System.out.println("Está funcionando. ESTÁ FUNCIONANDO!!!");
    }
}
