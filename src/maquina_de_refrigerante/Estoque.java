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
   ArrayList<Produto> estoque = new ArrayList();     
   
    void verStock() {        
        for (int i = 0; i < estoque.size(); i++){
            System.out.println(estoque.get(i).getNome());
        }
        
    }

    void addProdutos(String nome, int qtd) {        
        if (nome.toLowerCase() == "coca-cola"){
            produto.setNome("Coca-Cola");
            produto.setPreco(4.0);
            estoque.add(produto);
        } else if (nome.toLowerCase() == "pepsi"){
            produto.setNome("Pepsi");
            produto.setPreco(3.50);
            estoque.add(produto);
        } else if (nome.toLowerCase() == "fanta"){
            produto.setNome("Fanta");
            produto.setPreco(3.20);
            estoque.add(produto);
        } else if (nome.toLowerCase() == "grapette"){
            produto.setNome("Grapette");
            produto.setPreco(2.0);
            estoque.add(produto);
        }
        System.out.println("Adicionado");        
    }
    
//     void removerProduto(String nome, int qtd) {        
//         if (nome.toLowerCase() == "coca-cola"){
//            coca -= qtd;
//        } else if (nome.toLowerCase() == "pepsi"){
//            pepsi -= qtd;
//        } else if (nome.toLowerCase() == "fanta"){
//            fanta -= qtd;
//        } else if (nome.toLowerCase() == "grapette"){
//            grapette -= qtd;
//        }
//         System.out.println("Vendido");        
//    }
}
