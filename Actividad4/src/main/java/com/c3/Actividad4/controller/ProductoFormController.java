package com.c3.Actividad4.controller;

import com.c3.Actividad4.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductoFormController {
    @GetMapping("/producto/formulario")
    public String formulario() {
        return "index";
    }

    @PostMapping("producto/registrar")
    public String registrar(@RequestParam String nombre, @RequestParam double precio, @RequestParam String descripcion, Model model) {
        Producto producto = new Producto(nombre, precio, descripcion);

        model.addAttribute("producto", producto);

        return "confirmacion";
    }
}
