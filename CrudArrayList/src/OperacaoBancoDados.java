import java.util.ArrayList;

public class OperacaoBancoDados {

	public static void main(String[] args) {
		//Criando um procedimento de inserção de registros com ArrayList - CRUD Create
		ArrayList<String> nomeClientes = new ArrayList<String>();
		nomeClientes.add("Petrolina");
		nomeClientes.add("Givanildo");
		nomeClientes.add("Adroaldo");
		nomeClientes.add("Tarciano");
		
		//Modo de visualização de todos os registros alocados na variável nomeClientes
		System.out.println(nomeClientes);
		
		//Visualizando um registro desejado dentro da nossa base - CRUD Read
		System.out.println(nomeClientes.get(1));
		
		//Criando um procedimento de inserção de registros com Arraylist e Set para modificar o registro - CRUD Update
		ArrayList<String> marcas = new ArrayList<String>();
		marcas.add("Fiat");
		marcas.add("Chevrolet");
		marcas.add("Ford");
		marcas.add("BMW");
		System.out.println(marcas);
		marcas.set(2, "Volkswagen");
		System.out.println(marcas);
		
		//Removendo registros dentro da nossa estrutura de ArrayList - CRUD Delete
		marcas.remove(0);
		System.out.println(marcas);
		
		//Retornando a quantidade de registros de um ArrayList
		System.out.println(marcas.size());
		
		//Como utilizar um size dentro do nosso laço de repetição
		for(int contador=0; contador < marcas.size(); contador++) {
			System.out.printf(marcas.get(contador)+ " ");
		}
		
		//For each com String
		for (String contador: marcas) {
			System.out.println(contador);
		}
	
	}

}
