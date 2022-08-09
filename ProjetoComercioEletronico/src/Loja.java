
public class Loja {

	public static void main(String[] args) {
		
		Produto p; //Declarando o objeto
		p = new Produto(); //Reservando (alocar) a memória
		p.setCodigo(123);
		p.setDescricao("computador");
		p.setPreco(2500.00);
		
		Produto p2;
		p2 = new Produto(); 
		p2.setCodigo(456);
		p2.setDescricao("Cadeira escritório");
		p2.setPreco(700.00);
		
		Produto p3;
		p3 = new Produto(); 
		p3.setCodigo(789);
		p3.setDescricao("Teclado");
		p3.setPreco(150.00);
		

		
		//invocando o método mostrarAnuncio para cada objeto da classe Produto criado acima
		System.out.println("----- Preços antes dos descontos -----");
		p.mostrarAnuncio();
		p2.mostrarAnuncio();
		p3.mostrarAnuncio();
		
		System.out.println("***************************************");
		System.out.println("************* Novos preços ************");
		p.aplicarDesconto(10);
		p2.modificarPreco(550.00);
		p3.modificarPreco(99.99);
		
		p.mostrarAnuncio();
		p2.mostrarAnuncio();
		p3.mostrarAnuncio();

		
		//simulando descontos
		double precoP = p.simularDesconto(15);
		System.out.println("O preço do "+ p.getDescricao() + " com mais 15% de desconto fica: R$" + precoP);
		//Ao mostrar o anúncio, o preco do Produto p continua inalterado
		p.mostrarAnuncio();
	}

}
