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
        Refrigerante products = new Refrigerante();
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
                        dindin.adicionarMoedas(0.05);
                        break;
                    case 25:
                        dindin.adicionarMoedas(0.25);
                        break;
                    case 50:
                        dindin.adicionarMoedas(0.50);
                        break;
                    case 1:
                        dindin.adicionarMoedas(1.0);
                        break;
                 }
                System.out.println("Seu saldo para compras: " + dindin.saldo);
                System.out.println("------------------------------------------------------------");
            } while (din != 0);
            System.out.println("Escolha:\n"
                                + "1 - Coca-Cola\n"
                                + "2 - Pepsi\n"
                                + "3 - Fanta\n"
                                + "4 - Grapette\n"
                                + "0 - Sair");

            int opCompra = sc.nextInt();
            do{    
                switch(opCompra){            
                    case 1:
                        venda.clientePagar("Coca");
                        break;
                        
                    case 2:
                        venda.clientePagar("Pepsi");
                        break;
                        
                    case 3:
                        venda.clientePagar("Fanta");
                        break;
                        
                    case 4:
                        venda.clientePagar("Grapette");
                        break;
                        
                }            
            }while(opCompra != 0);
        } else if(modo == 2){
            System.out.println("Escolha:\n"
                                + "1 - Adicionar moedas\n"
                                + "2 - Ver estoque\n"
                                + "3 - Adicionar Produtos\n"
                                + "4 - Ver historico de vendas\n"
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
                        System.out.println("Digite o nome do produto");
                        String marca = sc.next();
                        System.out.println("Digite o valor do produto");
                        double preco = sc.nextDouble();
        
                        products.setNome(marca);
                        products.setValor(preco);
        
                        stock.addProdutos(products);
                        
                        break;
                        
                    case 4:
                        venda.verHistorico();
                        
                        break;
                        
                }            
            }while(opModo != 0);
        } else {
            System.out.println("Escolha o modo de entrada");
        }
    }
    
    
}
