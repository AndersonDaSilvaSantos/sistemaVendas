package com.dev.sistemaVendas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.sistemaVendas.modelos.EntradaProduto;

public interface EntradaProdutoRepositorio extends JpaRepository<EntradaProduto, Long> {

}