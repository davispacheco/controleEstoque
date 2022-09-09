package com.modulo5.controleEstoque.DTO;

import com.modulo5.controleEstoque.model.ClienteModel;
import com.modulo5.controleEstoque.model.EnderecoModel;

import java.util.ArrayList;
import java.util.List;

public class ClienteDTO {
    private String nome;
    private List<EnderecoModel> enderecos = new ArrayList<>();

    public ClienteDTO() {

    }

    public ClienteDTO(ClienteModel obj) {
        nome = obj.getNome();
        enderecos = obj.getEnderecos();
    }

    public String getNome() {
        return nome;
    }

    public List<EnderecoModel> getEnderecos() {
        return enderecos;
    }
}
