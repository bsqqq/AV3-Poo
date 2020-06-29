package carros;

public abstract class Carro {
	private int cavalosDePotencia;
	private int ano;
	private float potenciaDoMotor;
	private boolean automatico;
	private boolean sedan;
	private String modelo;
	private String marca;
	private float peso;
	private boolean BancoDeCouro = false;
	
	public Carro(int cavalosDePotencia, int ano, float potenciaDoMotor, boolean automatico, boolean sedan,
			String modelo, String marca, float peso) {
		this.cavalosDePotencia = cavalosDePotencia;
		this.ano = ano;
		this.potenciaDoMotor = potenciaDoMotor;
		this.automatico = automatico;
		this.sedan = sedan;
		this.modelo = modelo;
		this.marca = marca;
		this.peso = peso;
	}
	public void ligar(String liga) {
		if(liga =="LIGA") {
			System.out.println(this.modelo+" foi ligado por comando de voz");
		}
	}
	public void ligar(int liga2) {
		if(liga2 == 1) {
			System.out.println(this.modelo+" foi ligado");
		}
	}
	public void ligar(boolean liga3) {
		if(liga3 == true) {
			System.out.println(this.modelo+" foi ligado pelo smart button");
		}
	}
	
	public void freiar() {
		System.out.println(this.marca+" "+this.modelo+" esta freiando");
	}
	public void TemBancoDeCouro() {
		
			System.out.println(this.marca+" "+this.modelo+" não tem banco de couro");
		
	}
	public int getCavalosDePotencia() {
		return cavalosDePotencia;
	}
	public void setCavalosDePotencia(int cavalosDePotencia) {
		this.cavalosDePotencia = cavalosDePotencia;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public float getPotenciaDoMotor() {
		return potenciaDoMotor;
	}
	public void setPotenciaDoMotor(float potenciaDoMotor) {
		this.potenciaDoMotor = potenciaDoMotor;
	}
	public boolean isAutomatico() {
		return automatico;
	}
	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}
	public boolean isSedan() {
		return sedan;
	}
	public void setSedan(boolean sedan) {
		this.sedan = sedan;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public boolean isBancoDeCouro() {
		return BancoDeCouro;
	}
	public void setBancoDeCouro(boolean bancoDeCouro) {
		BancoDeCouro = bancoDeCouro;
	}

}
