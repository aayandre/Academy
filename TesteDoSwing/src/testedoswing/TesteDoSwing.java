/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testedoswing;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author andre.ayamamoto
 */
public class TesteDoSwing {

    /**
     *
     * @author andre.ayamamoto
     * @param args
     */
    //Label -> Panel -> Frame
    public static void main(String[] args) {

        ThreadSwing runMLK = new ThreadSwing();
        SwingUtilities.invokeLater(runMLK);
    }
    
    public static void criaBotao(String nome, Container panel, ActionListener teste) {
        JButton botao = new JButton(nome);
        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(botao);
        ActionListener al = teste;
        //CRIAR CLASSE COM OS ATRIBUTOS DE BOTÃO, NOME, ETC
        
    }
    
    public static void criaOuvintes(ActionListener teste) {
        
    }

    public static void criarGUI() {

        //Instanciado
        JFrame tela = new JFrame();

        //Fecha o app ao clicar no X
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Redimencionando janela
        tela.setMinimumSize(new Dimension(800, 600));

        //Colocar Title
        tela.setTitle("Lalalala");

        //Exibir janela
        tela.pack();
        tela.setVisible(true);

        //Label 
        JLabel titulo = new JLabel("Ola Mundo");
        tela.getContentPane().add(titulo);
        //Criando JPanel
        JPanel panel = new JPanel();
        tela.getContentPane().add(panel);
        panel.add(titulo);

        //Caixa de texto
        JTextField caixadetxt = new JTextField(10);
        panel.add(caixadetxt);

        //Criando um botao
        JButton butao = new JButton("Botao");
        JButton butaoNovo = new JButton("Cuoco");
        JButton butaoDePegarTexto = new JButton("Mostra texto");
        JButton butaoCheckBoquix = new JButton("Boquix");
        
        
        
        
        
        
        
        criaBotao("Mostrar", panel);
        //criaBotao("Novo", panel);
        //criaBotao("Teste", panel);
        //criaBotao("Check", panel);

        //Criar checkBOx
        JCheckBox boquis = new JCheckBox("Storage");
        JCheckBox boquis2 = new JCheckBox("Storage2");

        //Coloca os itens acima na tela
        panel.add(butaoDePegarTexto);
        panel.add(butaoNovo);
        panel.add(butao);
        panel.add(boquis);
        panel.add(butaoCheckBoquix);

        //Declara o listener
        TesteActionListener ouvinte = new TesteActionListener();
        butao.addActionListener(ouvinte);

        //Acoes dos botoes
        ActionListener ouvinteNovo = (ActionEvent e) -> {
            System.out.println("Francisco Cuoco");
        };
        butaoNovo.addActionListener(ouvinteNovo);
        butaoNovo.addActionListener((ActionEvent e) -> {
            System.out.println("LALALALALLALALALLA");
        });

        //Outro botão
        butaoDePegarTexto.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(tela, "Reultado: " + caixadetxt.getText());
        });

        butaoCheckBoquix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(tela, "Item Selecionado: " + boquis2);
            }
        });

        //Checkboquix selecionado ou não
        ItemListener verBoquis = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    JOptionPane.showMessageDialog(tela, "COM OK");
                }
            }
        };

        boquis.addItemListener(verBoquis);

    }

    private static class ActionListenerImpl implements ActionListener {

        private final JFrame tela;

        public ActionListenerImpl(JFrame tela) {
            this.tela = tela;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(tela, "lalalalal");
        }
    }

}
