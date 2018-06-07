package gui;


import model.Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;


public class Presenter implements Observer {

    private IView view;
    private Model model;

    public Presenter(IView view, Model model) {
        this.view = view;
        this.model = model;
        model.addObserver(this);
        model.setAnzahl(0);


        view.setReinListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.erhoehen();
            }
        });

        view.setRausListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.verringern();
            }
        });

        view.setZuruecksetzenListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.aufNullSetzen();
            }
        });
    }

    @Override
    public void update(Observable o, Object arg) {
        view.setText("Es sind " + model.getZahl() + " Gäste anwesend.");
    }
}
