package com.ufms.models;

import java.util.List;

public interface OperacoesItem {
    <T extends ItemBiblioteca> void adicionarItem(T item);
	void editarItem(int codigo, ItemBiblioteca itemNovo);
	ItemBiblioteca buscarItem(int codigo);
	List<ItemBiblioteca> listarItens();
    void deletarItem(int codigo);
}
