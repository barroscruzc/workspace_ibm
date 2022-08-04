
public class Principal {

	public static void main(String[] args) {
	
		int resultado;
		
		for (int x = 1; x <= 10; x++) {
			System.out.println("TABUADA DO " + x);
			for (int y = 1; y <= 10; y++) {
				resultado = x * y;
				System.out.println(x + " * " + y + " = " + resultado);
			}
			System.out.println("___________________________\n");
		}
	}

}
