package Afvink2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameOfLife2 extends JFrame{
    // create a grid made out of buttons
    static int rows = 10;
    static int colums = 10;

    public static void main(String[] args) {
        GameOfLife2 frame = new GameOfLife2();
        frame.setTitle("Game of Life");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.Grid(rows, colums);
        frame.setVisible(true);
    }

    public void Grid(int rows, int colums){
        Container window = getContentPane();
        window.setLayout(new GridLayout(rows, colums));
        for (int i = 0; i < 10; i++) {
            for(int j=0;j<10;j++){
                JButton button = new JButton();
                window.add(button);
            }
        }
    }
}
