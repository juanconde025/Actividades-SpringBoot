package com.c3.Actividad4.controller;

import com.c3.Actividad4.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductoFormController {

    private static final List<Producto> productos = new ArrayList<>();

    @GetMapping("/producto/formulario")
    public String mostrarFormulario() {
        return "index";
    }

    @PostMapping("/producto/registrar")
    public String registrarProducto(
            @RequestParam("nombre") String nombre,
            @RequestParam("precio") double precio,
            @RequestParam("descripcion") String descripcion,
            Model model) {

        Producto producto = new Producto(nombre, precio, descripcion);
        productos.add(producto);

        model.addAttribute("producto", producto);

        return "confirmacion";
    }

    public List<Producto> getProductos() {
        return productos;
    }

}
