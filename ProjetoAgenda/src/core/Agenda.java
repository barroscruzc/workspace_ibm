package core;

public class Agenda {

	public static void main(String[] args) {
		BancoDeDados sintaxeBanco = new BancoDeDados();
		
		sintaxeBanco.conectar();
		
		if(sintaxeBanco.estaConectado()) {
			System.out.println("Banco de dados conectado com sucesso!");
			
			//permite chamar a op��o read do nosso crud 
			//sintaxeBanco.listaContatos();
			
			//permite chamar a op��o insert do nosso crud
			//sintaxeBanco.inserirContato("Josefa Silva");
			
			//permite chamar a op��o update do nosso crud
			//sintaxeBanco.editarContato("Cristina Santos", 1);
			
			//permite chamar a op��o delete do nosso crud
			//sintaxeBanco.excluirContato("2");
	
		} else {
			System.out.println("Erro na conex�o com bando de dados.");
		}

	}

}
