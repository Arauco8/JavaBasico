package com.example.javaBasico.swingTax;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MainForm {
    private JPanel taxPanel;
    private JTextPane panePrice;
    private JTextPane taxPane;
    private JTextPane totalPane;
    private JButton buttonCalculate;

    public MainForm() {

       buttonCalculate.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(java.awt.event.ActionEvent e) {
               double p = Double.parseDouble(panePrice.getText());
               double t = Double.parseDouble(taxPane.getText());

               double result = p + ( p / 100 * t);
               totalPane.setText(String.valueOf(result));
           }
       });

//        panePrice.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//                super.keyTyped(e);
//                String valorPrecio = panePrice.getText() + "ñ";
//                panePrice.setText(valorPrecio);
//            }
//        });
    }

    public static void main(String []args){
        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new MainForm().taxPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
