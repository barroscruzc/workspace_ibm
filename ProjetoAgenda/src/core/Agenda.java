package core;

/**
 * A classe <b>Agenda</b> � respons�vel por invocar os m�todos existentes na classe <b>BancoDeDados</b>, 
 * para realizar as opera��es de cria��o, leitura, atualiza��o e exclus�o de registros no banco de dados.
 * @author Cristhiane Barros da Cruz.
 * @since aug 2022.
 * @version 1.0
 *
 */
public class Agenda {

	public static void main(String[] args) {
	
		BancoDeDados sintaxeBanco = new BancoDeDados();
		
		/** Ap�s instanciar um novo objeto da classe BancoDeDados, 
		 * � invocado o m�todo <b>conectar()</b>, que utiliza as informa��es
		 * necess�rias para acesso ao Database.
		 * */
		sintaxeBanco.conectar();
		
		/** Caso a conex�o com o Database seja conclu�da com sucesso, uma das fun��es CRUD � realizada. */
		if(sintaxeBanco.estaConectado()) {
			String linha = "===================================";
			
			System.out.println(linha + "\nBanco de dados conectado com sucesso!\n" + linha);
			
			//permite chamar a op��o read do nosso crud 
			System.out.println("        LISTA DE CONTATOS");
			System.out.println(linha);
			sintaxeBanco.listaContatos();
			
			//permite chamar a op��o insert do nosso crud
			//sintaxeBanco.inserirContato("Josefa Silva", "21 99999-9999");
			
			//permite chamar a op��o update do nosso crud
			//sintaxeBanco.editarNomeContato("Cristina Santos", 1);
			//sintaxeBanco.editarTelContato("21 99999-9999", 3);
			
			//permite chamar a op��o delete do nosso crud
			//sintaxeBanco.excluirContato("2");
	
		} else {
			System.out.println("Erro na conex�o com bando de dados.");
		}

	}

}
