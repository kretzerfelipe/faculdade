/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Felipe
 */
public class Main {
    public static void main(String[] args) {
        LancamentoRepositoryCSV lancamentoCSV = new LancamentoRepositoryCSV();
        Date data = new Date(2005, 05, 14);

        Despesa despesa = new Despesa(2, data, CategoriaDespesa.TRANSPORTE);
        
        lancamentoCSV.saveLancamento(despesa);
    }
}
