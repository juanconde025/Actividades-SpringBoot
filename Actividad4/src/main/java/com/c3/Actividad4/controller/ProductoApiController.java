package com.c3.Actividad4.controller;

import com.c3.Actividad4.model.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductoApiController {
    @GetMapping("/api/productos")
    public List<Producto> getProductos() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Gorra del verde", 20.00,"Gorra del mas grANde"));
        productos.add(new Producto("Camisa del verde", 50.00,"Camisa Local del mas grANde"));
        productos.add(new Producto("Zapas del verde", 100.00,"Zapas del mas grANde"));

        return productos;
    }
}
