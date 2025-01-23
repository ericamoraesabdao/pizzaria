package com.zup.pizzaria.dtos;

public class PedidoDTO {
    private Long idPedido;
    private String nomeCliente;
    private String emailCliente;
    private String descricaoPedido;
    private Long clienteIdPedido;
    private double valorTotalPedido;

    public PedidoDTO(Long idPedido, String nomeCliente, String emailCliente, String descricaoPedido, Long clienteIdPedido, double valorTotalPedido) {
        this.idPedido = idPedido;
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.descricaoPedido = descricaoPedido;
        this.clienteIdPedido = clienteIdPedido;
        this.valorTotalPedido = valorTotalPedido;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Long getClienteIdPedido() {
        return clienteIdPedido;
    }

    public void setClienteIdPedido(Long clienteIdPedido) {
        this.clienteIdPedido = clienteIdPedido;
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

    public double getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(double valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }
}
