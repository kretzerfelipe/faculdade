/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Felipe
 */
public class LancamentoServico {

    final private LancamentoRepository lancamento;
    
    public LancamentoServico(LancamentoRepository lancamento) {
        this.lancamento = lancamento;
    }

    public double consultarSaldoAteHoje() {
        List<Lancamento> lancamentos = lancamento.getLancamentos();
        Date hoje = new Date();
        double valorFinal = 0;

        for (Lancamento element : lancamentos) {
            if (!element.getData().after(hoje)) {
                if (element instanceof Receita receita) {
                    valorFinal = valorFinal + receita.getValor();
                } else if (element instanceof Despesa despesa) {
                    valorFinal = valorFinal - despesa.getValor();
                }
            }

        }

        return valorFinal;
    }

    public double consultarSaldoTotal() {
        List<Lancamento> lancamentos = lancamento.getLancamentos();
        double valorFinal = 0;

        for (Lancamento element : lancamentos) {
            if (element instanceof Receita receita) {
                valorFinal = valorFinal + receita.getValor();
            } else if (element instanceof Despesa despesa) {
                valorFinal = valorFinal - despesa.getValor();
            }
        }

        return valorFinal;
    }

    public List<Receita> listarReceitas() {
        List<Lancamento> lancamentos = lancamento.getLancamentos();
        List<Receita> receitas = new ArrayList<>();

        for (Lancamento element : lancamentos) {
            if (element instanceof Receita receita) {
                receitas.add(receita);
            }
        }

        return receitas;
    }

    public List<Despesa> listarDespesas() {
        List<Lancamento> lancamentos = lancamento.getLancamentos();
        List<Despesa> depesas = new ArrayList<>();

        for (Lancamento element : lancamentos) {
            if (element instanceof Despesa despesa) {
                depesas.add(despesa);
            }
        }

        return depesas;
    }

    public List<Lancamento> listarLancamentosOrdenadosPorData() {
        List<Lancamento> lancamentos = lancamento.getLancamentos();

        lancamentos.sort(Comparator.comparing(Lancamento::getData));

        return lancamentos;
    }
}