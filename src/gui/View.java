package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame implements IView {


    private JButton buttonRaus;
    private JButton buttonRein;
    private JButton buttonReset;
    private JLabel label;

    public View(){
        label = new JLabel("");
        label.setHorizontalAlignment(JLabel.CENTER);
        buttonRaus = new JButton("raus");
        buttonRein = new JButton("rein");
        buttonReset = new JButton("Reset");

        add(buttonRaus, BorderLayout.WEST);
        add(buttonRein, BorderLayout.EAST);
        add(label);
        add(buttonReset, BorderLayout.SOUTH);

        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void setText(String text) {
        label.setText(text);
    }

    @Override
    public void setRausListener(ActionListener al) {
        buttonRaus.addActionListener(al);
    }

    @Override
    public void setReinListener(ActionListener al) {
        buttonRein.addActionListener(al);
    }

    @Override
    public void setZuruecksetzenListener(ActionListener al) {
        buttonReset.addActionListener(al);
    }
}
