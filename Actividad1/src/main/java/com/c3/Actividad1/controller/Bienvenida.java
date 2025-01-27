package com.c3.Actividad1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Controller
public class Bienvenida {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute( "mensaje","Bienvenid@ al sistema");
        String fechaHoy = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        model.addAttribute("fechaHoy",fechaHoy);
        return "index";
    }
}
