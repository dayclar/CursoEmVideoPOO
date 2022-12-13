
public class Professor extends Pessoa {

	private String especialidade;
	private double salario;

	public void receberAumento(double aumento) {
		this.salario += (this.salario * (aumento / 100));
		System.out.println("--------------------------------------------");
		System.out.println("Salário com o aumento: " + this.salario);
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
