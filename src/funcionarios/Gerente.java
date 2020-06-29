package funcionarios;

public class Gerente extends Funcionario{

	public Gerente(String nome, String cpf, int ndoFuncionario, String cargo, float salario) {
		super(nome, cpf, ndoFuncionario, cargo, salario);
		// TODO Auto-generated constructor stub
	}
	
	public void descontoDoGerente() {
		System.out.println("o gerente da 10% de desconto no carro");
	}
	
	//sobrecarga
	public void demite(String NomeFunc) {
		System.out.println("o gerente demitiu o(a) "+NomeFunc);
	}
	public void demite(int NdoFunc) {
		System.out.println("o gerente demitiu funcionario com o numero "+NdoFunc);
	}

}
