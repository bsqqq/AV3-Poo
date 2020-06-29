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

	public boolean isBancoDeCouro() {
		return bancoDeCouro;
	}

	public void setBancoDeCouro(boolean bancoDeCouro) {
		this.bancoDeCouro = bancoDeCouro;
	}

	public boolean isConversivel() {
		return conversivel;
	}

	public void setConversivel(boolean conversivel) {
		this.conversivel = conversivel;
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
