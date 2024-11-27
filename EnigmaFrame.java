import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EnigmaFrame {

    private JFrame frame = new JFrame();
    private JTextField textField = new JTextField();//input three starting characters
    private JTextArea textArea = new JTextArea();//provide in/out to the GUI for the encrypt/decrypt tasks
    private JButton button = new JButton();//select encrypt vs decrypt
    private JLabel label = new JLabel();//label all of the fields shown in example
    private JPanel panel = new JPanel(); //visually appealing layout

    public EnigmaFrame(){

        createFrame();

        createTextField();


        createTextArea();

        frame.add(textField, BorderLayout.NORTH);
        frame.add(textArea, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public void createFrame(){

        frame.setTitle("Enigma Machine");
        frame.setSize(100, 600);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void createTextField(){
        textField.setPreferredSize(new Dimension(20, 60));
        textField.setFont(new Font("Helvetica", Font.PLAIN,14));
        textField.setBackground(Color.WHITE);
        textField.setText("Initial Positions: ");
    }

    public void createTextArea(){
        textArea.setPreferredSize(new Dimension(100,100));
        textArea.setFont(new Font("Helvetica", Font.PLAIN,14));
        textArea.setBackground(Color.WHITE);
        textArea.setText("Text Area ");

    }




    
}
