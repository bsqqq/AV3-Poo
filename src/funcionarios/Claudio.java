package funcionarios;

public class Claudio extends Funcionario implements Vendedor{

	public Claudio() {
		super("claudio", "001", 010, "vendedor", 1200);

	}
	
	//sobreposição da interface
	@Override
	public void bonusDeVendedor() {
		// TODO Auto-generated method stub
		this.setSalario(this.getSalario()+100);
		
	}

	@Override
	public void comicao() {
		// TODO Auto-generated method stub
		System.out.println("vendedor ganha 2% do valor do carro");
	}

	@Override
	public void descontoDeVendedor() {
		// TODO Auto-generated method stub
		System.out.println("o vendedor pode dar 5% de desconto no valor do carro");
		
	}
	//sobreposição da clase mãe
	@Override
	public void trabalhar() {
		System.out.println("Claudio trabalha");
	}

}
