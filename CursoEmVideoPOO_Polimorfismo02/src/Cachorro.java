
public class Cachorro extends Lobo {

	@Override
	public void emitirSom() {
		System.out.println("---------- CACHORRO ----------");
		System.out.println("          Au!Au!Au!");
		System.out.println("------------------------------\n");
	}

	public void reagir(String frase) {
		if (frase.equalsIgnoreCase("toma comida") || frase.equalsIgnoreCase("Olá")) {
			System.out.println("---------- CACHORRO ----------");
			System.out.println("  ABANANDO O RABO E LATINDO");
			System.out.println("------------------------------\n");
		} else {
			System.out.println("---------- CACHORRO ----------");
			System.out.println("          ROSNANDO");
			System.out.println("------------------------------\n");
		}
	}

	public void reagir(int hora, int min) {
		if (hora < 12) {
			System.out.println("---------- CACHORRO ----------");
			System.out.println("       ABANANDO O RABO");
			System.out.println("------------------------------\n");
		} else if (hora >= 18) {
			System.out.println("---------- CACHORRO ----------");
			System.out.println("          IGNORANDO");
			System.out.println("------------------------------\n");
		} else {
			System.out.println("---------- CACHORRO ----------");
			System.out.println("  ABANANDO O RABO E LATINDO");
			System.out.println("------------------------------\n");
		}
	}

	public void reagir(boolean dono) {
		if (dono == true) {
			System.out.println("---------- CACHORRO ----------");
			System.out.println("       ABANANDO O RABO");
			System.out.println("------------------------------\n");
		} else {
			System.out.println("---------- CACHORRO ----------");
			System.out.println("      ROSNANDO E LATINDO");
			System.out.println("------------------------------\n");
		}
	}

	public void reagir(int idade, double peso) {
		if (idade < 5) {
			if (peso < 10) {
				System.out.println("---------- CACHORRO ----------");
				System.out.println("       ABANANDO O RABO");
				System.out.println("------------------------------\n");
			} else {
				System.out.println("---------- CACHORRO ----------");
				System.out.println("          LATINDO");
				System.out.println("------------------------------\n");
			}
		} else {
			if (peso < 10) {
				System.out.println("---------- CACHORRO ----------");
				System.out.println("          ROSNANDO");
				System.out.println("------------------------------\n");
			} else {
				System.out.println("---------- CACHORRO ----------");
				System.out.println("          IGNORANDO");
				System.out.println("------------------------------\n");
			}
		}
	}

}
