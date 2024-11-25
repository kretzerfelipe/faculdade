/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Felipe
 */
public abstract class Lancamento {
    private double valor;
    private Date data;

    public Lancamento(double valor, Date data) {
        setValor(valor);
        setData(data);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior do que 0");
        }
        this.valor = valor;   
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public String getDataFormatada() {
        LocalDate localDate = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        DateTimeFormatter formatador = DateTimeFormatter.BASIC_ISO_DATE.ofPattern("dd/MM/yyyy");
        return localDate.format(formatador);
    }
}
