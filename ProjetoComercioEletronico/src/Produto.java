/* ---- Aula sobre POO ----
 * Definindo um novo tipo de dado que ser� utilizado por outras classes/programas java */


public class Produto {

	/* Atributos
	 * � necess�rio declarar as vari�veis que comp�em a estrutura dessa classe
	 * Encapsulamento
	 * ao deixar os atributos privados, somente � poss�vel acessar e modificar essas informa��es 
	 * com m�todos da pr�pria classe, tornando a aplica��o mais segura*/
	private int codigo;
	private String descricao;
	private double preco;
	
	//Construtores
	
	public Produto() {
		super();
	}
	
	public Produto(int codigo, String descricao, double preco) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}

	//Definindo os getters e setters (m�todos para setar ou recuperar as informa��es contidas nos atributos	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	//M�todos Void (sem retorno)
	//M�todo que imprime na tela os atributos do produto
	public void mostrarAnuncio () {
		System.out.println("------ PRODUTO EM OFERTA ------");
		System.out.println(codigo + ": " + descricao);
		System.out.printf("R$ %.2f\n", preco);
	}
	
	//m�todos que recebem entradas (par�metros)
	void modificarPreco(double novoPreco) {
		preco = novoPreco;
	}
	
	void aplicarDesconto(double percentual) {
		preco = preco - preco * percentual / 100;
	}
	
	//m�todo com retorno
	double simularDesconto(double percentual) {
		double precoSimulado;
		precoSimulado = preco - preco * percentual / 100;
		return precoSimulado;
	}
}
