package com.ufms.models;

import java.util.List;

public interface OperacoesBiblioteca extends OperacoesEmprestimo, OperacoesItem {
	void realizarEmprestimo(ItemBiblioteca item, String RA_Devedor);
	void realizarDevolucao(ItemBiblioteca item, String RA_Devedor);
	List<IEmprestimo> verificarHistorico(ItemBiblioteca item);
}
