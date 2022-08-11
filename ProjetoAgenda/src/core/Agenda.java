package core;

public class Agenda {

	public static void main(String[] args) {
		BancoDeDados sintaxeBanco = new BancoDeDados();
		
		sintaxeBanco.conectar();
		
		if(sintaxeBanco.estaConectado()) {
			System.out.println("Banco de dados conectado com sucesso!");
			
			//permite chamar a opção read do nosso crud 
			//sintaxeBanco.listaContatos();
			
			//permite chamar a opção insert do nosso crud
			//sintaxeBanco.inserirContato("Josefa Silva");
			
			//permite chamar a opção update do nosso crud
			//sintaxeBanco.editarContato("Cristina Santos", 1);
			
			//permite chamar a opção delete do nosso crud
			//sintaxeBanco.excluirContato("2");
	
		} else {
			System.out.println("Erro na conexão com bando de dados.");
		}

	}

}
