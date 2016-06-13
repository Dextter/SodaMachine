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
 * 
 * Eu abstraí o usuario Administrador aos medotos de classes as quais só ele tem acesso
 * tipo: so quem pode adicionar produtos ou moedas é ele, mas como não é necessário logar, 
 * fiz apenas um if pra definir as permissoes, sem precisar da classe ADM
 * 
 * Tô usando o metodo de desenvolvimento XP, que se caracteriza pela programação de
 * tráz para frente.
 * 
 * 
 */


public class Maquina_de_Refrigerante {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Vendas venda = new Vendas();        
        Dinheiro dindin = new Dinheiro();
        Estoque stock = new Estoque();
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Modo de Operação:\n"
                            + "1 - Cliente\n"
                            + "2 - Administrador\n");
        
        int modo = sc.nextInt();
        if (modo == 1){          
            double din = 0;
            do {
                System.out.println("Insira moedas");
                din = sc.nextDouble();
                switch((int)din){                     
                    case 5:
                        dindin.adicionarMoedasParaCompra(0.05);
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
            System.out.println("Escolha:\n"
                                + "1) Coca-Cola - R$ 4,00\n"
                                + "2) Pepsi - R$ 3,50\n"
                                + "3) Fanta - R$ 3,20\n"
                                + "4) Grapette - R$ 2,00\n"
                                + "0) Sair");

            int opCompra = sc.nextInt();            
            System.out.println("Quantas unidades?");
            int unds = sc.nextInt();
            do{    
                switch(opCompra){            
                    case 1:
                        if (dindin.saldo >= 4.0*unds){                            
                            stock.removerProduto("Coca-Cola", unds);
                            System.out.println("Compra realizada com sucesso!");
                            if (dindin.saldo > 4.0*unds){
                                double valorCompra = 4.0*unds;
                                double troco = valorCompra - dindin.saldo;
                                System.out.println("Seu troco: " + troco);
                                dindin.adicionarMoedas(-troco);
                           } 
                           if(dindin.saldoMaquina <= dindin.saldo){
                                    System.out.println("Não há moedas disponíveis para troco.");
                                }
                        } else if (dindin.saldo < 4.0*unds) {
                            System.out.println("Saldo insuficiente!");
                        }
                        dindin.adicionarMoedas(dindin.saldo);
                        break;
                        
                    case 2:
                        if (dindin.saldo >= 3.50*unds){                            
                            stock.removerProduto("Pepsi", unds);
                            System.out.println("Compra realizada com sucesso!");
                            if (dindin.saldo > 3.50*unds){
                                double valorCompra = 3.50*unds;
                                double troco = valorCompra - dindin.saldo;
                                System.out.println("Seu troco: " + troco);
                                dindin.adicionarMoedas(-troco);
                            } 
                            if(dindin.saldoMaquina <= dindin.saldo){
                                    System.out.println("Não há moedas disponíveis para troco.");
                                }
                        } else if (dindin.saldo < 3.50*unds) {
                            System.out.println("Saldo insuficiente!");
                        }
                        dindin.adicionarMoedas(dindin.saldo);
                        break;
                        
                    case 3:
                        if (dindin.saldo >= 3.20*unds){                            
                            stock.removerProduto("Fanta", unds);
                            System.out.println("Compra realizada com sucesso!");
                            if (dindin.saldo > 3.20*unds){
                                double valorCompra = 3.20*unds;
                                double troco = valorCompra - dindin.saldo;
                                if (dindin.saldo < dindin.saldoMaquina){
                                    System.out.println("Seu troco: " + troco);
                                    dindin.adicionarMoedas(-troco);
                                } 
                                if(dindin.saldoMaquina <= dindin.saldo){
                                    System.out.println("Não há moedas disponíveis para troco.");
                                    }
                           }
                        } else if (dindin.saldo < 3.20*unds) {
                            System.out.println("Saldo insuficiente!");
                        }
                        dindin.adicionarMoedas(dindin.saldo);
                        break;
                        
                    case 4:
                        if (dindin.saldo >= 2.0*unds){                            
                            stock.removerProduto("Grapette", unds);
                            System.out.println("Compra realizada com sucesso!");
                            if (dindin.saldo > 2.0*unds){
                                double valorCompra = 2.0*unds;
                                double troco = valorCompra - dindin.saldo;
                                System.out.println("Seu troco: " + troco);
                                dindin.adicionarMoedas(-troco);
                           } 
                           if (dindin.saldoMaquina <= dindin.saldo) {
                                    System.out.println("Não há moedas disponíveis para troco.");
                                }
                        } else if (dindin.saldo < 2.0*unds) {
                            System.out.println("Saldo insuficiente!");
                        }
                        dindin.adicionarMoedas(dindin.saldo);
                        break;
                        
                }            
            }while(opCompra != 0);
        } else if(modo == 2){
            System.out.println("Escolha:\n"
                                + "1 - Adicionar moedas\n"
                                + "2 - Ver estoque\n"
                                + "3 - Adicionar Produtos\n"
                                + "4 - Ver historico de vendas\n"
                                + "5 - Ver saldo da máquina\n"
                                + "0 - Sair");

            int opModo = sc.nextInt();
            do{    
                switch(opModo){            
                    case 1:
                        System.out.println("Digite o valor a ser inserido");
                        double inserted = sc.nextDouble();
                        dindin.adicionarMoedas(inserted);
                        
                        break;
                        
                    case 2:
                        stock.verStock();                        
                        break;
                        
                    case 3:
                        System.out.println("Qual destes proodutos deseja inserir no estoque?");
                        String marca = sc.next();
                        System.out.println("Digite quantas unidades deseja estocar:");
                        int qtd = sc.nextInt();                                            
                        
                        if(null!=marca.toLowerCase())switch (marca.toLowerCase()) {
                            case "coca-cola":
                                stock.addProdutos("Coca-Cola", qtd);
                            break;
                            case "pepsi":
                                stock.addProdutos("Pepsi", qtd);
                            break;
                            case "fanta":
                                stock.addProdutos("Fanta", qtd);
                            break;
                            case "grapette":                                                                                                
                                stock.addProdutos("Grapette", qtd);
                            break;
                            default:
                                System.out.println("Digite as informações dispostas acima.");
                            break;
                        }
                        
                        break;
                        
                    case 4:
                        venda.verHistorico();                        
                        break;
                     case 5:
                         System.out.println("Saldo da máquina: " + dindin.saldoMaquina);
                         break;
                }            
            }while(opModo != 0);
        } else {
            System.out.println("Escolha o modo de entrada");
        }
    }
    
    
}
