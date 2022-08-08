import java.util.HashMap;

public class CamposRegistros {

	public static void main(String[] args) {
		HashMap<String, String> nomeEmail = new HashMap<String, String>();
		nomeEmail.put("Cris", "cris@email.com");
		nomeEmail.put("Ana", "ana@email.com");
		System.out.println(nomeEmail.get("Cris"));
	}

}
