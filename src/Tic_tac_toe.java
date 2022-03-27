import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tic_tac_toe extends JFrame implements ActionListener {
    JFrame frame;
    JButton but_1,but_2,but_3,but_4,but_5,but_6,but_7,but_8,but_9;
    ImageIcon X,O;
    int [] checker = new int[9];

    Tic_tac_toe() {
        X = new ImageIcon("X_1.png");
        O = new ImageIcon("O_1.png");
        Image scale_O = O.getImage().getScaledInstance(200,200,100);

        frame = new JFrame("Tic_tac_toe");
        frame.setTitle("Tic_tac_toe");
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setSize(600,600);
        //this.init();

        but_1 = new JButton();
        but_1.setBounds(0,0,200,200);
        but_1.addActionListener(this);
        frame.add(but_1);
        but_2 = new JButton();
        but_2.setBounds(200,0,200,200);
        but_2.addActionListener(this);
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

    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == but_1) {
            System.out.println(checker[0]);
            if(checker[0] == 1) {
                but_1.setIcon(X);
                checker[0] = 0;
                but_1.setEnabled(false);
            }
        }
        else if(a.getSource() == but_2) {
            if(checker[1] == 1) {
                but_1.setIcon(X);
                checker[0] = 0;
                but_1.setEnabled(false);
            }
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
    public static void main(String[] args) {
        Tic_tac_toe game = new Tic_tac_toe();
        game.init();
    }
    private void init() {
        for(int i=0; i<9; i++) {
            checker[i] = 1;
        }
    }
}
