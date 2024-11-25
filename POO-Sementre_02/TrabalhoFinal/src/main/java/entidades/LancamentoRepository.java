/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package entidades;

import java.util.List;

/**
 *
 * @author Felipe
 */
public interface LancamentoRepository {
    void saveLancamento(Lancamento lancamento);
    List<Lancamento> getLancamentos();
}
