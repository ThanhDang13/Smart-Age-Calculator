package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.SubmitControl;

import java.awt.GridLayout;

import model.AgeModel;

public class CalculatorView extends JFrame{
    AgeModel ageModel;
    JTextField textField;

    public CalculatorView() {
        this.ageModel = new AgeModel();
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setTitle("Smart Age Calculator");
        this.setSize(300, 100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2, 1));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        
        textField = new JTextField(10);
        textField.setSize(150, 50);
        JLabel label = new JLabel("Enter your age here:");

        panel.add(label);
        panel.add(textField);

        SubmitControl submitListener = new SubmitControl(this);
        JButton submiButton = new JButton("Submit");
        submiButton.addActionListener(submitListener);
        this.add(panel);
        this.add(submiButton);
    }

    public void calculate() {
        this.ageModel.setAge(this.textField.getText());
        new OutputView(this.ageModel);
    }
} 