package animais;

public class Mamifero extends Animal {

	private String corPelo;

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public void locomover() {
		System.out.println("---------- MAMIFERO ----------");
		System.out.println("           CORRENDO");
		System.out.println("------------------------------");
		System.out.println();
	}

	@Override
	public void alimentar() {
		System.out.println("---------- MAMIFERO ----------");
		System.out.println("           MAMANDO");
		System.out.println("------------------------------");
		System.out.println();
	}

	@Override
	public void emitirSom() {
		System.out.println("---------- MAMIFERO ----------");
		System.out.println("       SOM DE MAMIFERO");
		System.out.println("------------------------------");
		System.out.println();
	}
}
