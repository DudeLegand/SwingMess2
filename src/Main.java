import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Timer;


public class Main {

    private JLabel label;
    private JLabel speed;
    private JButton buttonClick;
    private JButton buttonGetResult;
    private JButton buttonReset;

    private int d, count, rate, x;
    private int[] array;
    private JLabel l;

    public static void main(String[] args) {
        //rickRoll();
        cps();
        //Ticker ticker = new Ticker();

    }

    public static void rickRoll(){
        JFrame f=new JFrame();//creating instance of JFrame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b=new JButton("Don't Click me");//creating instance of JButton
        b.setBounds(130,100,200, 40);//x axis, y axis, width, height

        f.add(b);//adding button in JFrame

        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                try {
                    Desktop.getDesktop().open(new File("N:\\Computers\\Yr 12\\rickroll.mp4"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void cps(){

        final int[] click = {0};
        // Create frame with specific title
        final Frame[] frame = {new Frame("CPS")};

        // Create a component to add to the frame; in this case a text area with sample text
        final TextArea textArea = new TextArea("Don't click the button");

        // Create a component to add to the frame; in this case a button
        Component button = new Button("Click Me!!");
        button.setPreferredSize(new Dimension(100, 100));

        // Add a mouse listener to determine click counts
        button.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) {
                click[0]++;
                textArea.setText(Integer.toString(click[0]));

            }

        });

        // Add the components to the frame; by default, the frame has a border layout
        frame[0].add(textArea, BorderLayout.NORTH);
        frame[0].add(button, BorderLayout.SOUTH);

        // Show the frame
        int width = 300;
        int height = 300;
        frame[0].setSize(width, height);
        frame[0].setVisible(true);


    }


}

