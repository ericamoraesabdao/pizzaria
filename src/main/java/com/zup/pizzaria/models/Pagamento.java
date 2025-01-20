package com.zup.pizzaria.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.util.Date;

@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    @Positive
    private double valorPago;
    @NotEmpty
    private Long pedidoId;
    @NotEmpty
    private Date dataHoraPagamento;
    @Enumerated(EnumType.STRING)
    @NotEmpty
    private FormaPagamento formaPagamento;

    public Pagamento(double valorPago, Long pedidoId, Date dataHoraPagamento, FormaPagamento formaPagamento) {
        this.valorPago = valorPago;
        this.pedidoId = pedidoId;
        this.dataHoraPagamento = dataHoraPagamento;
        this.formaPagamento = formaPagamento;
    }

    public void validarPagamento(double valorTotal) {

        if (getValorPago() < valorTotal) {
            throw new IllegalArgumentException("O valor pago não pode ser menor que o valor total do pedido.");
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Date getDataHoraPagamento() {
        return dataHoraPagamento;
    }

    public void setDataHoraPagamento(Date dataHoraPagamento) {
        this.dataHoraPagamento = dataHoraPagamento;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
