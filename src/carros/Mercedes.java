package carros;

public class Mercedes extends Carro implements Esportivo{

	public Mercedes(int cavalosDePotencia, int ano, float potenciaDoMotor, boolean automatico, boolean sedan,
			String modelo, String marca, float peso) {
		super(cavalosDePotencia, ano, potenciaDoMotor, automatico, sedan, modelo, marca, peso);
		// TODO Auto-generated constructor stub
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
			System.out.println(getMarca()+" "+getModelo()+" esta freiando com freio de disco ventilado");
		}
		
		@Override
		public void TemBancoDeCouro() {
			System.out.println(getMarca()+" "+getModelo()+" tem banco de couro");
		
		}
	

}
