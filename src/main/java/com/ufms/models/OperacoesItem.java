package com.ufms.models;

import java.util.List;

public interface OperacoesItem {
    void adicionarItem(ItemBiblioteca item);
	void editarItem(int codigo, ItemBiblioteca itemNovo);
	ItemBiblioteca buscarItem(int codigo);
	List<ItemBiblioteca> listarItens();
    void deletarItem(int codigo);
}
