
public interface Publicacao {

	public abstract void abrir();

	public abstract void fechar();

	public abstract void avancarPag();

	public abstract void voltarPag();

	void folhear(String acao, int num);
}
