package core;

/**
 * A classe <b>Agenda</b> é responsável por invocar os métodos existentes na classe <b>BancoDeDados</b>, 
 * para realizar as operações de criação, leitura, atualização e exclusão de registros no banco de dados.
 * @author Cristhiane Barros da Cruz.
 * @since aug 2022.
 * @version 1.0
 *
 */
public class Agenda {

	public static void main(String[] args) {
	
		BancoDeDados sintaxeBanco = new BancoDeDados();
		
		/** Após instanciar um novo objeto da classe BancoDeDados, 
		 * é invocado o método <b>conectar()</b>, que utiliza as informações
		 * necessárias para acesso ao Database.
		 * */
		sintaxeBanco.conectar();
		
		/** Caso a conexão com o Database seja concluída com sucesso, uma das funções CRUD é realizada. */
		if(sintaxeBanco.estaConectado()) {
			String linha = "===================================";
			
			System.out.println(linha + "\nBanco de dados conectado com sucesso!\n" + linha);
			
			//permite chamar a opção read do nosso crud 
			System.out.println("        LISTA DE CONTATOS");
			System.out.println(linha);
			sintaxeBanco.listaContatos();
			
			//permite chamar a opção insert do nosso crud
			//sintaxeBanco.inserirContato("Josefa Silva", "21 99999-9999");
			
			//permite chamar a opção update do nosso crud
			//sintaxeBanco.editarNomeContato("Cristina Santos", 1);
			//sintaxeBanco.editarTelContato("21 99999-9999", 3);
			
			//permite chamar a opção delete do nosso crud
			//sintaxeBanco.excluirContato("2");
	
		} else {
			System.out.println("Erro na conexão com bando de dados.");
		}

	}

}
