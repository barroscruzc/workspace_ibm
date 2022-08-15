package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BancoDeDados {

	private Connection connection = null;
	private java.sql.Statement statement = null;
	private ResultSet resultset = null;

	// Passagem de parâmetro para a conexão do nosso banco de dados
	public void conectar() {
		// Criação da variável para se conectar ao database
		String servidor = "jdbc:mysql://localhost/ibm";
		// Usuario do banco de dados
		String usuario = "root";
		// senha do usuario do banco de dados
		String senha = "root";
		// Vinculando o driver de conexão
		String driver = "com.mysql.cj.jdbc.Driver";

		// Permite verificar o tratamento da exceção caso o banco de dados falhar
		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public boolean estaConectado() {
		if (this.connection != null) {
			return true;
		} else {
			return false;
		}
	}

	// Criando o método para fazer a consulta de dados em sql para trazer os
	// registros
	public void listaContatos() {
		try {
			// tratando a exeção do nosso retorno do select
			String query = "select * from contatos";
			this.resultset = this.statement.executeQuery(query);
			this.statement = this.connection.createStatement();
			// Criando um laço de repetição para retornar os registros da nossa tabela
			while (this.resultset.next()) {
				String meuID = resultset.getString("id");
				String meuNome = resultset.getString("nome");
				String meuTel = resultset.getString("telefone");

				System.out.println("ID: " + meuID + "\nNome: " + meuNome + "\nTelefone: " + meuTel);
				System.out.println("-----------------------------------");
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}
	
	//Criando o método de inserção de registros
	public void inserirContato(String nome, String telefone) {
		try {
			//linha de execução da sintaxe de insert em SQL
			String query="insert into contatos (nome, telefone) values ('" + nome + "', '" + telefone + "');";
			System.out.println(query);
			this.statement.executeUpdate(query);
			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	//criando  o método de alteração de registros
	public void editarNomeContato(String nome, int id) {
		try {
			//linha de execução da sintaxe de insert em SQL
			String query="update contatos set nome='" + nome + "' where id='" +  id + "';";
			System.out.println(query);
			this.statement.executeUpdate(query);
			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public void editarTelContato(String telefone, int id) {
		try {
			//linha de execução da sintaxe de insert em SQL
			String query="update contatos set telefone='" + telefone + "' where id='" +  id + "';";
			System.out.println(query);
			this.statement.executeUpdate(query);
			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	//criando o método de exclusão de registros
	public void excluirContato(String id) {
		try {
			String query = "delete from contatos where id='" + id + "';";
			System.out.println(query);
			this.statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
