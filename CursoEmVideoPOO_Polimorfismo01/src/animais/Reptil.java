package animais;

public class Reptil extends Animal {

	private String corEscama;

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("---------- REPTIL ----------");
		System.out.println("         RASTEJANDO");
		System.out.println("----------------------------");
		System.out.println();
	}

	@Override
	public void alimentar() {
		System.out.println("---------- REPTIL ----------");
		System.out.println("     COMENDO VEGETAIS");
		System.out.println("----------------------------");
		System.out.println();
	}

	@Override
	public void emitirSom() {
		System.out.println("---------- REPTIL ----------");
		System.out.println("       SOM DE REPTIL");
		System.out.println("----------------------------");
		System.out.println();
	}

}
