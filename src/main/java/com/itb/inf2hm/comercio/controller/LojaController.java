package com.itb.inf2hm.comercio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model; 

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	
	@GetMapping("/listar")
	
	public void listarProdutos() {
		System.out.println("Lista de Produtos");
	}
}
