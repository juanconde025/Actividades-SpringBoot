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
        ProductoFormController productoFormController = new ProductoFormController();
        return productoFormController.getProductos();
    }
}
