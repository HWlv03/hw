package main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.View;

public class Demoprojetct {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
                e.getStackTrace();
            }
            e.getStackTrace();
        }
        new View();
    }
}
