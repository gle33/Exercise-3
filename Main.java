import javax.swing.*;
import java.awt.event.*; 

public class Main{
    public static void main(String[] args){
        mainScreen();
    }

    // starting screen with 3 buttons
    public static void mainScreen(){
        JFrame screen = new JFrame();
        screen.setSize(1000, 500);

        JButton instructions = new JButton("Instructions");
        instructions.setBounds(500, 100, 120, 30);
        screen.add(instructions);
        instructions.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                instructionsScreen();
            }
        });


        JButton play = new JButton("Play");
        play.setBounds(500, 200, 120, 30);
        screen.add(play);
        JButton quit = new JButton("Quit");
        quit.setBounds(500, 300, 120, 30);
        screen.add(quit);

    
        screen.setLayout(null);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setVisible(true);
    }

    public static void instructionsScreen(){
        JFrame ins_screen = new JFrame();
        ins_screen.setSize(1000,500);

        ins_screen.setLayout(null);
        ins_screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ins_screen.setVisible(true);
    }



}