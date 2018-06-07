package gui;

import java.awt.event.ActionListener;

public interface IView {

    public void setText(String text);
    public void setRausListener(ActionListener al);
    public void setReinListener(ActionListener al);
    public void setZuruecksetzenListener(ActionListener al);
}
