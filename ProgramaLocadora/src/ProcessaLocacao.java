import java.util.Scanner;

public class ProcessaLocacao {

	public static void main(String[] args) {
		String[] carros = new String[]{ "Fiat Mobi", "Renault Kwid", "Fiat Argo", "Volkwagen Gol", "Chevrolet Onix", "Hyunday HB20", "Volkswagen Polo", "Renault Sandero", "Renault Kwid", "Volkswagen Saveiro" };
		System.out.println("     ___________\r\n"
				+ "    //   |||   \\\\\r\n"
				+ " __//____|||____\\\\____\r\n"
				+ "| _|      |       _  ||\r\n"
				+ "|/ \\______|______/ \\_|| \r\n"
				+ "_\\_/_____________\\_/_______\r\n"
				+ "");
		System.out.println("---LOCADORA DE VE�CULOS---- \n");
		System.out.println("Escreva o n�mero da op��o desejada:");
		System.out.println("1 - Visualizar todos os carros \n2 - Pesquisa por n�mero \n3 - Sair");

		Scanner read = new Scanner(System.in);
		int opcao = read.nextInt();

		while (opcao != 3) {
			switch (opcao) {
			case 1:
				System.out.println("-----------------------------------");
				System.out.println("Lista completa: \n");
				for(int i=0; i < carros.length; i++) {
					System.out.println((i+1) + " - " + carros[i]);
				}
				break;
			case 2:
				System.out.println("-----------------------------------");
				System.out.println("Digite o n�mero do ve�culo que deseja visualizar: ");
				int pesquisa = read.nextInt() - 1;
				if (pesquisa < carros.length) {
					System.out.println("Resultado da pesquisa: " + (pesquisa + 1) + " - " + carros[pesquisa]);
				}
				else {
					System.out.println("N�o foram encontrados registros para o c�digo " + (pesquisa+1) + ".");
				}
				break;
			default:
				System.out.println("Op��o indispon�vel!");
				break;
			}
			System.out.println("-----------------------------------");
			System.out.println("Escreva o n�mero da op��o desejada:");
			System.out.println("1 - Visualizar todos os carros \n2 - Pesquisa por n�mero \n3 - Sair");
			opcao = read.nextInt();
		}
		System.out.println("Encerrando...");
	}

}
