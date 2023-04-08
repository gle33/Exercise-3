import javax.swing.*;
import java.awt.event.*; 

public class Main{
    public static void main(String[] args){
        mainScreen();
    }

    // starting screen with 3 buttons
    public static void mainScreen(){
        JFrame screen = new JFrame("Main Menu");
        screen.setSize(1000, 500);

        JButton instructions = new JButton("Instructions");
        instructions.setBounds(500, 100, 120, 30);
        screen.add(instructions);
        instructions.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                screen.dispose();
                instructionsScreen();
            }
        });
        JButton play = new JButton("Play");
        play.setBounds(500, 200, 120, 30);
        screen.add(play);
        play.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                screen.dispose();
                gameScreen();
            }
        });
        JButton quit = new JButton("Quit");
        quit.setBounds(500, 300, 120, 30);
        screen.add(quit);
        quit.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                screen.dispose();
            }
        });
        screen.setLayout(null);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setVisible(true);
    }

    public static void instructionsScreen(){
        JFrame ins_screen = new JFrame("Instructions");
        ins_screen.setSize(1000,500);

        JButton goBack = new JButton("Return to Main Menu");
        goBack.setBounds(10,10,150,20);
        ins_screen.add(goBack);

        ins_screen.setLayout(null);
        ins_screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ins_screen.setVisible(true);
    }
    public static void gameScreen(){
        JFrame game = new JFrame("Game");
        game.setSize(1000,500);
        JButton goBack = new JButton("Return to Main Menu");
        goBack.setBounds(10,10,150,20);
        game.add(goBack);

        game.setLayout(null);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setVisible(true);
    }



}