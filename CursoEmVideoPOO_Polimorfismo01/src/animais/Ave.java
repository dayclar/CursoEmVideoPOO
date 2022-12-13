package animais;

public class Ave extends Animal {

	private String corPena;

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	@Override
	public void locomover() {
		System.out.println("---------- AVE ----------");
		System.out.println("          VOANDO");
		System.out.println("-------------------------");
		System.out.println();
	}

	@Override
	public void alimentar() {
		System.out.println("---------- AVE ----------");
		System.out.println("     COMENDO FRUTAS");
		System.out.println("-------------------------");
		System.out.println();
	}

	@Override
	public void emitirSom() {
		System.out.println("---------- AVE ----------");
		System.out.println("        SOM DE AVE");
		System.out.println("-------------------------");
		System.out.println();
	}

	public void fazerNinho() {
		System.out.println("---------- AVE ----------");
		System.out.println("    CONSTRUINDO NINHO");
		System.out.println("-------------------------");
		System.out.println();
	}
}
