package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class tester2 {
    //using this for making usable ui elements tht are inegrated into the program

    private static Object lock = new Object();
private static JFrame frame = new JFrame();
/**
 * @param args
*/
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
    }


}
