package userInterface;
import core.Pessoa;
import core.Estudante;

public class AppUniversidade {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Cristhiane", "nome@email.com", "21 99999 - 9999");
		/*Para setar os atributos do objeto p, caso não houvesse um construtor:
		* p.setNome("Cristhiane");
		* p.setEmail("nome@email.com");
		* p.setTelefone("21 99999-9999");
		*/
		
		System.out.println(p.exibirInfo());
		
		Estudante e = new Estudante("Ana Maria", "anamaria@email.com", "21 90999 - 9999", 12345, "Administração");
		/* e.setNome("Ana Maria");
		* e.setEmail("anamaria@email.com");
		* e.setTelefone("21 99999-9999");
		* e.setNumeroMatricula(12345);
		* e.setCurso("Administração"); 
		*/
		
		System.out.println(e.exibirInfo());

	}

}
