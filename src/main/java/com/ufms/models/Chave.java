package com.ufms.models;

public class Chave extends ItemBiblioteca {
	private int numeroArmario;

	Chave() {

	}

	Chave(int codigo, boolean status, int numeroArmario) {
		super(codigo, status);
		this.numeroArmario = numeroArmario;
	}

	public int getNumeroArmario() {
		return numeroArmario;
	}

	public void setNumeroArmario(int numeroArmario) {
		this.numeroArmario = numeroArmario;
	}

	
}
