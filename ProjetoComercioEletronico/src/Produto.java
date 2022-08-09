/* ---- Aula sobre POO ----
 * Definindo um novo tipo de dado que será utilizado por outras classes/programas java */


public class Produto {

	/* Atributos
	 * é necessário declarar as variáveis que compõem a estrutura dessa classe*/
	int codigo;
	String descricao;
	double preco;
	
	//Método que imprime na tela os atributos do produto
	void mostrarAnuncio () {
		System.out.println("------ PRODUTO EM OFERTA ------");
		System.out.println(codigo + ": " + descricao);
		System.out.printf("R$ %.2f\n", preco);
	}
	
}
