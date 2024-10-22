package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.View;

public class Controller implements ActionListener{
    private View view;

    public Controller(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.Action();
    }
    
}
