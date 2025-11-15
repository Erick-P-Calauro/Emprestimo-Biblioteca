package com.ufms.models;

public interface OperacoesEmprestimo {
    void registrarEmprestimo (IEmprestimo emprestimo);
	void registrarDevolucao (IEmprestimo emprestimo);
    boolean verificarValidade(IEmprestimo emprestimo);
}
