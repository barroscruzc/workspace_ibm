/* ---- Aula sobre POO ----
 * Definindo um novo tipo de dado que ser� utilizado por outras classes/programas java */


public class Produto {

	/* Atributos
	 * � necess�rio declarar as vari�veis que comp�em a estrutura dessa classe*/
	int codigo;
	String descricao;
	double preco;
	
	//M�todo que imprime na tela os atributos do produto
	void mostrarAnuncio () {
		System.out.println("------ PRODUTO EM OFERTA ------");
		System.out.println(codigo + ": " + descricao);
		System.out.printf("R$ %.2f\n", preco);
	}
	
}
