package com.dev.sistemaVendas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.sistemaVendas.modelos.Funcionario;

public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Long> {

}
