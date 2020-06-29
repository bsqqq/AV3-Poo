package execao;

public class ForaDoIntervalo extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int num;
	public ForaDoIntervalo(int num) {
		super();
		this.num = num;
	}
	@Override
	public String toString() {
		return "o numero "+this.num+" esta fora do intervalo de numeros validos";
	}

}
