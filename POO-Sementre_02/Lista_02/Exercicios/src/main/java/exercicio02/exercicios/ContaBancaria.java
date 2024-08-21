/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02.exercicios;

/**
 *
 * @author felip
 */
public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException("Numero de conta irregular");
        }

        this.numero = numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String numero) {
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException("Numero de conta irregular");
        }

        this.numero = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Não é possível depositar valor negativo");
        }

        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Não é possível sacar valor negativo");
        }

        saldo -= valor;
    }

//    public void transferir(ContaBancaria contaDestino, ContaBancaria contaBancaria, double valor) {
//        
//    }
}
