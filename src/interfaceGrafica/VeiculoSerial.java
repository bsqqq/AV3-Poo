package interfaceGrafica;

import java.io.Serializable;
import java.util.Scanner;

public class VeiculoSerial implements Serializable{
	private String modeloDoCarro;
	private String marcaDoCarro;
	private String anoDoCarro;
	private boolean bancoDeCouro;
	private boolean Conversivel;
	private boolean Sedan;
	private boolean auto;
	
	public VeiculoSerial(String modeloDoCarro, String marcaDoCarro, String anoDoCarro, boolean bancoDeCouro,
			boolean conversivel, boolean sedan, boolean auto) {
		
		this.modeloDoCarro = modeloDoCarro;
		this.marcaDoCarro = marcaDoCarro;
		this.anoDoCarro = anoDoCarro;
		this.bancoDeCouro = bancoDeCouro;
		Conversivel = conversivel;
		Sedan = sedan;
		this.auto = auto;
	}
	
	
	@Override
	public String toString() {
		return "VeiculoSerial [modeloDoCarro=" + modeloDoCarro + ", marcaDoCarro=" + marcaDoCarro + ", anoDoCarro="
				+ anoDoCarro + ", bancoDeCouro=" + bancoDeCouro + ", Conversivel=" + Conversivel + ", Sedan=" + Sedan
				+ ", auto=" + auto + ", prompt=" + "]";
	}


	
	public String getModeloDoCarro() {
		return modeloDoCarro;
	}


	public void setModeloDoCarro(String modeloDoCarro) {
		this.modeloDoCarro = modeloDoCarro;
	}


	public String getMarcaDoCarro() {
		return marcaDoCarro;
	}


	public void setMarcaDoCarro(String marcaDoCarro) {
		this.marcaDoCarro = marcaDoCarro;
	}


	public String getAnoDoCarro() {
		return anoDoCarro;
	}


	public void setAnoDoCarro(String anoDoCarro) {
		this.anoDoCarro = anoDoCarro;
	}


	public boolean isBancoDeCouro() {
		return bancoDeCouro;
	}


	public void setBancoDeCouro(boolean bancoDeCouro) {
		this.bancoDeCouro = bancoDeCouro;
	}


	public boolean isConversivel() {
		return Conversivel;
	}


	public void setConversivel(boolean conversivel) {
		Conversivel = conversivel;
	}


	public boolean isSedan() {
		return Sedan;
	}


	public void setSedan(boolean sedan) {
		Sedan = sedan;
	}


	public boolean isAuto() {
		return auto;
	}


	public void setAuto(boolean auto) {
		this.auto = auto;
	}	
}
