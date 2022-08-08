import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GerarArquivo {

	public static void main(String[] args)  throws IOException {
		ArrayList<String> clientes = new ArrayList<String>();
		
		clientes.add("Marcia");
		clientes.add("Carlos");
		clientes.add("Fabricio");
		clientes.add("Luisa");
		clientes.add("Claudia");
		
		FileWriter arquivo = new FileWriter("C:\\Users\\barro\\Downloads\\clientes.txt");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		
		gravarArquivo.println(clientes);
		arquivo.close();

	}

}
