package co.edu.uptc.ejercicio2.view;

import javax.swing.*;

public class View {
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public int readInt(String message) {
        int option = 0;
        try {
            option = Integer.parseInt(JOptionPane.showInputDialog(null, message, "", JOptionPane.QUESTION_MESSAGE));
        } catch (NumberFormatException exception) {
            showMessage("Tiene que ingresar un numero");
        }
        return option;
    }

    public String readString(String message) {
        return JOptionPane.showInputDialog(message);
    }
}
