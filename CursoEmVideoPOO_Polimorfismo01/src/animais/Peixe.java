package animais;

public class Peixe extends Animal {

	private String corEscama;

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("---------- PEIXE ----------");
		System.out.println("          NADANDO");
		System.out.println("---------------------------");
		System.out.println();
	}

	@Override
	public void alimentar() {
		System.out.println("---------- PEIXE ----------");
		System.out.println("   COMENDO SUBSTÂNCIAS");
		System.out.println("---------------------------");
		System.out.println();
	}

	@Override
	public void emitirSom() {
		System.out.println("---------- PEIXE ----------");
		System.out.println("    PEIXE NÃO FAZ SOM");
		System.out.println("---------------------------");
		System.out.println();
	}

	public void soltarBolhas() {
		System.out.println("---------- PEIXE ----------");
		System.out.println("      SOLTANDO BOLHAS");
		System.out.println("---------------------------");
		System.out.println();
	}
}
