package com.company;
import javax.swing.*;
import java.awt.event.*;

public class tester1 {
    //awt is the basic ui interface for java
    //swing is more custom friendly
    /*

    !!!!CURRENTLY UNDERGOING MAINTENANCE!!!!


    private JTextField tf;
    private JLabel dr;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bReturn;
    static String output = "";
    private String op = "";
    static boolean toggle = false;
    private  JFrame frame;
    tester1(){

        //Creation of button and text inout fields.  Text Field is uneditable but that can be changed easily
        //use this basic structure for stuff being pressed that makes stuff happen

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

        bReturn = new JButton("Enter");
        bReturn.setBounds(300, 350, 125, 75);
        bReturn.addActionListener(this);

        dr = new JLabel("Please input the barcode");
        dr.setBounds(170, 25, 150, 20);


        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);


        frame.add(tf);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b0);
        frame.add(bReturn);
        frame.add(dr);


        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    /*
    private static Object lock = new Object();
private static JFrame frame = new JFrame();
/**
 * @param args

    public static void main(String[] args) {

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);

        Thread t = new Thread() {
            public void run() {
                synchronized(lock) {
                    while (frame.isVisible())
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    System.out.println("Working now");
                }
            }
        };
        t.start();

        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent arg0) {
                synchronized (lock) {
                    frame.setVisible(false);
                    lock.notify();
                }
            }

        });

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
        else if(e.getSource() == bReturn){
            output = op;
            toggle = true;
            op = "";
            tf.setText(op);
            frame.dispose();

        }
    }
}
*/
}