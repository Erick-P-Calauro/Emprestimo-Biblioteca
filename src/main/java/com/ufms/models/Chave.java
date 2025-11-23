package com.ufms.models;

public class Chave extends ItemBiblioteca {
	private int numeroArmario;

	public Chave() {

	}

	public Chave(int codigo, int numeroArmario) {
		super(codigo, false);
		this.numeroArmario = numeroArmario;
	}

	public int getNumeroArmario() {
		return numeroArmario;
	}

	public void setNumeroArmario(int numeroArmario) {
		this.numeroArmario = numeroArmario;
	}

	@Override
	public String toString() {
		return "(Chave " + this.getCodigo() + " : " + this.numeroArmario + " )";
	}

	
}
