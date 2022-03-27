
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Tic_tac_toe {
    JFrame frame;
    JButton but_1,but_2,but_3,but_4,but_5,but_6,but_7,but_8,but_9;
    int [] checker = new int[9];

    Tic_tac_toe() {
        ImageIcon X = new ImageIcon("X.png");
        ImageIcon O = new ImageIcon("O.png");

        frame = new JFrame("Tic_tac_toe");
        frame.setTitle("Tic_tac_toe");
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setSize(600,600);

        but_1 = new JButton();
        but_1.setBounds(0,0,200,200);
        but_1.setIcon(X);
        frame.add(but_1);
        but_2 = new JButton();
        but_2.setBounds(200,0,200,200);
        but_2.setIcon(X);
        frame.add(but_2);
        but_3 = new JButton();
        but_3.setBounds(400,0,200,200);
        frame.add(but_3);
        but_4 = new JButton();
        but_4.setBounds(0,200,200,200);
        frame.add(but_4);
        but_5 = new JButton();
        but_5.setBounds(0,400,200,200);
        frame.add(but_5);
        but_6 = new JButton();
        but_6.setBounds(200,200,200,200);
        frame.add(but_6);
        but_7 = new JButton();
        but_7.setBounds(400,200,200,200);
        frame.add(but_7);
        but_8 = new JButton();
        but_8.setBounds(200,400,200,200);
        frame.add(but_8);
        but_9 = new JButton();
        but_9.setBounds(400,400,200,200);
        frame.add(but_9);

        frame.setLayout(null);
        frame.setVisible(true);
    }
    private void actionPerformed(ActionEvent a) {
        if(a.getSource() == but_1) {
            if(checker[0] == 1) {
                //but_1.setText("X");
               // but_1.setIcon(X);
            }
        }
        else if(a.getSource() == but_2) {

        }
        else if(a.getSource() == but_3) {

        }
        else if(a.getSource() == but_4) {

        }
        else if(a.getSource() == but_5) {

        }
        else if(a.getSource() == but_6) {

        }
        else if(a.getSource() == but_7) {

        }
        else if(a.getSource() == but_8) {

        }
        else if(a.getSource() == but_9) {

        }

    }
    public static void main(String [] args) {
        Tic_tac_toe game = new Tic_tac_toe();
    }
}
