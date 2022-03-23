import java.awt.EventQueue;

import javax.swing.JFrame;

public class WindowOpener {

    private static final int WINDOW_COUNT = 10;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                for (int j = 0; j < 10; j++) {
                    for (int i = 0; i < WINDOW_COUNT; i++) {
                        JFrame f = new JFrame();
                        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        f.setLocation((int)(Math.random()*1500),(int)(Math.random()*1000));
                        f.setSize(10, 10);
                        f.setVisible(true);
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
    }
} 