
public class ControleRegistro {

	public static void main(String[] args) {
		//Criando uma vari�vel do tipo Array
		
		String[] carros = {"Uno", "HB20", "Ka", "Gol", "Onix", "BMW"};
		int i = 0;
		System.out.println("Lista de Carros");
		while (i < carros.length) {
			System.out.println((i+1) + "� : " + carros[i]);
			i++;
		}
		
	}

}
