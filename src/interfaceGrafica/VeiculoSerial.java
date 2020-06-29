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


	public String isBancoDeCouro() {
		if (bancoDeCouro) {
			return "sim";
		}
		else {
			return "nao";	
		}
	}


	public void setBancoDeCouro(boolean bancoDeCouro) {
		this.bancoDeCouro = bancoDeCouro;
	}


	public String isConversivel() {
		if (Conversivel) {
			return "sim";
		}
		else {
			return "nao";	
		}
	}


	public void setConversivel(boolean conversivel) {
		Conversivel = conversivel;
	}


	public String isSedan() {
		if (Sedan) {
			return "sim";
		}
		else {
			return "nao";	
		}
	}


	public void setSedan(boolean sedan) {
		Sedan = sedan;
	}


	public String isAuto() {
		if (auto) {
			return "sim";
		}
		else {
			return "nao";	
		}
	}


	public void setAuto(boolean auto) {
		this.auto = auto;
	}	
}
