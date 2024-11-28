package com.empresa.proyecto.azure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class HomeController {

    @GetMapping
    public ResponseEntity<Object> main(){
        return ResponseEntity.ok("Exito");
    }
}
