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
    
    ArrayList<Refrigerante> produtos = new ArrayList();
    
    Scanner sc = new Scanner(System.in);
    
    
    public String verStock() {        
        for (int i =0; i < produtos.size(); i++){
            System.out.println(i + " - " + produtos.get(i).getNome());            
        }
       return "Pront";
    }

    void addProdutos(Refrigerante prod) {        
        produtos.add(prod);
        System.out.println("Adicionado");        
    }
    
     void removerProduto(Refrigerante prod) {        
        produtos.remove(prod);
        System.out.println("Vendido");        
    }
}
