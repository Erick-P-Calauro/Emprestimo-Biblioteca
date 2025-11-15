package com.ufms.models;

public interface OperacoesBiblioteca extends OperacoesEmprestimo, OperacoesItem {
	void realizarEmprestimo(ItemBiblioteca item);
	void realizarDevolucao(ItemBiblioteca item);
	void verificarHistorico(ItemBiblioteca item);
}
