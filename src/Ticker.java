import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ticker extends JPanel {
    private  int d, count, rate, x;
    private int[] array;
    private JLabel l;

    public Ticker() {

        setLayout(new BorderLayout());

        rate = x = 0;
        //JPanel p = new JPanel();

        setLayout(new GridLayout(2, 1));

        JButton b = new JButton("Click");
        b.addActionListener(new Listener());
        b.setHorizontalAlignment(SwingConstants.LEFT);
        add(b);

        l = new JLabel("a");
        l.setHorizontalAlignment(SwingConstants.CENTER);
        add(l);

        Timer  t = new Timer(100, new Listener2());
        t.start();

        array = new int[40];

        for (int k = 0; k < 40; k++)
            array[k] = 0;

    }

    private class Listener implements ActionListener

    {
        public void actionPerformed(ActionEvent e)

        {
            count++;
        }

    }

    private class Listener2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (x > 39)
                x = 0;

            array[x] = count;

            count = 0;

            x++;


            for (int i : array)
            { rate += i;  }

            l.setText("" + (int)(rate/4.0));
            rate = 0;
            //   System.out.println((int)(x) +"     " + array[(x-1)]);
        }
    }

}