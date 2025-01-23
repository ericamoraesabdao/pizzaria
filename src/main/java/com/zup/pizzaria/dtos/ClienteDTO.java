package com.zup.pizzaria.dtos;

import com.zup.pizzaria.models.Cliente;

public class ClienteDTO {
    private Long idCliente;
    private String nomeCliente;
    private String emailCliente;
    private String telefoneCliente;


    public ClienteDTO(Long idCliente, String nomeCliente, String emailCliente, String telefoneCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.telefoneCliente = telefoneCliente;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
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

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }
}
