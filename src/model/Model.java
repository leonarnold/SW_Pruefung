package model;

import java.util.Observable;

public class Model extends Observable implements IModel {

    private int anzahl;

    public Model() {
        aufNullSetzen();
    }

    @Override
    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
        setChanged();
        notifyObservers();
    }

    @Override
    public void erhoehen() {
        this.anzahl = anzahl + 1;
        setChanged();
        notifyObservers();
    }

    @Override
    public void verringern() {
        this.anzahl = anzahl - 1;
        setChanged();
        notifyObservers();
    }

    @Override
    public void aufNullSetzen() {
        //this.anzahl = 0;
        setAnzahl(0);
        setChanged();
        notifyObservers();
    }

    @Override
    public int getZahl() {
        return anzahl;
    }
}
