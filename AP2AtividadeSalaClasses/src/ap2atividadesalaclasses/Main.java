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
public class Main {

    public static void main(String[] args) {

        Contador itensQnt = new Contador();

        System.out.println(itensQnt.getValorEncap());
        itensQnt.incremento();
        itensQnt.incremento();
        itensQnt.incremento();
        itensQnt.incremento();
        itensQnt.incremento();
        itensQnt.incremento();
        System.out.println(itensQnt.getValorEncap());

        itensQnt.zerar();
        System.out.println(itensQnt.getValorEncap());

    }

}
