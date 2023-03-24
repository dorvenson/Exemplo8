/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exemplo8_10 extends JFrame {
    private JTextField campoTexto;
    private JTextArea areaTexto;

    public Exemplo8_10() {
        initComponents();
        definirEventos();
        setBounds(100, 100, 300, 300);
    }

    private void initComponents() {
        campoTexto = new JTextField();
        areaTexto = new JTextArea();
        JButton botaoApagar = new JButton("Apagar");

        campoTexto.setPreferredSize(new Dimension(100, 30));
        areaTexto.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(areaTexto);

        JPanel painel = new JPanel(new BorderLayout());
        painel.add(campoTexto, BorderLayout.NORTH);
        painel.add(scrollPane, BorderLayout.CENTER);
        painel.add(botaoApagar, BorderLayout.SOUTH);

        setContentPane(painel);
        setTitle("Exemplo JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void definirEventos() {
        campoTexto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                areaTexto.append(campoTexto.getText() + "\n");
                campoTexto.setText("");
            }
        });

        JButton botaoApagar = (JButton) ((JPanel) getContentPane()).getComponent(2);
        botaoApagar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                campoTexto.setText("");
                areaTexto.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new Exemplo8_10();
    }
}