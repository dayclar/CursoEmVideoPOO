package animais;

public class Cachorro extends Mamifero {

	public void enterrarOsso() {
		System.out.println("---------- CACHORRO ----------");
		System.out.println("       ENTERRANDO OSSO");
		System.out.println("------------------------------");
		System.out.println();
	}

	public void abanarRabo() {
		System.out.println("---------- CACHORRO ----------");
		System.out.println("       ABANANDO O RABO");
		System.out.println("------------------------------");
		System.out.println();
	}

	@Override
	public void emitirSom() {
		System.out.println("---------- CACHORRO ----------");
		System.out.println("          Au! Au! Au!");
		System.out.println("------------------------------");
		System.out.println();
	}

	@Override
	public void alimentar() {
		System.out.println("---------- CACHORRO ----------");
		System.out.println("        COMENDO RAÇÃO");
		System.out.println("------------------------------");
		System.out.println();
	}

	@Override
	public void locomover() {
		System.out.println("---------- CACHORRO ----------");
		System.out.println("           CORRENDO");
		System.out.println("------------------------------");
		System.out.println();
	}
}
