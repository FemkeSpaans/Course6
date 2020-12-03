package Afvink2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class GameOfLife extends JFrame implements ActionListener {

    private JPanel playfield = new JPanel();
    private Graphics graphics;// = playfield.getGraphics();
    public JButton start_button;
    int colums = 10;
    int rows = 10;
    public int[][] field = new int[colums][rows];

    public GameOfLife() {
        this.setTitle("Game of Life");
        this.setSize(500, 500);
        this.setVisible(true);
        playfield.setPreferredSize(new Dimension(500, 500));
        //this.setBackground(Color.DARK_GRAY);// why wont you work???
        create_gui();
    }

    public void create_gui(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new GridLayout(8,8));

        int[][] field = this.GUI();
        window.add(playfield);
        draw(field);

        start_button = new JButton();
        start_button.setText("Start");
        start_button.setPreferredSize(new Dimension(50,50));
        window.add(start_button);
    }

    /**
     * create gui with 2 dimensional array(list???)
     * @return field
     */
    public int[][] GUI() {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[j][i] = 0;
            }
        }
        field[1][1] = 1;// what happens whenn you is alive, okay you be bitchy
        for (int i = 0; i < field.length; i++) {
            System.out.println(Arrays.toString(field[i]));
        }
        return field;
    }

    public void draw(int[][] field){
        graphics = playfield.getGraphics();
        graphics.clearRect(0, 0, 500, 500);
        for(int i= 0 ; i<field.length; i++){
            for(int j = 0; j<field[i].length ; j++){
                if (field[i][j] == 1) {
                    graphics.setColor(Color.orange);

                    graphics.fillRect(i * 50, j * 50, 50, 50);

                    graphics.drawRect(i * 50, j * 50, 50, 50);
                }
            }
        }
    }

    /**
     * check if alive or dead
     * a live cell is surrounded by < 2 live neighbours, it dies
     * a live cell is surrounded by 2 || 3 live neighbours, it lives
     * a live cell is surrounded by > 3 live neighbours, it dies
     * a dead cell is surrounded by 3 live neighbours, it lives
     *
     * now how are you gonna do this?? if statements
     */
    public void alive(){


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start_button){
            draw(field);
        }
    }
}
