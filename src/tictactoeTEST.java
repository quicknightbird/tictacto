
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tictactoeTEST {
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;

    tictactoeTEST() {
        this.frame.setDefaultCloseOperation(3);
        this.frame.setSize(1200, 900);
        this.frame.setBackground(Color.GREEN);
        this.frame.setLayout((LayoutManager)null);
        this.frame.setVisible(true);
        this.frame.setResizable(false);
        this.title_panel.setBackground(Color.GREEN);
        this.button_panel.setBackground(Color.BLACK);
        this.title_panel.setBounds(900, 0, 300, 900);
        this.button_panel.setBounds(0, 0, 900, 900);
        this.frame.add(this.title_panel);
        this.frame.add(this.button_panel);
        this.button_panel.setLayout(new GridLayout(3, 3));
        this.button_panel.setBackground(new Color(150, 150, 150));

        for(int i = 0; i < 9; ++i) {
            this.buttons[i] = new JButton();
            this.button_panel.add(this.buttons[i]);
            this.buttons[i].setFont(new Font("MV Boli", 1, 120));
            this.buttons[i].setFocusable(false);
        }

    }
}
