package com.projeto.ecommerce.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.ecommerce.DAO.DepartamentoDAO;
import com.projeto.ecommerce.Model.Departamento;

@RestController
public class ControllerDepartamento {

	@Autowired   //injeção de dependências 
	private DepartamentoDAO departamentoDAO;
	
	@GetMapping("/departamentos")
	private ArrayList<Departamento> listar(){
		ArrayList<Departamento> lista;
		lista = (ArrayList<Departamento>)departamentoDAO.findAll();   //conversão forçada: conversão de um iterable para 
		return lista;                                                 //arraylist de departamento
	};
}
