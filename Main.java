import javax.swing.*;
import java.awt.event.*; 
import java.awt.Color;

public class Main{
    public static void main(String[] args){
        
        mainScreen();
        
    }
    // starting screen with 3 buttons
    public static void mainScreen(){
        JFrame screen = new JFrame("Main Menu");
        screen.setSize(1000, 500);

        JButton instructions = new JButton("Instructions");
        instructions.setBounds(440, 100, 120, 30);
        screen.add(instructions);
        instructions.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                screen.dispose();
                instructionsScreen();
            }
        });
        JButton play = new JButton("Play");
        play.setBounds(440, 200, 120, 30);
        screen.add(play);
        play.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                screen.dispose();
                gameScreen();
            }
        });
        JButton quit = new JButton("Quit");
        quit.setBounds(440, 300, 120, 30);
        screen.add(quit);
        quit.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                screen.dispose();
            }
        });
        screen.setLayout(null);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setResizable(false);
        screen.setVisible(true);
    }

    public static void instructionsScreen(){
        JFrame ins_screen = new JFrame("Instructions");
        ins_screen.setSize(1000,500);

        JButton goBack = new JButton("Return to Main Menu");
        goBack.setBounds(10,10,150,20);
        ins_screen.add(goBack);
        goBack.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                ins_screen.dispose();
                mainScreen();
            }
        });

        JLabel instructions = new JLabel("The goal of the game is to guess the number between 1-100!");
        instructions.setBounds(320, 50, 400, 50);
        ins_screen.add(instructions);
        JLabel image = new JLabel();
        image.setIcon(new ImageIcon("numberss.png"));
        image.setBounds(320, 100, 320, 320);
        ins_screen.add(image);
        

        ins_screen.setLayout(null);
        ins_screen.setResizable(false);
        ins_screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ins_screen.setVisible(true);
    }
    public static void gameScreen(){
        JFrame game = new JFrame("Game");
        game.setSize(1000,500);
        JLabel range = new JLabel("Not in range.");
        range.setBounds(450, 250, 100, 25);
        range.setBackground(Color.RED);
        range.setOpaque(true);
                
        game.add(range);
        range.setVisible(false);

        JLabel correct = new JLabel("Correct!");
        correct.setBounds(450, 250, 100, 25);
        correct.setBackground(Color.GREEN);
        correct.setOpaque(true);
                
        game.add(correct);
        correct.setVisible(false);

        JLabel incorrect = new JLabel("Incorrect.");
        incorrect.setBounds(450, 250, 100, 25);
        incorrect.setBackground(Color.RED);
        incorrect.setOpaque(true);
                
        game.add(incorrect);
        incorrect.setVisible(false);

        JLabel notInt = new JLabel("Not an integer.");
        notInt.setBounds(450, 250, 100, 25);
        notInt.setBackground(Color.RED);
        notInt.setOpaque(true);
        game.add(notInt);
        notInt.setVisible(false);
        JButton goBack = new JButton("Return to Main Menu");
        goBack.setBounds(10,10,150,20);
        goBack.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                game.dispose();
                mainScreen();
            }
        });

        JLabel prompt = new JLabel("I am thinking of an integer between 1-100:");
        prompt.setBounds(405, 50, 400, 50);
        game.add(prompt);

        JTextField input = new JTextField();
        input.setBounds(390, 100, 200, 25);
        game.add(input);
        
        JButton verify = new JButton("Enter");
        verify.setBounds(600, 100, 80, 25);
        verify.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                String guess = input.getText();
                try{
                    int finalGuess = Integer.parseInt(guess);
                    if(finalGuess < 1 || finalGuess > 100){
                        range.setVisible(true);
                        correct.setVisible(false);
                        incorrect.setVisible(false);
                        notInt.setVisible(false);
                    }
                    else if(finalGuess == 48){
                        range.setVisible(false);
                        correct.setVisible(true);
                        incorrect.setVisible(false);
                        notInt.setVisible(false);
                    }
                    else{
                        range.setVisible(false);
                        correct.setVisible(false);
                        incorrect.setVisible(true);
                        notInt.setVisible(false);
                    }
                }
                catch(NumberFormatException err){
                    range.setVisible(false);
                    correct.setVisible(false);
                    incorrect.setVisible(false);
                    notInt.setVisible(true);
                }
                finally{
                    game.revalidate();
                    game.repaint();
                }
            }
        });



        game.add(verify);

        game.add(goBack);
        game.setLayout(null);
        game.setResizable(false);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setVisible(true);
    }



}