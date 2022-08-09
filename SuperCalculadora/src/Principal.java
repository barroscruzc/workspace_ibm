import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// instanciando o leitor
		Scanner read = new Scanner(System.in);
		// criando as variáveis
		int num1, num2, opcao;
		String linha = "------------------------";
		
		
		System.out.println(linha + "\nEscreva o número da operação desejada: ");
		System.out.println(" 1 - Somar \n 2 - Subtrair \n 3 - Multiplicar \n 4 - Dividir \n 5 - Sair \n" + linha);
		opcao = read.nextInt();
		
		while (opcao != 5) {
			System.out.println("Primeiro número: ");
			num1 = read.nextInt();
			System.out.println("Segundo número: ");
			num2 = read.nextInt();
			switch (opcao) {
			case 1:
				Somar calculaSoma = new Somar();
				calculaSoma.somar(num1, num2);
				break;

			case 2:
				Subtrair calculaSubtracao = new Subtrair();
				calculaSubtracao.subtrair(num1, num2);
				break;

			case 3:
				Multiplicar calculaMultiplicacao = new Multiplicar();
				calculaMultiplicacao.multiplicar(num1, num2);
				break;

			case 4:
				Dividir calculaDivisao = new Dividir();
				calculaDivisao.dividir(num1, num2);
				break;

			case 5:
				System.out.println("Encerrando...");
				break;
				
			default: 
				System.out.println("Opção inválida!");
				break;
			}
			System.out.println(linha + "\nEscreva o número da operação desejada: ");
			System.out.println(" 1 - Somar \n 2 - Subtrair \n 3 - Multiplicar \n 4 - Dividir \n 5 - Sair \n" + linha);
			opcao = read.nextInt();
		}
		System.out.println("Encerrando...");
		read.close();
	}
}
