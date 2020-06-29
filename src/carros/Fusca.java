package carros;

public class Fusca extends Carro {
	public Fusca(int cavalos,int ano,float potencia,boolean automatico, boolean sedan,
			String modelo,String marca,float peso) {
		
		
		super(cavalos, ano, potencia, automatico, sedan, modelo, marca, peso);
	}
	
	//sobreposição da classe mãe
	@Override
	public void TemBancoDeCouro() {
		System.out.println(getMarca()+" "+getModelo()+" tem banco de couro");
	}

}
