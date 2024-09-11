/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enums.FaixaIrpf;

/**
 *
 * @author Felipe
 */
public class Funcionario {
    
    private double valorSalario;
    private String nome;

    public Funcionario(double valorSalario, String nome) {
        setValorSalario(valorSalario);
        setNome(nome);
    }

    public double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(double valorSalario) {
        if (valorSalario <= 0) {
            throw new IllegalArgumentException("O salário deve ser maior que zero");
        }
        this.valorSalario = valorSalario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isBlank() || nome.isEmpty()) {
            throw new IllegalArgumentException("Você deve colocar um nome");
        }
        this.nome = nome;
    }
    
    public FaixaIrpf indentificarFaixaIrpg() {
        if (this.valorSalario <= 1903.99) {
            return FaixaIrpf.FAIXA01;
        }
        
        if (this.valorSalario > 1903.99 && this.valorSalario < 2826.66) {
            return FaixaIrpf.FAIXA02;
        }
        
        if (this.valorSalario >= 2826.66 && this.valorSalario <  3751.05) {
            return FaixaIrpf.FAIXA03;
        }
        
        if (this.valorSalario >= 3751.05 && this.valorSalario <  4664.68) {
            return FaixaIrpf.FAIXA04;
        }
        
        if (this.valorSalario >= 4664.68) {
            return FaixaIrpf.FAIXA04;
        }
        
        return FaixaIrpf.FAIXA01;
    }
    
    public double calcularIrpf() {
        if (indentificarFaixaIrpg() == FaixaIrpf.FAIXA01) {
            return 0;
        }
        
        if (indentificarFaixaIrpg() == FaixaIrpf.FAIXA02) {
            return (this.valorSalario - 1903.99) / 100 * 7.5;
        }
        
        if (indentificarFaixaIrpg() == FaixaIrpf.FAIXA03) {
            return (this.valorSalario - 2826.66) / 100 * 15;
        }
        
        if (indentificarFaixaIrpg() == FaixaIrpf.FAIXA04) {
            return (this.valorSalario - 3751.05) / 100 * 22.5;
        }
        
        if (indentificarFaixaIrpg() == FaixaIrpf.FAIXA05) {
            return (this.valorSalario - 4664.68) / 100 * 27.5;
        }
        
        return 0;
    }
    
}
