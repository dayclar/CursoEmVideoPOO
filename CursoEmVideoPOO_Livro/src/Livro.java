
public class Livro implements Publicacao {

	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	public Livro(String titulo, String autor, int totPaginas, int pagAtual, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = pagAtual;
		this.aberto = false;
		this.leitor = leitor;
	}

	public void detalhes() {
		System.out.println("--------------------------------------------");
		System.out.println("Titulo do livro: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de páginas: " + this.getTotPaginas());
		System.out.println("pagAtual: " + this.getPagAtual());
		System.out.println("Nome do leitor: " + getLeitor().getNome());
		System.out.println("Idade do leitor: " + getLeitor().getIdade());
		System.out.println("Sexo do leitor: " + getLeitor().getSexo());
		if (isAberto()) {
			System.out.println("O livro está aberto neste momento");
		} else {
			System.out.println("O livro está fechado neste momneto");
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		if (isAberto() == false) {
			setAberto(true);
		} else {
			System.out.println("Erro. O livro já está aberto");
		}
	}

	@Override
	public void fechar() {
		if (isAberto()) {
			setAberto(false);
		} else {
			System.out.println("Erro. O livro já está fechado");
		}
	}

	@Override
	public void avancarPag() {
		if(isAberto()) {
		if (getPagAtual() < getTotPaginas()) {
			setPagAtual(getPagAtual() + 1);
		} else {
			System.out.println("Erro ao tentar avançar página. O livro chegou ao fim");
		}
		} else {
			System.out.println("O livro está fechado");
		}
	}

	@Override
	public void voltarPag() {
		if(isAberto()) {
		if (getPagAtual() > 1) {
			setPagAtual(getPagAtual() - 1);
		} else {
			System.out.println("Erro ao tentar voltar página. O livro está na primeira página");
		}
		} else {
			System.out.println("O livro está fechado");
		}
	}

	@Override
	public void folhear(String acao, int num) {
		if(isAberto()) {
		if (acao.equals("avancar")) {
			if (getPagAtual() < getTotPaginas()) {
				setPagAtual(getPagAtual() + num);
			} else {
				System.out.println("Erro ao tentar avançar página. O livro chegou ao fim");
			}
		} else if (acao.equals("voltar")) {
			if (getPagAtual() > 1) {
				setPagAtual(getPagAtual() - num);
			} else {
				System.out.println("Erro ao tentar voltar página. O livro está na primeira página");
			}
		}
		} else {
			System.out.println("Erro. O livro está fechado");
		}
	}
}