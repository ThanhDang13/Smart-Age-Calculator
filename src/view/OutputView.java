package view;

import javax.swing.JFrame;
import javax.swing.JLabel;

import model.AgeModel;

public class OutputView extends JFrame{
    private AgeModel age;
    
    public OutputView(AgeModel ageModel) {
        this.age = ageModel;
        try {
            int age = Integer.parseInt(this.age.getAge());
            this.validReturn(age);
        } catch (Exception e) {
            this.invalidReturn();
        }
        this.setSize(400, 100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void validReturn(int age) {
        this.setTitle("This is your result");
        this.add(new JLabel("Your age is " + age));
    }

    public void invalidReturn() {
        this.setTitle("Nigga, check your input");
        this.add(new JLabel("Your input is invalid"));
    }
}
