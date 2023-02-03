package com.example.carros.controller;

import com.example.carros.persistence.persistence.TituloPersistence;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class TituloController {

    private final TituloPersistence tituloPersistence;

    public TituloController(TituloPersistence tituloPersistence) {
        this.tituloPersistence = tituloPersistence;
    }

    @GetMapping("/mostrarOsTitulos")
    private ResponseEntity<?> mostrarTitulo(){
        return new ResponseEntity<>(tituloPersistence.findAll(), HttpStatus.CREATED);
    }

}
