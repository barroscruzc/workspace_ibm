package com.projeto.ecommerce.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                          //indica que a classe eh armazenavel no banco
@Table(name="departamento")      //nomeia a table
public class Departamento {

	@Column(name="codigo")       //nomeia a coluna
	@Id                          //indica que este será a primary key da tabela
	@GeneratedValue(strategy=GenerationType.IDENTITY)    ///significa que é auto_increment
	private Integer codigo;
	
	@Column(name="nome", length=50, nullable = false)
	private String nome;
	
	@Column(name="descricao", nullable = false)
	private String descricao;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
