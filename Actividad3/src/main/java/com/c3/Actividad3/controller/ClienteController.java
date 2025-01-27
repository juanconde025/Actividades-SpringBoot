package com.c3.Actividad3.controller;

import com.c3.Actividad3.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClienteController {
    @GetMapping("/api/clientes")
    public List<Cliente> getCliente() {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Pablo", 20));
        clientes.add(new Cliente("Pedro", 33));
        clientes.add(new Cliente("Carlos", 45));
        clientes.add(new Cliente("Juan", 18));
        clientes.add(new Cliente("Nicolas", 18));
        clientes.add(new Cliente("Manuel", 18));
        clientes.add(new Cliente("Ariana", 38));
        clientes.add(new Cliente("Daniela", 18));
        clientes.add(new Cliente("Pepe", 30));
        clientes.add(new Cliente("Grillo", 35));

        return clientes;
    }
}
