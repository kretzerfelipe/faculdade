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
public class Despesa extends Lancamento {
    private CategoriaDespesa categoria;

    public Despesa(double valor, Date data, CategoriaDespesa categoria) {
        super(valor, data);
        setCategoriaDespesa(categoria);
    }

    public CategoriaDespesa getCategoriaDespesa() {
        return categoria;
    } 

    public void setCategoriaDespesa(CategoriaDespesa categoriaReceita) {
        this.categoria = categoriaReceita;
    }
}
