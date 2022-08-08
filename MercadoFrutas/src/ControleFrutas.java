import java.util.ArrayList;
import java.util.Scanner;

public class ControleFrutas {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		ArrayList<String> frutas = new ArrayList<String>();
		Boolean continua = true;
		
		
		String linha = "---------------------------";
		System.out.println("     MERCADO DAS FRUTAS \n" + linha);
		System.out.println("Opções: \n 1-Cadastrar \n 2-Listar todas as frutas \n 3-Excluir \n 4-Busca por ID \n 5-Editar \n 6-Sair");
		int opcao = read.nextInt();
		
		while (continua == true) {
			
			switch(opcao) {
			case 1:
				System.out.println(linha + "\nNovo Cadastro \n");
				System.out.println("Nome: ");
				String novaFruta = read.next();
				System.out.println("Fruta " + novaFruta + " adicionada com Sucesso! \n" + linha);
				frutas.add(novaFruta);
				break;
				
			case 2:
				System.out.println("Listar todas as frutas");
				for (int contador=0; contador < frutas.size(); contador++) {
					System.out.println((contador+1) + " - " + frutas.get(contador));
				}
				System.out.println(linha);
				break;
				
			case 3:
				System.out.println("Excluir fruta");
				System.out.println("Digite o ID da fruta a ser excluída: ");
				int id = read.nextInt();
				System.out.println(id + " - " + frutas.get(id-1) + ". \nConfirmar exclusão? 1 - Sim ou 2 - Não");
				int confirma = read.nextInt();
				if (confirma == 1) {
					frutas.remove(id-1);
					System.out.println("Item removido com sucesso!");
				} else {
					System.out.println("Exclusão cancelada.");
				}
				System.out.println(linha);
				break;
				
			case 4:
				System.out.println("Buscar fruta por ID");
				System.out.println("Digite o ID da fruta desejada: ");
				int buscarId = read.nextInt();
				if ((buscarId > 0) && (buscarId <= frutas.size())) {
					System.out.println("Resultado da busca: ");
					System.out.println(buscarId + " - " + frutas.get(buscarId-1));
				} else {
					System.out.println("Não foram encontrados resultados para o código " + buscarId);
				}
				System.out.println(linha);
				break;
				
			case 5: 
				System.out.println("Editar Cadastro");
				System.out.println("Digite o ID da fruta desejada: ");
				int editarId = read.nextInt();
				if ((editarId > 0) && (editarId <= frutas.size())) {
					System.out.println("Resultado da busca: ");
					System.out.println(editarId + " - " + frutas.get(editarId-1));
					System.out.println("Digite o novo nome: ");
					String editarFruta = read.next();
					frutas.set(editarId-1, editarFruta);
					System.out.println("Modificação finalizada com sucesso! Novo nome: " + editarFruta);
				} else {
					System.out.println("Não foram encontrados resultados para o código " + editarId);
				}
				System.out.println(linha);
				break;
				
			case 6:
				System.out.println("Encerrando...");
				continua = false;
				break;
			default:
				System.out.println("Opção Inválida!\n" + linha);
			}
			if (continua == true) {
			System.out.println("Opções: \n 1-Cadastrar \n 2-Listar todas as frutas \n 3-Excluir \n 4-Busca por ID \n 5-Editar \n 6-Sair");
			opcao = read.nextInt();
			}
		}
		read.close();
	}

}
