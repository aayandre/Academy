/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap2atividadesalaclasses;

/**
 *
 * @author andre.ayamamoto
 */
public class Contador {

    private int valorEncap;

    public int getValorEncap() {
        return valorEncap;
    }
    
    public void incremento() {
        this.valorEncap++;
    }

    public void zerar() {
        this.valorEncap = 0;
    }

    public Contador(){}

}
