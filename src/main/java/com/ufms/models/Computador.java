package com.ufms.models;

public class Computador extends ItemBiblioteca {
	private String modelo;

	public Computador() {
		
	}

	public Computador(int codigo, String modelo) {
		super(codigo, false);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "(Computador " + this.getCodigo() + " : " + this.modelo + " )";
	}
	
}
