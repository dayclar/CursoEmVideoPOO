
public class programaEscola {
	public static void main(String[] args) {

		Visitante v1 = new Visitante();

		v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo("M");
		System.out.println(v1.toString());

		Aluno a1 = new Aluno();
		a1.setNome("Cláudio");
		a1.setMatricula(111);
		a1.setCurso("Informática");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.pagarMensalidade();

		Bolsista b1 = new Bolsista();
		b1.setNome("Jorginho");
		b1.setMatricula(112);
		b1.setBolsa(12.5);
		b1.setSexo("M");
		b1.pagarMensalidade();

		Professor p1 = new Professor();
		v1.fazerNiver();
		a1.fazerNiver();
		b1.fazerNiver();
		p1.fazerNiver();

		b1.renovarBolsa();
		p1.setSalario(1200);
		p1.receberAumento(10);
	}
}
