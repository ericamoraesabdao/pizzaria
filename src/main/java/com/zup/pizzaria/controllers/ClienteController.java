package com.zup.pizzaria.controllers;

import com.zup.pizzaria.dtos.ClienteDTO;
import com.zup.pizzaria.models.Cliente;
import com.zup.pizzaria.services.ClienteService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ResponseEntity<ClienteDTO> criarCliente(@Valid @RequestBody Cliente cliente) {

        ClienteDTO clienteDTO = clienteService.criarCliente(cliente);
        return ResponseEntity.ok(clienteDTO);
    }

    // Endpoint para listar todos os clientes
    @GetMapping
    public List<ClienteDTO> listarClientes() {
        return clienteService.listarClientes();
    }
}
