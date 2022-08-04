import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		
		//instanciando o scanner
		Scanner read = new Scanner(System.in);
		//criando as variáveis
		int num1;
		int num2;
		int opcao;
		float resultado = 0;
		String operacao = null;
		
		System.out.println("Escreva o número da operação desejada: ");
		System.out.println(" 1 - Somar \n 2 - Subtrair \n 3 - Multiplicar \n 4 - Dividir \n 5 - Sair");
		opcao = read.nextInt();
		if ((opcao < 1) || (opcao > 5)) {
			System.out.println("Opção Inválida!");
			System.out.println("Escreva o número da operação desejada: ");
			System.out.println(" 1 - Somar \n 2 - Subtrair \n 3 - Multiplicar \n 4 - Dividir \n 5 - Sair");
			opcao = read.nextInt();
		}
		while (opcao != 5) {
			System.out.println("Entre com o primeiro valor: ");
			num1 = read.nextInt();
			System.out.println("Digite o segundo número: ");
			num2 = read.nextInt();
			switch(opcao) {
			case 1:		
				operacao = "SOMA"; 
				resultado = num1 + num2;
				break;
			case 2:		
				operacao = "SUBTRAÇÃO"; 
				resultado = num1 - num2;
				break;
				
			case 3:		
				operacao = "MULTIPLICAÇÃO"; 
				resultado = num1 * num2;
				break;
				
			case 4:		
				operacao = "DIVISÃO"; 
				resultado = num1 / num2;
				break;
		}
			System.out.println("O resultado da " + operacao + " entre " + num1 + " e " + num2 + " é: " + resultado);
			System.out.println("\nEscreva o número da operação desejada: ");
			System.out.println(" 1 - Somar \n 2 - Subtrair \n 3 - Multiplicar \n 4 - Dividir \n 5 - Sair");
			opcao = read.nextInt();
		}
		System.out.println("Encerrando...");
		}

}
