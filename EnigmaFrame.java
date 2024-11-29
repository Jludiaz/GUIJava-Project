import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnigmaFrame {

    private JFrame frame;
    private JTextField textField;

    private JTextArea inputArea;
    private JTextArea outputArea;

    private JButton decryptButton;
    private JButton encryptButton;

    private JComboBox<Integer> innerRotor;
    private JComboBox<Integer> middleRotor;
    private JComboBox<Integer> outterRotor;

    public EnigmaFrame() {

        frame = new JFrame("Enigma Machine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Main panel with BoxLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        // Field Panel
        JLabel fieldLabel = new JLabel("Initial Positions: ");
        panel.add(fieldLabel);

        textField = new JTextField(10);
        textField.setMaximumSize(new Dimension(10,20));
        panel.add(textField);
        //  
        // Button Panel
        decryptButton = new JButton("Decrypt");
        encryptButton = new JButton("Encrypt");

        encryptButton.addActionListener(new ButtonActionListener("Encrypt"));
        decryptButton.addActionListener(new ButtonActionListener("Decrypt"));

        panel.add(encryptButton);
        panel.add(decryptButton);
        //

        //JComboBox 
        //rotor label
        JLabel rotors = new JLabel("Rotors: ");
        panel.add(rotors);

        //inner rotor
        JLabel innerLabel = new JLabel("Inner");
        panel.add(innerLabel);
    
        innerRotor = new JComboBox<Integer>(new Integer[]{1,2,3,4,5});
        panel.add(innerRotor);

        //middle rotor
        JLabel middleLabel = new JLabel("Middle");
        panel.add(middleLabel);

        middleRotor = new JComboBox<Integer>(new Integer[]{1,2,3,4,5});
        panel.add(middleRotor);

        //Outer Rotor
        JLabel outerLabel = new JLabel("Outer");
        panel.add(outerLabel);

        outterRotor = new JComboBox<Integer>(new Integer[]{1,2,3,4,5});
        panel.add(outterRotor);
        //

        //New JPanel Text Area
        JPanel secondPanel = new JPanel();
        secondPanel.setLayout(new GridLayout(2,1,5,5));

        inputArea = new JTextArea();
        outputArea = new JTextArea();

        JScrollPane inputScrollPane = new JScrollPane(inputArea);
        JScrollPane outputScrollPane = new JScrollPane(outputArea);

        secondPanel.add(inputScrollPane);
        secondPanel.add(outputScrollPane);

        secondPanel.add(inputScrollPane);
        secondPanel.add(outputScrollPane);

        // Add main panel to the frame
        frame.add(panel, BorderLayout.NORTH);
        frame.add(secondPanel,BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private class ButtonActionListener implements ActionListener {
        private String action;

        public ButtonActionListener(String action) {
            this.action = action;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, action + " button clicked!");
        }
    }
}