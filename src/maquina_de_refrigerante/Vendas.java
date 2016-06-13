/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina_de_refrigerante;

import java.util.Scanner;



/**
 *
 * @author pablopc
 */
public class Vendas {    
    Transacao dindin = new Transacao();
    Scanner sc = new Scanner (System.in);
    
    void engordarCofrinho(){
        double din = 0;
        do {
                System.out.println("Insira moedas");
                din = sc.nextDouble();
                switch((int)din){                     
                    case 5:
                        dindin.adicionarMoedasParaCompra(0.05);
                        break;
                    case 10:
                        dindin.adicionarMoedasParaCompra(0.1);
                        break;
                    case 25:
                        dindin.adicionarMoedasParaCompra(0.25);
                        break;
                    case 50:
                        dindin.adicionarMoedasParaCompra(0.50);
                        break;
                    case 1:
                        dindin.adicionarMoedasParaCompra(1.0);
                        break;
                 }
                System.out.println("Seu saldo para compras: " + dindin.saldo);
                System.out.println("------------------------------------------------------------");
            } while (din != 0);                                        
    }
    
    void verHistorico() {
        
    }
    
}
