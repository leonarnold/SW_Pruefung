package app;

import gui.Presenter;
import gui.View;
import model.Model;

public class Main {

    public static void main(String[] args) {
        new Presenter(new View(), new Model());

    }
}
