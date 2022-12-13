
public class ProgramaEscola {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();

		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Cláudio");
		p4.setNome("Fabiana");

		p1.setSexo("M");
		p4.setSexo("F");
		p2.setIdade(18);

		p2.fazerNiver();
		p3.fazerNiver();

		p2.cancelarMatric();
		p3.receberAumento(120);
		p4.mudaTrab();
		p4.mudaTrab();
		System.out.println();
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}
}
