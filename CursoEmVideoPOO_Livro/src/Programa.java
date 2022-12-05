
public class Programa {
	public static void main(String[] args) {
		Pessoa cleber = new Pessoa("Cleber",26, "M");
	
		Livro l1 = new Livro("Jogos Vorazes","Suzanne Collins", 334, 1, cleber);
		
		l1.abrir();
		l1.detalhes();
		l1.folhear("avancar", 3);
		l1.detalhes();
		l1.folhear("voltar", 3);
		l1.detalhes();
	}
 }
