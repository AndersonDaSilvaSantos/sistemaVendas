package com.dev.sistemaVendas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.sistemaVendas.modelos.ItensCompra;

public interface ItensCompraRepositorio extends JpaRepository<ItensCompra, Long> {

}
