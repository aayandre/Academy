/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testedoswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author andre.ayamamoto
 */
public class TesteActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Teste do listener");
    }
    
}
