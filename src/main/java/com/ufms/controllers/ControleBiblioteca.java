package com.ufms.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.ufms.models.ItemBiblioteca;
import com.ufms.models.Emprestimo;
import com.ufms.models.IEmprestimo;
import com.ufms.models.OperacoesBiblioteca;

public class ControleBiblioteca implements OperacoesBiblioteca {

    private List<ItemBiblioteca> itens;
    private List<IEmprestimo> historico;

    public ControleBiblioteca() {
        this.itens = new ArrayList<>();
        this.historico = new ArrayList<>();
    }


    @Override
    public void registrarEmprestimo(IEmprestimo emprestimo) {
    	this.historico.add(emprestimo);
        System.out.println("Empréstimo registrado no histórico: " + emprestimo.toString());
    }

    @Override
    public void registrarDevolucao(IEmprestimo emprestimo) {
    	this.historico.add(emprestimo);
        System.out.println("Devolução registrada no histórico: " + emprestimo.toString());
    }

    @Override
    public boolean verificarValidade(IEmprestimo emprestimo) {
        LocalDateTime dataAtual = LocalDateTime.now();
        return emprestimo.getFimEmprestimo().isAfter(dataAtual);
    }


    @Override
    public void adicionarItem(ItemBiblioteca item) {
        this.itens.add(item);
    }

    @Override
    public void editarItem(int codigo, ItemBiblioteca itemNovo) {
        for (int i = 0; i < this.itens.size(); i++) {
            ItemBiblioteca itemAtual = this.itens.get(i);
            
            if (itemAtual.getCodigo() == codigo) {
                this.itens.set(i, itemNovo);
                
              
                System.out.println("Item código " + codigo + " editado com sucesso.");
                return;
            }
        }
        
        System.out.println("Item código " + codigo + " não encontrado para edição.");
    }

    @Override
    public ItemBiblioteca buscarItem(int codigo) {
        for (ItemBiblioteca item : this.itens) {
            if (item.getCodigo() == codigo) {
                return item;
            }
        }
       return null;
    }

    @Override
    public List<ItemBiblioteca> listarItens() {
    	return this.itens;
    }

    @Override
    public void deletarItem(int codigo) {
        for (int i = 0; i < this.itens.size(); i++) {
            ItemBiblioteca itemAtual = this.itens.get(i);
            
            if (itemAtual.getCodigo() == codigo) { 
                this.itens.remove(i);              
                return;
            }
        }
    }
    @Override
    public void realizarEmprestimo(ItemBiblioteca item, String RA_Devedor) {
        
        if(item.isStatus()) {
            System.out.println("O Item em questão já está emprestado.");
            
            return;
        }
        
        item.setStatus(true);
        this.editarItem(item.getCodigo(), item);

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setRADevedor(RA_Devedor);
        emprestimo.setItem(item);
        emprestimo.setInicioEmprestimo(LocalDateTime.now());


        this.registrarEmprestimo(emprestimo);
    }


    @Override
    public void realizarDevolucao(ItemBiblioteca item, String RA_Devedor) {
    	
        if(!item.isStatus()) {
            System.out.println("Não há nenhum empréstimo associado ao item");
        }
        
        item.setStatus(false);
        this.editarItem(item.getCodigo(), item);

        for(IEmprestimo e : historico) {
            if(e instanceof Emprestimo em) {
                if(em.getItem().getCodigo() == item.getCodigo()) {
                    em.setFimEmprestimo(LocalDateTime.now());
                    historico.set(historico.indexOf(e), em);
                }
            }
        }
    }

    @Override
    public List<IEmprestimo> verificarHistorico(ItemBiblioteca item) {
    	List<IEmprestimo> item_historico = new ArrayList<IEmprestimo>();
        
        for(IEmprestimo e : historico) {
            if(e instanceof Emprestimo em && em.getItem().getCodigo() == item.getCodigo()) {
                item_historico.add(em);
            }
        }

        return item_historico;
    }
}