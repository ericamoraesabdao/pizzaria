package com.zup.pizzaria.services;

import com.zup.pizzaria.dtos.PagamentoDTO;
import com.zup.pizzaria.dtos.PedidoDTO;
import com.zup.pizzaria.models.Cliente;
import com.zup.pizzaria.models.Pagamento;
import com.zup.pizzaria.models.Pedido;
import com.zup.pizzaria.repository.ClienteRepository;
import com.zup.pizzaria.repository.PagamentoRepository;
import com.zup.pizzaria.repository.PedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {
    private final PedidoRepository pedidoRepository;
    private final ClienteRepository clienteRepository;
    private final PagamentoRepository pagamentoRepository;

    public PagamentoService(PedidoRepository pedidoRepository, ClienteRepository clienteRepository, PagamentoRepository pagamentoRepository) {
        this.pedidoRepository = pedidoRepository;
        this.clienteRepository = clienteRepository;
        this.pagamentoRepository = pagamentoRepository;
    }

    public PagamentoDTO criarPagamento(Pagamento pagamento) {
        // Salva pagamento
        pagamentoRepository.save(pagamento);

        // Obtenho pedido
        Pedido pedido = pedidoRepository
                .findById(pagamento.getPedidoId())
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));

        // Obtenho cliente
        Cliente cliente = clienteRepository
                .findById(pedido.getClienteId())
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        return new PagamentoDTO(cliente.getNome(), cliente.getEmail(), pedido.getDescricao(), pedido.getValorTotal(), pagamento.getDataHoraPagamento(), pagamento.getFormaPagamento());
    }
}
