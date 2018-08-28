package dominio;

public class Livro {
	private int id;
	private String titulo;
	private String autor;
	private String editora;
	private int avaliacao;
	private double preco;
	
	public Livro() {}
	
	public Livro(String titulo, String autor, String editora, int avaliacao, double preco) {
	
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.avaliacao = avaliacao;
		this.preco = preco;
	}
	

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", editora="+ editora + "]";
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public int getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	
	
	
}
