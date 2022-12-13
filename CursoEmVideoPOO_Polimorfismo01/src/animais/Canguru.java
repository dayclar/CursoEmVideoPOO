package animais;

public class Canguru extends Mamifero {

	public void usarBolsa() {
		System.out.println("---------- CANGURO ----------");
		System.out.println("         USANDO BOLSA");
		System.out.println("------------------------------");
		System.out.println();
	}

	@Override
	public void locomover() {
		System.out.println("---------- CANGURO ----------");
		System.out.println("           CORRENDO");
		System.out.println("------------------------------");
		System.out.println();
	}

	@Override
	public void alimentar() {
		System.out.println("---------- CANGURO ----------");
		System.out.println("      COMENDO VERDURAS");
		System.out.println("------------------------------");
		System.out.println();
	}

	@Override
	public void emitirSom() {
		System.out.println("---------- CANGURU ----------");
		System.out.println("       SOM DE MAMIFERO");
		System.out.println("------------------------------");
		System.out.println();
	}
}
