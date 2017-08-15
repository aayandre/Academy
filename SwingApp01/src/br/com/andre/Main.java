/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.andre;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Popup;
import javax.swing.SwingUtilities;

/**
 *
 * @author andre.ayamamoto
 */
public class Main {

    public static void main(String[] args) {

        Runnable thread = new Runnable() {
            public void run() {
                criarGUI();
            }
        };

        SwingUtilities.invokeLater(thread);
    }

    public static void criarGUI() {
        //Instanciado
        JFrame frame = new JFrame("Teste");

        //Fecha o app ao clicar no X
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Redimencionando janela
        frame.setMinimumSize(new Dimension(800, 600));

        //Criando JPanel
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        //Mostrar as coisas no app
        JLabel titulo = new JLabel("Olá Mundo");
        JLabel texto = new JLabel("Outro teste");
        JLabel texto2 = new JLabel("Lalalala");
        panel.add(titulo);
        panel.add(texto);
        panel.add(texto2);

        //Caixa de texto
        JTextField field = new JTextField(10);
        panel.add(field);

        //Criando um batão
        JButton botao = new JButton("Botão");
        panel.add(botao);

        //Exibir janela
        frame.pack();
        frame.setVisible(true);

    }

}
