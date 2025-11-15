package com.ufms.models;

public abstract class ItemBiblioteca {
	private int codigo; //codigo do patrimonio
	private boolean status; // emprestado ou não
	
	ItemBiblioteca() {

	}

	ItemBiblioteca(int codigo, boolean status) {
		this.codigo = codigo;
		this.status = status;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
	
}


