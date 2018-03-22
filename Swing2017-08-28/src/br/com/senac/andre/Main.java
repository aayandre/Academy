/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.andre;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Collectors;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.text.html.CSS;

/**
 *
 * @author Main.ayamamoto
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

    static void criarGUI() {

        JFrame frame = new JFrame();
        configFrame(frame);
        JPanel panel = new JPanel();
        configPanel(frame, panel);
    }

    private static void configFrame(JFrame frame) {
        Dimension resolucao = new Dimension(800, 600);
        frame.setMinimumSize(resolucao);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Programa do SWING");
        frame.pack();
        frame.setVisible(true);
    }

    private static void configPanel(JFrame frame, JPanel panel) {
        panel.setLayout(new GridLayout(0, 1));
        frame.getContentPane().add(panel);

        //Radio Button
        JRadioButton radio01 = new JRadioButton("1º Opção");
        JRadioButton radio02 = new JRadioButton("2º Opção");
        panel.add(radio01, BorderLayout.CENTER);
        panel.add(radio02, BorderLayout.CENTER);

        //Button Group
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radio01);
        grupo.add(radio02);
        

        //Botões
        JButton botao = new JButton("Validar");
        JButton botao1 = new JButton("Botão1");
        JButton botao2 = new JButton("Botão2");
        JButton botao3 = new JButton("Botão3");
        panel.add(botao, BorderLayout.EAST);
        panel.add(botao1, BorderLayout.SOUTH);
        panel.add(botao2, BorderLayout.SOUTH);
        panel.add(botao3, BorderLayout.SOUTH);

        //Combo Box
        String[] opcoes = {"01", "02", "03", "04", "05"};
        JComboBox combo = new JComboBox(opcoes);
        panel.add(combo, BorderLayout.NORTH);

        //Ação
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Opção 1: " + radio01.isSelected()
                        + "\nOpção 2: " + radio02.isSelected() + "\nOpção selecionada: " + combo.getSelectedItem());
            }
        });
    }

}
