
public class DadosUsuario {

	public DadosUsuario(){
		
	}
	
	String usuario="";
	String senha="";
	
	public int validaPass() {
		usuario=Login.textUsuario.getText();
		senha=Login.textSenha.getText();
		if (usuario.equals("cristhiane")&& senha.equals(1234)) {
			return 1;
		} else {
			return 0;
		}
	}
}
