package com.ufms;

import com.ufms.controllers.ControleBiblioteca;
import com.ufms.models.Chave;
import com.ufms.models.Computador;
import com.ufms.models.Livro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ControleBiblioteca biblioteca = new ControleBiblioteca();
        String ra;
        int codigo, escolha;

        while(true) {

            System.out.println("A - Arquivo (Empréstimos) : ");
            System.out.println("B - Gerenciamento de Itens : ");
            System.out.println("C - Sair");
            String tipoOperacao = scanner.nextLine();

            if(tipoOperacao.equals("A")) {
                System.out.println("1 - Emprestar Item");
                System.out.println("2 - Devolver Item");
                System.out.println("3 - Verificar Histórico de Item");

                escolha = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Código do Item : ");
                codigo = scanner.nextInt();
                scanner.nextLine();

                switch (escolha) {
                    case 1:  
                        System.out.println("RA : ");
                        ra = scanner.nextLine();

                        biblioteca.realizarEmprestimo(biblioteca.buscarItem(codigo), ra);
                        break;
                    case 2:
                        System.out.println("RA : ");
                        ra = scanner.nextLine();

                        biblioteca.realizarDevolucao(biblioteca.buscarItem(codigo), ra);
                        break;
                    case 3:
                        System.out.println(biblioteca.verificarHistorico(biblioteca.buscarItem(codigo)));
                    default:
                        break;
                }
            }

            if(tipoOperacao.equals("B")) {
                System.out.println("1 - Adicionar Item");
                System.out.println("2 - Editar Item");
                System.out.println("3 - Buscar Item");
                System.out.println("4 - Listar Itens");
                System.out.println("5 - Excluir Item");

                escolha = scanner.nextInt();
                scanner.nextLine();

                switch(escolha) {
                    case 1:
                        System.out.println("1 - Livro");
                        System.out.println("2 - Chave");
                        System.out.println("3 - Computador");

                        escolha = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Código : ");
                        codigo = scanner.nextInt();
                        scanner.nextLine();

                        switch(escolha) {
                            case 1:
                                System.out.println("Autor : ");
                                String autor = scanner.nextLine();
                                System.out.println("Nome : ");
                                String nome = scanner.nextLine();
                                System.out.println("Categoria : ");
                                String categoria = scanner.nextLine();
                                System.out.println("Ano de publicação : ");
                                int ano = scanner.nextInt();
                                scanner.nextLine();
                                
                                biblioteca.adicionarItem(new Livro(codigo, autor, nome, categoria, ano));
                                break;
                            case 2:
                                System.out.println("Número do Armário : ");
                                int numeroArmario = scanner.nextInt();
                                scanner.nextLine();

                                biblioteca.adicionarItem(new Chave(codigo, numeroArmario));
                                break;
                            case 3:
                                System.out.println("Modelo : ");
                                String modelo = scanner.nextLine();
                                
                                biblioteca.adicionarItem(new Computador(codigo, modelo));
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("1 - Livro");
                        System.out.println("2 - Chave");
                        System.out.println("3 - Computador");

                        escolha = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("\nCódigo : ");
                        codigo = scanner.nextInt();
                        scanner.nextLine();

                        switch(escolha) {
                            case 1:
                                System.out.println("Autor : ");
                                String autor = scanner.nextLine();
                                System.out.println("Nome : ");
                                String nome = scanner.nextLine();
                                scanner.nextLine();
                                System.out.println("Categoria : ");
                                String categoria = scanner.nextLine();
                                System.out.println("Ano de publicação : ");
                                int ano = scanner.nextInt();
                                scanner.nextLine();
                                
                                biblioteca.editarItem(codigo, new Livro(codigo, autor, nome, categoria, ano));
                                break;
                            case 2:
                                System.out.println("Número do Armário : ");
                                int numeroArmario = scanner.nextInt();
                                scanner.nextLine();

                                biblioteca.editarItem(codigo, new Chave(codigo, numeroArmario));
                                break;
                            case 3:
                                System.out.println("Modelo : ");
                                String modelo = scanner.nextLine();
                                
                                biblioteca.editarItem(codigo, new Computador(codigo, modelo));
                                break;
                            default:
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Digite o código : ");
                        escolha = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println(biblioteca.buscarItem(escolha));
                        break;
                    case 4:
                        System.out.println(biblioteca.listarItens());
                        break;
                    case 5:
                        System.out.println("Digite o código : ");
                        escolha = scanner.nextInt();
                        scanner.nextLine();

                        biblioteca.deletarItem(escolha);
                        break;
                    default:
                        break;
                }
            }
            
            if(tipoOperacao.equals("C")) {
                break;
            }
        }

        scanner.close();
    }
}