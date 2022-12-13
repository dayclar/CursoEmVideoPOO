package animais;

public class Programa {
	public static void main(String[] args) {

		Cachorro c = new Cachorro();
		Canguru k = new Canguru();
		Cobra cb = new Cobra();
		GoldFish f = new GoldFish();
		Tartaruga t = new Tartaruga();

		c.locomover();
		c.alimentar();
		c.emitirSom();
		c.abanarRabo();
		c.enterrarOsso();

		k.locomover();
		k.alimentar();
		k.emitirSom();
		k.usarBolsa();
	}
}
