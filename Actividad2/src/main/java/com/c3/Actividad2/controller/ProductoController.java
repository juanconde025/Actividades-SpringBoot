package com.c3.Actividad2.controller;

import com.c3.Actividad2.model.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {
    @GetMapping("/api/producto")
    public Producto getProducto() {
        return new Producto("Gorra Nachonal Soy del Verde Soy Feliz",20.000,"Gorra del mas grande del pais");
    }

}
