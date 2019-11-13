package com.dev.sistemaVendas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.sistemaVendas.modelos.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {

}
