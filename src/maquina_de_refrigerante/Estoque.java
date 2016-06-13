/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina_de_refrigerante;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pablopc
 */
public class Estoque {
    
    int coca = 0;
    int fanta = 0;
    int pepsi = 0;
    int grapette = 0;    
        
    public String verStock() {        
        return "Coca-Cola:  "   + coca + 
                 "\nFanta:        " + fanta + 
                 "\nPepsi  :      " + pepsi+ 
                 "\nGrapette     " + grapette;
    }

    void addProdutos(String nome, int qtd) {        
        if (nome.toLowerCase() == "coca-cola"){
            coca +=qtd;
        } else if (nome.toLowerCase() == "pepsi"){
            pepsi +=qtd;
        } else if (nome.toLowerCase() == "fanta"){
            fanta+=qtd;
        } else if (nome.toLowerCase() == "grapette"){
            grapette +=qtd;
        }
        System.out.println("Adicionado");        
    }
    
     void removerProduto(String nome, int qtd) {        
         if (nome.toLowerCase() == "coca-cola"){
            coca -= qtd;
        } else if (nome.toLowerCase() == "pepsi"){
            pepsi -= qtd;
        } else if (nome.toLowerCase() == "fanta"){
            fanta -= qtd;
        } else if (nome.toLowerCase() == "grapette"){
            grapette -= qtd;
        }
         System.out.println("Vendido");        
    }
}
