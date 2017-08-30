/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap2classeseobjetos;

/**
 *
 * @author andre.ayamamoto
 */
public class Lampada {

    public boolean acesa;

    public void desligar() {
        this.acesa = false;
    }

    public void ligar() {
        this.acesa = true;
    }

    public void mostrarEstado() {
        if (acesa) {
            System.out.println("Acesa");
        } else {
            System.out.println("Apagada");
        }

    }

}
