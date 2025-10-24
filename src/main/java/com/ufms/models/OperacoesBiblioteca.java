package com.ufms.models;

public interface OperacoesBiblioteca {
	void adicionarItem(ItemBiblioteca item);
	void buscarItem(ItemBiblioteca item);
	void emprestimoItem (ItemEmprestimo emprestimo);
	void devolucaoItem (ItemEmprestimo emprestimo);
}
