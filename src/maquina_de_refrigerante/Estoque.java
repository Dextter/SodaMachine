/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina_de_refrigerante;


import java.util.ArrayList;

/**
 *
 * @author pablopc
 */
public class Estoque {
    
    
   Produto produto = new Produto();
   ArrayList<Produto> coca = new ArrayList();     
   ArrayList<Produto> pepsi = new ArrayList();     
   ArrayList<Produto> fanta = new ArrayList();     
   ArrayList<Produto> grapette = new ArrayList();     
   
    void verStock() {        
        System.out.println("Coca-Colas: " + coca.size()
                                    +"\nPepsis: " + pepsi.size()
                                    + "\nFantas: " + fanta.size()
                                    + "\nGrapettes: " + grapette.size());
    }

    void addProdutos(String nome, int qtd) {
        System.out.println(nome);
        for (int i =0; i < qtd;i++){
            if (nome.equalsIgnoreCase("coca-cola")){
                produto.setNome("Coca-Cola");
                produto.setPreco(4.0);
                coca.add(produto);
            } else if (nome.equalsIgnoreCase("pepsi")){
                produto.setNome("Pepsi");
                produto.setPreco(3.50);
                pepsi.add(produto);
            } else if (nome.equalsIgnoreCase("fanta")){
                produto.setNome("Fanta");
                produto.setPreco(3.20);
                fanta.add(produto);                
            } else if (nome.equalsIgnoreCase("grapette")){
                produto.setNome("Grapette");
                produto.setPreco(2.0);
                grapette.add(produto);
            }
        }
        System.out.println("Adicionado");  
        
    }
    
     void removerProduto(String nome, int qtd) {        
         if (nome.equalsIgnoreCase("coca-cola")){
            coca.remove(qtd);
        } else if (nome.equalsIgnoreCase("pepsi")){
            pepsi.remove(qtd);
        } else if (nome.equalsIgnoreCase("fanta")){
            fanta.remove(qtd);
        } else if (nome.equalsIgnoreCase("grapette")){
            grapette.remove(qtd);
        }
         System.out.println("Vendido");        
    }
}
