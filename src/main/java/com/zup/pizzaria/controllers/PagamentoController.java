package com.zup.pizzaria.controllers;

import com.zup.pizzaria.dtos.PagamentoDTO;
import com.zup.pizzaria.dtos.PedidoDTO;
import com.zup.pizzaria.models.Pagamento;
import com.zup.pizzaria.models.Pedido;
import com.zup.pizzaria.services.PagamentoService;
import com.zup.pizzaria.services.PedidoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pagamento")
public class PagamentoController {
    private final PagamentoService pagamentoService;

    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @PostMapping
    public ResponseEntity<PagamentoDTO> criarPedido(@Valid @RequestBody Pagamento pagamento) {
        PagamentoDTO pagamentoDTO = pagamentoService.criarPagamento(pagamento);
        return ResponseEntity.ok(pagamentoDTO);
    }
}

