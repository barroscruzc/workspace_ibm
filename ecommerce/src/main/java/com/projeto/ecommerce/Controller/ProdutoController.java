package com.projeto.ecommerce.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.ecommerce.Model.Produto;
import com.projeto.ecommerce.Service.IProdutoService;

@RestController
public class ProdutoController {

	@Autowired
	private IProdutoService service;
	
	// recuperar todos os registros
	@GetMapping("/produtos")
	public ArrayList<Produto> recuperarTodos(){
		return service.recuperarTodos();
	}
	
	//recuperar pelo ID
	//@GetMapping("/produtos/{codigo}")
	//public ArrayList<Produto> recuperarPeloCodigo(){
	//	return service.recuperarPeloCodigo(Integer codigo);
	//}
	//
	//cadastrar novo
	//@PostMapping
}
