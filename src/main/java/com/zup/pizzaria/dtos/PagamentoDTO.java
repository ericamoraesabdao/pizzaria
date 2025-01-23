package com.zup.pizzaria.dtos;

import com.zup.pizzaria.models.FormaPagamento;

import java.util.Date;

public class PagamentoDTO {
    private String nomeCliente;
    private String emailCliente;
    private String descricaoPedido;
    private Double valorPagoPagamento;
    private Date dataHoraPagamento;
    private FormaPagamento formaPagamento;

    public PagamentoDTO(String nomeCliente, String emailCliente, String descricaoPedido, Double valorPagoPagamento, Date dataHoraPagamento, FormaPagamento formaPagamento) {
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.descricaoPedido = descricaoPedido;
        this.valorPagoPagamento = valorPagoPagamento;
        this.dataHoraPagamento = dataHoraPagamento;
        this.formaPagamento = formaPagamento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getDescricaoPedido() {
        return descricaoPedido;
    }

    public void setDescricaoPedido(String descricaoPedido) {
        this.descricaoPedido = descricaoPedido;
    }

    public Double getValorPagoPagamento() {
        return valorPagoPagamento;
    }

    public void setValorPagoPagamento(Double valorPagoPagamento) {
        this.valorPagoPagamento = valorPagoPagamento;
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
