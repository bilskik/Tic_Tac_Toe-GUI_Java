import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tic_tac_toe implements ActionListener {
    JFrame frame;
    JButton []button = new JButton[9];
    ImageIcon X,O;
    JPanel panel;
    int [] checker = new int[9];
    boolean ply_1,ply_2;
    char[]map = new char[9];
    char mark_x = 'X';
    char mark_o = 'O';

    Tic_tac_toe() {

        ply_1 = true;
        ply_2 = false;
        X = new ImageIcon("X_1.png");
        O = new ImageIcon("O_1.png");
        Image scale_O = O.getImage().getScaledInstance(200,200,100);

        frame = new JFrame("Tic_tac_toe");
        frame.setTitle("Tic_tac_toe");
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setSize(600,600);
        for(int i=0; i<9; i++) {
            button[i] = new JButton();
            button[i].addActionListener(this);
        }
        panel = new JPanel();
        panel.setBounds(0,0,600,560);
        panel.setLayout(new GridLayout(3,3,0,0));
        for(int i=0; i<9; i++) {
            panel.add(button[i]);
        }

        if(iswinner(mark_x) == 1)
            System.out.println("ply1 wygral");
        if(iswinner(mark_o) == 1)
            System.out.println("pl2 wygral");

        frame.add(panel);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

      for(int i=0; i<9; i++) {
          if(e.getSource() == button[i]) {
              if(checker[i] == 1 && ply_1 == true) {
                  button[i].setIcon(X);
                  map[i] = 'X';
                  checker[i] = 0;
                  ply_1 = false;
                  ply_2 = true;
              }
              else if(checker[i] == 1 && ply_2 == true) {
                  button[i].setIcon(O);
                  map[i] = 'O';
                  checker[i] = 0;
                  ply_1 = true;
                  ply_2 = false;
              }
          }
      }


    }
    public static void main(String[] args) {

        Tic_tac_toe game = new Tic_tac_toe();
        game.init();


    }
    private int iswinner(char mark) {
        System.out.println("pl2 wygral");
        int row = 0;
        int col = 0;
        int dia_1 = 0;
        int dia_2 = 0;
        int j = 0;
        for(int i=0; i<9; i++) {

            if(i == 3 || i == 6) {
                row = 0;
                col = 0;
                j = 0;
            }

            if(map[j] == mark)
                col++;
            if(map[i] == mark)
                row++;
            if((map[i] == mark) && (i == 0 || i == 4 || i== 8))
                dia_1++;
            if((map[i] == mark) && (i == 2 || i == 4 || i == 6))
                dia_2++;

            if(row == 3)
                return 1;
            if(dia_1 == 3)
                return 1;
            if(dia_2 == 3)
                return 1;
            if(col == 3)
                return 1;
            j+=3;

        }
        return 0;
    }
    private void init() {
        for(int i=0; i<9; i++) {
            checker[i] = 1;
        }
    }
}
