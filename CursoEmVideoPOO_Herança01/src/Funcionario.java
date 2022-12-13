
public class Funcionario extends Pessoa {

	private String setor;
	private boolean trabalhando;

	public void mudaTrab() {
		this.trabalhando = !this.trabalhando;
		if (this.trabalhando) {
			System.out.println("-------------------------------");
			System.out.println("Está empregado");
		} else {
			System.out.println("-------------------------------");
			System.out.println("Não está empregado");
		}
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

}
