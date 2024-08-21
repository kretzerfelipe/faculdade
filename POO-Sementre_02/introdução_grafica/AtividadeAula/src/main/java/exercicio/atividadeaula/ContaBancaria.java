/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.atividadeaula;

/**
 *
 * @author Artur
 */
public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;
    
    public void setNumero(String numero) {
        
        if (numero == null || numero.isBlank()) {
           throw new IllegalArgumentException("O numero da conta informado eh invalido"); 
        }
        this.numero = numero;
    }
  
    public String getNumero() {
        return numero;
    }
    
    public void setTitular(String titular) {
        
        if (titular == null || titular.isBlank()) {
           throw new IllegalArgumentException("O numero da conta informado eh invalido"); 
        }
        this.titular = titular;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do deposito eh invallido");
        }
        this.saldo += valor;
    }
    
    public void sacar(double valor) {
        if (this.saldo < valor) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque eh invalido");
        }
        
        this.saldo -= valor;
    }
    
    /**
     * Transfere um valor do objeto atual para a conta destino
     * @param contaDestino Conta que sera destino da transferencia
     * @param valor Valor da operacao
     */
    public void transferir(ContaBancaria contaDestino, double valor) {
        if (contaDestino == null){
            throw new IllegalArgumentException("A conta nao existe");
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
}
