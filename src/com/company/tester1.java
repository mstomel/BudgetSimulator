package com.company;
import javax.swing.*;
import java.awt.event.*;

public class tester1 extends JFrame implements ActionListener {
    //awt is the basic ui interface for java
    //swing is more cusomizable

    JTextField tf;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    String op = "";
    public tester1(){

        tf = new JTextField();
        tf.setBounds(100, 500, 300, 20);
        tf.setEditable(false);

        b1 = new JButton("1");
        b1.setBounds(50, 50, 125, 75);
        b1.addActionListener(this);
        b2 = new JButton("2");
        b2.setBounds(175, 50, 125, 75);
        b2.addActionListener(this);
        b3 = new JButton("3");
        b3.setBounds(300, 50, 125, 75);
        b3.addActionListener(this);
        b4 = new JButton("4");
        b4.setBounds(50, 150, 125, 75);
        b4.addActionListener(this);
        b5 = new JButton("5");
        b5.setBounds(175, 150, 125, 75);
        b5.addActionListener(this);
        b6 = new JButton("6");
        b6.setBounds(300, 150, 125, 75);
        b6.addActionListener(this);
        b7 = new JButton("7");
        b7.setBounds(50, 250, 125, 75);
        b7.addActionListener(this);
        b8 = new JButton("8");
        b8.setBounds(175, 250, 125, 75);
        b8.addActionListener(this);
        b9 = new JButton("9");
        b9.setBounds(300, 250, 125, 75);
        b9.addActionListener(this);
        b0 = new JButton("0");
        b0.setBounds(175, 350, 125, 75);
        b0.addActionListener(this);




        add(tf);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);


        setSize(500, 600);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == b1){
            op += "1";
            tf.setText(op);
        }
        else if(e.getSource() == b2){
            op += '2';
            tf.setText(op);
        }
        else if(e.getSource() == b3){
            op += "3";
            tf.setText(op);
        }
        else if(e.getSource() == b4){
            op += "4";
            tf.setText(op);
        }
        else if(e.getSource() == b5){
            op += "5";
            tf.setText(op);
        }
        else if(e.getSource() == b6){
            op += "6";
            tf.setText(op);
        }
        else if(e.getSource() == b7){
            op += "7";
            tf.setText(op);
        }
        else if(e.getSource() == b8){
            op += "8";
            tf.setText(op);
        }
        else if(e.getSource() == b9){
            op += "9";
            tf.setText(op);
        } else if (e.getSource() == b0) {
            op += "0";
            tf.setText(op);
        }
    }
}
