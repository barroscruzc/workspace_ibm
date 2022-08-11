package core;

public class Pessoa {

	
	/*Utilizando a palavra protected, fazemos uma 
	 * abertura de acesso para os métodos da subclasse 
	 * acessarem a estrutura da superclasse, sem a 
	 * necessidade de utilizar métodos get e set.
	 */
	protected String nome;
	protected String email; 
	protected String telefone;
	
	public Pessoa(String nome, String email, String telefone) {
		super(); //essa referência está presente porque todas as classes personalizadas são filhas da classe Object
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String exibirInfo() {
		return nome + "/" + email + "/" + telefone;
	}
}
