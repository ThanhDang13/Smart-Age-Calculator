package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CalculatorView;

public class SubmitControl implements ActionListener{
    private CalculatorView calculator;

    public SubmitControl(CalculatorView calculatorView) {
        this.calculator = calculatorView;
    }

    public void actionPerformed(ActionEvent e) {
        this.calculator.calculate();
    }
    
}
