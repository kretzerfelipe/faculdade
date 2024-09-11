/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista05;

/**
 *
 * @author Felipe
 */
public class Ponto {
    private Integer x;
    private Integer y;
    
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    /**
     *  @return retorna o quadrante no qual o ponto está inserido
    */
    public Quadrante indentificarQuadrante() {
        if (x == 0 || y == 0) {
            return Quadrante.NENHUM;
        }
        
        if (x > 0 && y > 0) {
            return Quadrante.PRIMEIRO;
        }
        
        if (x > 0 && y < 0) {
            return Quadrante.QUARTO;
        }        
        
        if (x < 0 && y < 0) {
            return Quadrante.TERCEIRO;
        }
        
        if (x < 0 && y > 0) {
            return Quadrante.SEGUNDO;
        }
        
        return Quadrante.NENHUM;
    }
    
    /**
     *  @return retorna o se x está sobre o eixo x
    */
    public boolean estaIncidindoSobreX() {
        if (this.x == 0) {
            return true;
        }
        
        return false;
    }
    
    /**
     *  @return retorna o se y está sobre o eixo x
    */
    public boolean estaIncidindoSobreY() {
        if (this.y == 0) {
            return true;
        }
        
        return false;
    }
    
    /**
     * @param paramPonto int - ponto no qual você quer comparar com o ponto do objeto instanciado 
     *  @return retorna a distância entre o parametro e o objeot instanciado
    */
    public double calcularDistancia(Ponto paramPonto) {
        return Math.sqrt(Math.pow(paramPonto.x - this.x, 2) + Math.pow(paramPonto.y - this.y, 2));
    }
    
    /**
     * @param paramPonto01 int - ponto 01 que voce quer ver a distancia
     * @param paramPonto02 int - ponto 02 que voce quer ver a distancia
     *  @return retorna a distância entre os dois ponto
    */
    public double calcularDistancia(Ponto paramPonto01, Ponto paramPonto02) {
        return Math.sqrt(Math.pow(paramPonto01.x - paramPonto02.x, 2) + Math.pow(paramPonto01.x - paramPonto02.x, 2));
    } 
    
    
}
