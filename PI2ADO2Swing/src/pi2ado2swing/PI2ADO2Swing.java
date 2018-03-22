/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi2ado2swing;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.text.View;

/**
 *
 * @author aayan
 */
public class PI2ADO2Swing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Runnable thread = new Runnable() {
            @Override
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
        painelPrincipal(frame, panel);
    }

    private static void configFrame(JFrame frame) {
        Dimension resolucao = new Dimension(400, 400);
        frame.setMinimumSize(resolucao);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Programa do SWING");
        frame.pack();
        frame.setVisible(true);
    }

    private static void painelPrincipal(JFrame frame, JPanel painelPrincipal) {
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.PAGE_AXIS));

        //Criacao dos paineis
        JPanel painelNome = new JPanel();
        JPanel painelEndereco = new JPanel();
        JPanel painelTelefone = new JPanel();
        JPanel painelAreaBotoes = new JPanel();

        //Painel Nome
        painelNome.setLayout(new FlowLayout(View.WEST));
        JLabel textoNome = new JLabel("Nome:       ");
        JTextField entradaNome = new JTextField(30);
        painelNome.add(textoNome);
        painelNome.add(entradaNome);
        //----------------------------------------------------------------------

        //Painel Endereco
        painelEndereco.setLayout(new FlowLayout(View.WEST));
        JLabel textoEndereco = new JLabel("Endereco: ");
        JTextField entradaEndereco = new JTextField(30);
        painelEndereco.add(textoEndereco);
        painelEndereco.add(entradaEndereco);
        //----------------------------------------------------------------------

        //Painel Telefone
        painelTelefone.setLayout(new FlowLayout(View.WEST));
        JLabel textoTelefone = new JLabel("Telefone:  ");
        JTextField entradaTelefone = new JTextField(30);
        painelTelefone.add(textoTelefone);
        painelTelefone.add(entradaTelefone);
        //----------------------------------------------------------------------

        //Painel Botoes
        painelAreaBotoes.setLayout(new FlowLayout(View.RIGHT));

        JButton salvar = new JButton("Salvar");
        JButton mostrar = new JButton("Mostrar");

        //Acoes
        ActionListener salvamento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        };

        ActionListener mostrarResumo = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, String.format("Nome: %s\nEndereco: %s\nTelefone: %s\n",
                        entradaNome.getText(),
                        entradaEndereco.getText(),
                        entradaTelefone.getText())
                );
            }
        };
        mostrar.addActionListener(mostrarResumo);

        painelAreaBotoes.add(salvar);
        painelAreaBotoes.add(mostrar);
        //----------------------------------------------------------------------

        //Adicionando os elementos ao painel principal
        frame.add(painelPrincipal);
        painelPrincipal.add(painelNome);
        painelPrincipal.add(painelEndereco);
        painelPrincipal.add(painelTelefone);
        painelPrincipal.add(painelAreaBotoes);

    }

}
