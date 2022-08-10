/* ---- Aula sobre POO ----
 * Definindo um novo tipo de dado que será utilizado por outras classes/programas java */


public class Produto {

	/* Atributos
	 * é necessário declarar as variáveis que compõem a estrutura dessa classe
	 * Encapsulamento
	 * ao deixar os atributos privados, somente é possível acessar e modificar essas informações 
	 * com métodos da própria classe, tornando a aplicação mais segura*/
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

	//Definindo os getters e setters (métodos para setar ou recuperar as informações contidas nos atributos	
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

	//Métodos Void (sem retorno)
	//Método que imprime na tela os atributos do produto
	public void mostrarAnuncio () {
		System.out.println("------ PRODUTO EM OFERTA ------");
		System.out.println(codigo + ": " + descricao);
		System.out.printf("R$ %.2f\n", preco);
	}
	
	//métodos que recebem entradas (parâmetros)
	void modificarPreco(double novoPreco) {
		preco = novoPreco;
	}
	
	void aplicarDesconto(double percentual) {
		preco = preco - preco * percentual / 100;
	}
	
	//método com retorno
	double simularDesconto(double percentual) {
		double precoSimulado;
		precoSimulado = preco - preco * percentual / 100;
		return precoSimulado;
	}
}
