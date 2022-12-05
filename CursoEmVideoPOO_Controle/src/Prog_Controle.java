
public class Prog_Controle {
	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();
		
		c.ligar();
		c.abrirMenu();
		c.maisVolume();
		c.abrirMenu();
		c.ligarMudo();
		c.abrirMenu();
		c.fecharMenu();
	}
}
