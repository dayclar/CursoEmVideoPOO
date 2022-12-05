
public class Caneta {

	String modelo;
	String cor;
	double ponta;
	int carga;
	boolean tampada;

	public Caneta(String modelo, String cor, double ponta, int carga) {
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.carga = carga;
		this.tampada = true;
	}

	public void escrever() {
		if (this.tampada == false) {
			System.out.println("Escreveu");
		} else {
			System.out.println("ERRO. CANETA TAMPADA");
		}
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;

	}
}
