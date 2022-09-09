package com.modulo5.controleEstoque.service;

import com.modulo5.controleEstoque.DTO.ClienteDTO;
import com.modulo5.controleEstoque.model.ClienteModel;
import com.modulo5.controleEstoque.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteDTO> buscarTodos() {
        return clienteRepository.findAll();
    }

    public Optional<ClienteModel> buscarPorId(Long codigo) {
        return clienteRepository.findById(codigo);
    }

    public ClienteModel cadastrar(ClienteModel clienteModel) {
        return clienteRepository.save(clienteModel);
    }

    public ClienteModel alterar(ClienteModel clienteModel, Long codigo) {
        return clienteRepository.save(clienteModel);
    }

    public void deletar(Long codigo) {
        clienteRepository.deleteById(codigo);
    }
}
