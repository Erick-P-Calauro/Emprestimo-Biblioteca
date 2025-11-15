package com.ufms.controllers;

import java.util.ArrayList;
import java.util.List;

import com.ufms.models.ItemBiblioteca;
import com.ufms.models.IEmprestimo;
import com.ufms.models.OperacoesBiblioteca;

public class ControleBiblioteca implements OperacoesBiblioteca {

    private List<ItemBiblioteca> itens;
    private List<IEmprestimo> historico;

    ControleBiblioteca() {
        itens = new ArrayList<ItemBiblioteca>();
        historico = new ArrayList<IEmprestimo>();
    }

    @Override
    public void registrarEmprestimo(IEmprestimo emprestimo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrarEmprestimo'");
    }

    @Override
    public void registrarDevolucao(IEmprestimo emprestimo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrarDevolucao'");
    }

    @Override
    public boolean verificarValidade(IEmprestimo emprestimo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verificarValidade'");
    }

    @Override
    public void adicionarItem(ItemBiblioteca item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarItem'");
    }

    @Override
    public void editarItem(int codigo, ItemBiblioteca itemNovo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editarItem'");
    }

    @Override
    public ItemBiblioteca buscarItem(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarItem'");
    }

    @Override
    public List<ItemBiblioteca> listarItens() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarItens'");
    }

    @Override
    public void deletarItem(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletarItem'");
    }

    @Override
    public void realizarEmprestimo(ItemBiblioteca item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizarEmprestimo'");
    }

    @Override
    public void realizarDevolucao(ItemBiblioteca item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizarDevolucao'");
    }

    @Override
    public void verificarHistorico(ItemBiblioteca item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verificarHistorico'");
    }

}
