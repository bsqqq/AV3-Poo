package carros;

public class Golf extends Carro implements Esportivo {

	public Golf(int cavalosDePotencia, int ano, float potenciaDoMotor, boolean automatico, boolean sedan, String modelo,
			String marca, float peso) {
		super(cavalosDePotencia, ano, potenciaDoMotor, automatico, sedan, modelo, marca, peso);
		// TODO Auto-generated constructor stub
	}
	

	//sobrepoaição da interface
		@Override
		public void LevantarAeroFolio() {
			// TODO Auto-generated method stub
			System.out.println(getMarca()+" "+getModelo()+" não tem aerofolio");
			
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
			System.out.println(getMarca()+" "+getModelo()+" não tem capota");
			
		}
		
		//sobreposição da classe mãe
		@Override
		public void freiar() {//sobreposição a Classe mãe Carro
			System.out.println(getMarca()+" "+getModelo()+" esta freiando com freios de disco ventilado");
		}
		
		@Override
		public void TemBancoDeCouro() {
			System.out.println(getMarca()+" "+getModelo()+" tem banco de couro");
		}
	

}
