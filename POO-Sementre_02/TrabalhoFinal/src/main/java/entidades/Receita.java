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
public class Receita extends Lancamento {
    private CategoriaReceita categoriaReceita;

    public Receita(double valor, Date data, CategoriaReceita categoriaReceita) {
        super(valor, data);
        setCategoriaReceita(categoriaReceita);
    }

    public CategoriaReceita getCategoriaReceita() {
        return categoriaReceita;
    }

    public void setCategoriaReceita(CategoriaReceita categoriaReceita) {
        this.categoriaReceita = categoriaReceita;
    }
}
