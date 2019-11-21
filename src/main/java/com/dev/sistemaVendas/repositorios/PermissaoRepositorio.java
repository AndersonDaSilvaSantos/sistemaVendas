package com.dev.sistemaVendas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.sistemaVendas.modelos.Permissao;

public interface PermissaoRepositorio extends JpaRepository<Permissao, Long> {

}
