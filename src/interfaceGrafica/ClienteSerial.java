package interfaceGrafica;
import java.io.Serializable;

public class ClienteSerial implements Serializable{
	private String cpf;
	private String nome;
	private boolean bancoDeCouro;
	private boolean conversivel;
	private boolean Sedan;
	private boolean auto;

	public ClienteSerial(String cpf, String nome, boolean bancoDeCouro, boolean conversivel, boolean Sedan, boolean auto) {
		this.cpf = cpf;
		this.nome = nome;
		this.bancoDeCouro = bancoDeCouro;
		this.conversivel = conversivel;
		this.auto = auto;
		this.Sedan = Sedan;
	}

	@Override
	public String toString() {
		return "ClienteSerial [cpf=" + cpf + ", nome=" + nome + ", bancoDeCouro=" + bancoDeCouro + ", conversivel="
				+ conversivel + ", Sedan=" + Sedan + ", auto=" + auto + "]";
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		if (conversivel) {
			return "sim";
		}
		else {
			return "nao";	
		}
	}

	public void setConversivel(boolean conversivel) {
		this.conversivel = conversivel;
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
