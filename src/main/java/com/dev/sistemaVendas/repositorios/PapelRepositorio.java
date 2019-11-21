package com.dev.sistemaVendas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.sistemaVendas.modelos.Papel;

public interface PapelRepositorio extends JpaRepository<Papel, Long> {

}