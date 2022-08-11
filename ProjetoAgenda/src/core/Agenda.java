package core;

public class Agenda {

	public static void main(String[] args) {
		BancoDeDados sintaxeBanco = new BancoDeDados();
		
		sintaxeBanco.conectar();
		
		if(sintaxeBanco.estaConectado()) {
			String linha = "===================================";
			
			sintaxeBanco.excluirContato("8");
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
