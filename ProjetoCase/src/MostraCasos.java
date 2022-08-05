import java.util.Scanner;

public class MostraCasos {

	public static void main(String[] args) {
		// Criando um switch case
		Scanner read = new Scanner(System.in);
		int opcao;
		String[] carros = {"Sandero", "Fusion", "Prisma"};
		System.out.println("Escolha a opção desejada abaixo:");
		System.out.println("1 - Mostrar carros da marca Honda \n2 - Mostrar todos os carros");
		opcao = read.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Não temos carros para alocar.");
			break;
		case 2:
			System.out.println(carros[0]);
			System.out.println(carros[1]);
			System.out.println(carros[2]);
			break;
		default:
			System.out.println("Opção escolhida não existe");
		}
		
			

	}

}
