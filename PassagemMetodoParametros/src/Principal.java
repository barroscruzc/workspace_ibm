import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//criando as vari�veis no nosso sistema
		
		String nome, email;
		int idade;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Digite o seu e-mail: ");
		email = teclado.nextLine();
		System.out.println("Entre com a sua idade: ");
		idade = teclado.nextInt();
		
		//Chamando(invocando) a nossa classe e o seu respectivo m�todo com a passagem de par�metros
		MandaMensagem executar = new MandaMensagem();
		executar.mensagem(nome, email, idade);
		
		teclado.close();
	}

}
