package com.example.demo.service;
import lombok.extern.java.Log;

@Log
public class EjemploClase {

    public void metodoEjemplo() {
        log.fine("Este es un mensaje de debug");
        log.info("Este es un mensaje de info");
        log.severe("Este es un mensaje de error");
    }
}