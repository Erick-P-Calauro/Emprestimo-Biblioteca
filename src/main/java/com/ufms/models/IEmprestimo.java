package com.ufms.models;
import java.time.LocalDateTime;

public abstract class IEmprestimo {

	private String RADevedor;
	private LocalDateTime inicioEmprestimo;
	private LocalDateTime fimEmprestimo;
	
	IEmprestimo() {
		
	}

	IEmprestimo(String RADevedor, LocalDateTime inicioEmprestimo, LocalDateTime fimEmprestimo) {
		this.RADevedor = RADevedor;
		this.inicioEmprestimo = inicioEmprestimo;
		this.fimEmprestimo = fimEmprestimo;
	}

	public boolean emprestimoValido() {
		return inicioEmprestimo.isAfter(fimEmprestimo) ? false : true;
	}

	public String getRADevedor() {
		return RADevedor;
	}

	public void setRADevedor(String rADevedor) {
		RADevedor = rADevedor;
	}

	public LocalDateTime getInicioEmprestimo() {
		return inicioEmprestimo;
	}

	public void setInicioEmprestimo(LocalDateTime inicioEmprestimo) {
		this.inicioEmprestimo = inicioEmprestimo;
	}

	public LocalDateTime getFimEmprestimo() {
		return fimEmprestimo;
	}

	public void setFimEmprestimo(LocalDateTime fimEmprestimo) {
		this.fimEmprestimo = fimEmprestimo;
	}

	
}