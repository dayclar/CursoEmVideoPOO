
public class Programa {
	public static void main(String[] args) {

		Mamifero m = new Mamifero();
		Lobo l = new Lobo();
		Cachorro c = new Cachorro();
		m.emitirSom();
		l.emitirSom();
		c.emitirSom();

		c.reagir(false);
		c.reagir(true);
		c.reagir("Olá");
		c.reagir(7, 11.0);
	}
}
