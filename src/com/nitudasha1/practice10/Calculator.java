package com.nitudasha1.practice10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.List;
import java.util.function.Consumer;

public class Calculator extends JPanel {

    private JTextField aField, bField, resultField;

    public Calculator() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        aField = new JTextField();
        aField.setMargin(new Insets(10, 10, 10 ,10));
        add(aField);

        JPanel panel = new JPanel();

        List.of("+", "-", "*", "/")
                .forEach(new Consumer<String>() {
                    @Override
                    public void accept(String action) {
                        JButton button = new JButton(action);
                        button.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                makeAction(action);
                            }
                        });
                        panel.add(button);
                    }
                });

        add(panel);
        bField = new JTextField();
        bField.setMargin(new Insets(10, 10, 10 ,10));
        resultField = new JTextField();
        resultField.setMargin(new Insets(10, 10, 10 ,10));
        add(bField);
        add(resultField);
    }

    private void makeAction(String action) {
        double a, b, c = 0;

        try {
            a = Double.parseDouble(aField.getText());
            b = Double.parseDouble(bField.getText());
        } catch (NumberFormatException e) {
            resultField.setText("Ошибка ввода");
            return;
        }

        if (b == 0 && action.equals("/")) {
            resultField.setText("Деление на ноль");
            return;
        }

        if (action.equals("+")) {
            c = a + b;
        } else if (action.equals("-")) {
            c = a - b;
        } else if (action.equals("*")) {
            c = a * b;
        } else if (action.equals("/")) {
            c = a / b;
        }

        resultField.setText(new DecimalFormat("#.####").format(c));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 300);
        frame.getContentPane().add(calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
