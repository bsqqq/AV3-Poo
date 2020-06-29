package funcionarios;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	private int NdoFuncionario;
	private String cargo;
	private float salario;
	
	public Funcionario(String nome, String cpf, int ndoFuncionario, String cargo, float salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.NdoFuncionario = ndoFuncionario;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public void trabalhar() {
		System.out.println("funcionario trabalha");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNdoFuncionario() {
		return NdoFuncionario;
	}

	public void setNdoFuncionario(int ndoFuncionario) {
		NdoFuncionario = ndoFuncionario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	

}
