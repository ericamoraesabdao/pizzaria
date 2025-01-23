package com.zup.pizzaria.services;

import com.zup.pizzaria.dtos.ClienteDTO;
import com.zup.pizzaria.models.Cliente;
import com.zup.pizzaria.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ClienteDTO criarCliente(Cliente cliente) {
        // Salva cliente
        clienteRepository.save(cliente);
        return new ClienteDTO(cliente.getId(), cliente.getNome(), cliente.getEmail(), cliente.getTelefone());
    }
    public List<ClienteDTO> listarClientes() {
        List<Cliente> clientes = clienteRepository.findAll();
        // Convertendo a lista de entidades para uma lista de DTOs
        return clientes.stream()
                .map(cliente -> new ClienteDTO(cliente.getId(), cliente.getNome(), cliente.getEmail(), cliente.getTelefone()))
                .collect(Collectors.toList());
    }
}
