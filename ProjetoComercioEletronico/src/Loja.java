
public class Loja {

	public static void main(String[] args) {
		
		Produto p; //Declarando o objeto
		p = new Produto(); //Reservando (alocar) a mem�ria
		p.codigo = 123;
		p.descricao = "computador";
		p.preco = 2500.00;
		
		Produto p2;
		p2 = new Produto(); 
		p2.codigo = 456;
		p2.descricao = "Cadeira escrit�rio";
		p2.preco = 700.00;
		
		Produto p3;
		p3 = new Produto(); 
		p3.codigo = 789;
		p3.descricao = "Teclado";
		p3.preco = 150.00;
		

		
		//invocando o m�todo mostrarAnuncio para cada objeto da classe Produto criado acima
		p.mostrarAnuncio();
		p2.mostrarAnuncio();
		p3.mostrarAnuncio();

	}

}
