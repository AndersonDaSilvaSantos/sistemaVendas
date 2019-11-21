package com.dev.sistemaVendas.controle;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dev.sistemaVendas.modelos.Cidade;
import com.dev.sistemaVendas.modelos.Cidade;
import com.dev.sistemaVendas.repositorios.CidadeRepositorio;
import com.dev.sistemaVendas.repositorios.EstadoRepositorio;
import com.dev.sistemaVendas.repositorios.FuncionarioRepositorio;

@Controller
public class NegadoControle {
	

	@GetMapping("/negado")
	public ModelAndView cadastrar(Cidade cidade) {
		ModelAndView mv =  new ModelAndView("/negado");
		
		return mv;
	}
	
	

}