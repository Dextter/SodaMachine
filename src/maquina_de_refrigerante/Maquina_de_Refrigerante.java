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
        Transacao dindin = new Transacao();
        Estoque stock = new Estoque();
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Modo de Operação:\n"
                            + "1 - Cliente\n"
                            + "2 - Administrador\n");
        
        int modo = sc.nextInt();
        if (modo == 1){                                  
                
            venda.engordarCofrinho();
            
            do{                    
                System.out.println("Escolha:\n"
                                + "1) Coca-Cola - R$ 4,00\n"
                                + "2) Pepsi - R$ 3,50\n"
                                + "3) Fanta - R$ 3,20\n"
                                + "4) Grapette - R$ 2,00\n"
                                + "5) Tocar modo de operação\n"
                                + "0) Sair");           
                int opCompra = sc.nextInt();            
                if (opCompra == 0){
                    modo = 0;
                } else {
                System.out.println("Quantas unidades?");
                int unds = sc.nextInt();            
                switch(opCompra){            
                    case 1:
                        if (venda.dindin.saldo >= 4.0*unds && !stock.coca.isEmpty()){                            
                            stock.removerProduto("Coca-Cola", unds);
                            dindin.adicionarMoedasParaCompra(-(4.0*unds));
                            System.out.println("Compra realizada com sucesso!");
                            System.out.println("Seu saldo: " + venda.dindin.saldo);
                            if (venda.dindin.saldo > 4.0*unds){
                                double valorCompra = 4.0*unds;
                                double troco = valorCompra - venda.dindin.saldo;                                                                
                                if (dindin.saldoMaquina <= venda.dindin.saldo) {
                                    System.out.println("Não há moedas disponíveis para troco.");
                                } else {
                                    System.out.println("Seu troco: " + troco);
                                    dindin.adicionarMoedas(-troco);
                                }
                            }
                        } else if (venda.dindin.saldo < 4.0*unds) {
                            System.out.println("Saldo insuficiente!");
                            System.out.println("Seu saldo: " + venda.dindin.saldo);
                        }
                        dindin.adicionarMoedas(venda.dindin.saldo);
                        System.out.println("Digite 1 caso queira adicionar mais moedas. Se não, digite qualquer valor"
                                                  + "para continuar comprando.");
                        int op = sc.nextInt();
                        if (op == 1){
                            venda.engordarCofrinho();
                        }
                        break;
                        
                    case 2:
                        if (venda.dindin.saldo >= 3.50*unds && !stock.pepsi.isEmpty()){                            
                            stock.removerProduto("Pepsi", unds);
                            dindin.adicionarMoedasParaCompra(-(3.50*unds));
                            System.out.println("Compra realizada com sucesso!");
                            System.out.println("Seu saldo: " + venda.dindin.saldo);
                            if (venda.dindin.saldo > 3.50*unds){
                                double valorCompra = 3.50*unds;
                                double troco = valorCompra - venda.dindin.saldo;                                                                
                                if (dindin.saldoMaquina <= venda.dindin.saldo) {
                                    System.out.println("Não há moedas disponíveis para troco.");
                                } else {
                                    System.out.println("Seu troco: " + troco);
                                    dindin.adicionarMoedas(-troco);
                                }
                            }
                        } else if (venda.dindin.saldo < 3.50*unds) {
                            System.out.println("Saldo insuficiente!");
                        }
                        dindin.adicionarMoedas(venda.dindin.saldo);
                        System.out.println("Digite 1 caso queira adicionar mais moedas. Se não, digite qualquer valor"
                                                 + "para continuar comprando.");
                        op = sc.nextInt();
                        if (op == 1){
                            venda.engordarCofrinho();
                        }
                        break;
                        
                    case 3:
                        if (venda.dindin.saldo >= 3.20*unds && !stock.fanta.isEmpty()){                            
                            stock.removerProduto("Fanta", unds);
                            dindin.adicionarMoedasParaCompra(-(3.20*unds));
                            System.out.println("Compra realizada com sucesso!");
                            System.out.println("Seu saldo: " + venda.dindin.saldo);
                            if (venda.dindin.saldo > 3.20*unds){
                                double valorCompra = 3.20*unds;
                                double troco = valorCompra - venda.dindin.saldo;                                                                
                                if (dindin.saldoMaquina <= venda.dindin.saldo) {
                                    System.out.println("Não há moedas disponíveis para troco.");
                                } else {
                                    System.out.println("Seu troco: " + troco);
                                    dindin.adicionarMoedas(-troco);
                                }
                            }
                        } else if (venda.dindin.saldo < 3.20*unds) {
                            System.out.println("Saldo insuficiente!");
                        }
                        dindin.adicionarMoedas(venda.dindin.saldo);
                        System.out.println("Digite 1 caso queira adicionar mais moedas. Se não, digite qualquer valor"
                                                 + "para continuar comprando.");
                        op = sc.nextInt();
                        if (op == 1){
                            venda.engordarCofrinho();
                        }
                        break;
                        
                    case 4:
                        if (venda.dindin.saldo >= 2.0*unds && !stock.grapette.isEmpty()){                            
                            stock.removerProduto("Grapette", unds);
                            dindin.adicionarMoedasParaCompra(-(2.0*unds));
                            System.out.println("Compra realizada com sucesso!");
                            System.out.println("Seu saldo: " + venda.dindin.saldo);
                            if (venda.dindin.saldo > 2.0*unds){
                                double valorCompra = 2.0*unds;
                                double troco = valorCompra - venda.dindin.saldo;                                                                
                                if (dindin.saldoMaquina <= venda.dindin.saldo) {
                                    System.out.println("Não há moedas disponíveis para troco.");
                                } else {
                                    System.out.println("Seu troco: " + troco);
                                    dindin.adicionarMoedas(-troco);
                                }
                            }
                        } else if (venda.dindin.saldo < 2.0*unds) {
                            System.out.println("Saldo insuficiente!");
                        }
                        dindin.adicionarMoedas(dindin.saldo);
                        System.out.println("Digite 1 caso queira adicionar mais moedas. Se não, digite qualquer valor "
                                                 + "para continuar comprando.");
                        op = sc.nextInt();
                        if (op == 1){
                            venda.engordarCofrinho();
                        }
                        break;
                    case 5:
                        modo = 2;
                        break;                    
                }            
                }
            }while(modo == 1);
            
        } else if(modo == 2){                        
            do{    
                System.out.println("Escolha:\n"
                                + "1 - Adicionar moedas\n"
                                + "2 - Ver estoque\n"
                                + "3 - Adicionar Produtos\n"
                                + "4 - Ver historico de vendas\n"
                                + "5 - Ver saldo da máquina\n"
                                + "6 - Trocar modo de operação\n"
                                + "0 - Sair");
                int opModo = sc.nextInt();
                if (opModo == 0){
                    modo = 0;
                }
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
                        System.out.println("Qual destes proodutos deseja inserir no estoque?"
                                                     + "\nCoca-Cola"
                                                     + "\nPepsi"
                                                     + "\nFanta"
                                                     + "\nGrapette");
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
                    case 6:
                        modo = 1;
                        break;
                    case 0:
                        modo = 0;
                        break;                         
                }            
            }while(modo == 2);
        } else {
            System.out.println("Escolha o modo de entrada");
        }
        
        if (modo == 0){
            System.out.println("Volte sempre!");
        }
        
    }        
}
