package core;

public class Estudante extends Pessoa{

	private int numeroMatricula;
	private String curso;
	
	/* Como a superclasse possui um construtor, obrigatoriamente a subclasse
	 * precisa implementar um construtor na primeira linha de c�digo ap�s a
	 * declara��o de atributos. */
	
	public Estudante(String nome, String email, String telefone, int numeroMatricula, String curso) {
		super(nome, email, telefone);
		this.numeroMatricula = numeroMatricula;
		this.curso = curso;
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	/* Aqui fazemos uma sobrescrita de m�todo, ou seja, uma redefini��o
	 * sobrescrita != sobrecarga
	 * sobrecarga s�o v�rias defini��es de um mesmo nome de m�todo 
	 * dentro da mesma classe
	 */
	public String exibirInfo() {
		//this.atributo corresponde aos atributos da classe filha,
		//super.atributo corresponde aos atributos da classe m�e
		return super.nome + "/" + super.email + "/" + super.telefone + "/" + this.curso + "/" + this.numeroMatricula;
	}
}
