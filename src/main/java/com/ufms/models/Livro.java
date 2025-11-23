package com.ufms.models;

public class Livro extends ItemBiblioteca{
	private String autor;
	private String nome;
	private String categoria;
	private int ano_publicacao;

	public Livro() {

	}

	public Livro(int codigo, String autor, String nome, String categoria, int ano_publicacao) {
		super(codigo, false);
		this.autor = autor;
		this.nome = nome;
		this.categoria = categoria;
		this.ano_publicacao = ano_publicacao;
	}

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getAno_publicacao() {
		return ano_publicacao;
	}
	public void setAno_publicacao(int ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}

	@Override
	public String toString() {
		return "(Livro " + this.getCodigo() + " : " + this.nome + " " + this.autor + " )";
	}
	
}
