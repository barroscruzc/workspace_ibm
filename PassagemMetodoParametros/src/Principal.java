import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//criando as variáveis no nosso sistema
		
		String nome, email;
		int idade;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Digite o seu e-mail: ");
		email = teclado.nextLine();
		System.out.println("Entre com a sua idade: ");
		idade = teclado.nextInt();
		
		//Chamando(invocando) a nossa classe e o seu respectivo método com a passagem de parâmetros
		MandaMensagem executar = new MandaMensagem();
		executar.mensagem(nome, email, idade);
		
		teclado.close();
	}

}
