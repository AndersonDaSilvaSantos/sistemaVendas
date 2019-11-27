package com.dev.sistemaVendas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.sistemaVendas.modelos.Compra;

public interface CompraRepositorio extends JpaRepository<Compra, Long> {

}
