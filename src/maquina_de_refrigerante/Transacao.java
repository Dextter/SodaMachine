/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina_de_refrigerante;

/**
 *
 * @author pablopc
 */
public class Transacao {
    public double saldo = 0.0;
    public double saldoMaquina = 0.0;
    
    void adicionarMoedas(double inserido) {
        saldoMaquina += inserido;
    }
    
    void adicionarMoedasParaCompra(double inserido) {
        saldo += inserido;
    }
    
}
