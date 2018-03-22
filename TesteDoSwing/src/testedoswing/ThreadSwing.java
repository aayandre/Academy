/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testedoswing;

/**
 *
 * @author andre.ayamamoto
 */
public class ThreadSwing implements Runnable {

    @Override
    public void run() {
        TesteDoSwing.criarGUI();
    }

}
