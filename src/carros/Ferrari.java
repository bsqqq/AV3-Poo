package carros;

public class Ferrari extends Carro implements Esportivo {
	
	public Ferrari(int cavalos,int ano,float potencia,boolean automatico, boolean sedan,
			String modelo,String marca,float peso) {
		
		
		super(cavalos, ano, potencia, automatico, sedan, modelo, marca, peso);
	}
	
	
//sobrepoai��o da interface
	@Override
	public void LevantarAeroFolio() {
		// TODO Auto-generated method stub
		System.out.println(getMarca()+" "+getModelo()+" esta levantando o aero folio");
		
	}

	@Override
	public void limitarPotencia() {
		// TODO Auto-generated method stub
		System.out.println("a potencia do(a)"+getMarca()+" "+getModelo()+"foi limitada");
		
	}

	@Override
	public void parearComCelular() {
		// TODO Auto-generated method stub
		System.out.println(getMarca()+" "+getModelo()+" esta pareado com seu celular");
		
	}

	@Override
	public void subirCapota() {
		// TODO Auto-generated method stub
		System.out.println(getMarca()+" "+getModelo()+" esta subindo a capota");
		
	}
	
	//sobreposi��o da classe m�e
	@Override
	public void freiar() {//sobreposi��o a Classe m�e Carro
		System.out.println(getMarca()+" "+getModelo()+" esta freiando com freios abs");
	}
	
	@Override
	public void TemBancoDeCouro() {
		System.out.println(getMarca()+" "+getModelo()+" tem banco de couro");
	}

}
