package model;

public interface IModel {

    // setter
    public void setAnzahl(int anzahl);

    public void erhoehen();

    public void verringern();

    public void aufNullSetzen();

    // getter
    int getZahl();
}
