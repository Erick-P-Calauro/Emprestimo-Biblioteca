package com.ufms.models;

import java.time.LocalDateTime;

public class Emprestimo extends IEmprestimo {
    
    private ItemBiblioteca item;

    Emprestimo() {

    }

    Emprestimo(String RADevedor, LocalDateTime inicioEmprestimo, LocalDateTime fimEmprestimo, ItemBiblioteca item) {
        super(RADevedor, inicioEmprestimo, fimEmprestimo);
        this.item = item;
    }

    public ItemBiblioteca getItem() {
        return item;
    }

    public void setItem(ItemBiblioteca item) {
        this.item = item;
    }

}
