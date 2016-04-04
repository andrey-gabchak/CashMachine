package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by coura on 03.04.2016.
 */
public class Test implements ActionListener{


    public static void main(String[] args) {
        JFrame frame = new JFrame("Банкомат");
        JPanel panel = new JPanel();
        GridLayout g = new GridLayout(3, 2);
        JButton b1 = new JButton("Пополнить");
        JButton b2 = new JButton("Снять");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JLabel l1 = new JLabel("Баланс");
        JLabel l2 = new JLabel("Сумма");



        panel.setLayout(g);

        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        panel.add(b1);
        panel.add(b2);

        frame.setContentPane(panel);
        frame.setSize(300,200);
        frame.setVisible(true);


        ActionListener actionListener = new Progi();
        b1.addActionListener(actionListener);
        b2.addActionListener(actionListener);
        t1.addActionListener(actionListener);
        t2.addActionListener(actionListener);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Пополнить"))
            StringBuilder str = new StringBuilder(t1.getText());
        else
            System.out.print("");


    }

}
