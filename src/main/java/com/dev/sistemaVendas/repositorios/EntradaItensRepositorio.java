package com.dev.sistemaVendas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.sistemaVendas.modelos.EntradaItens;

public interface EntradaItensRepositorio extends JpaRepository<EntradaItens, Long> {

}