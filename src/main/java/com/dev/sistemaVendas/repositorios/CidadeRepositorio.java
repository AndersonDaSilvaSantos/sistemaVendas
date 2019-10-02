package com.dev.sistemaVendas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.sistemaVendas.modelos.Cidade;

public interface CidadeRepositorio extends JpaRepository<Cidade, Long> {

}
