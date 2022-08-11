package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BancoDeDados {

	private Connection connection = null;
	private java.sql.Statement statement = null;
	private ResultSet resultset = null;

	// Passagem de par�metro para a conex�o do nosso banco de dados
	public void conectar() {
		// Cria��o da vari�vel para se conectar ao database
		String servidor = "jdbc:mysql://localhost/ibm";
		// Usuario do banco de dados
		String usuario = "root";
		// senha do usuario do banco de dados
		String senha = "root";
		// Vinculando o driver de conex�o
		String driver = "com.mysql.cj.jdbc.Driver";

		// Permite verificar o tratamento da exce��o caso o banco de dados falhar
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

	// Criando o m�todo para fazer a consulta de dados em sql para trazer os
	// registros
	public void listaContatos() {
		try {
			// tratando a exe��o do nosso retorno do select
			String query = "select * from contatos";
			this.resultset = this.statement.executeQuery(query);
			this.statement = this.connection.createStatement();
			// Criando um la�o de repeti��o para retornar os registros da nossa tabela
			while (this.resultset.next()) {
				String meuID = resultset.getString("id");
				String meuNome = resultset.getString("nome");

				System.out.println("id: " + meuID);
				System.out.println("nome: " + meuNome);
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}
	
	//Criando o m�todo de inser��o de registros
	public void inserirContato(String nome) {
		try {
			//linha de execu��o da sintaxe de insert em SQL
			String query="insert into contatos (nome) values ('" + nome + "');";
			System.out.println(query);
			this.statement.executeUpdate(query);
			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	//criando  o m�todo de altera��o de registros
	public void editarContato(String nome, int id) {
		try {
			//linha de execu��o da sintaxe de insert em SQL
			String query="update contatos set nome='" + nome + "' where id='" +  id + "';";
			System.out.println(query);
			this.statement.executeUpdate(query);
			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	//criando o m�todo de exclus�o de registros
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
