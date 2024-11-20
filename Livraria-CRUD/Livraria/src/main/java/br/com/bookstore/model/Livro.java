package br.com.bookstore.model;

public class Livro {
	private Long id;
	private String nome;
	private double preco;
	private String sinopse;
	private String autor;
	private String editora;
	private int nPaginas;
	private int anodeLancamento;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getnPaginas() {
		return nPaginas;
	}
	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}
	public int getAnodeLancamento() {
		return anodeLancamento;
	}
	public void setAnodeLancamento(int anodeLancamento) {
		this.anodeLancamento = anodeLancamento;
	}
}
