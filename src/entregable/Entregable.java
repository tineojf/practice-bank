package entregable;

import entregable.gui.Login;
import entregable.persistence.DB;

public class Entregable {

    public static void main(String[] args) {
        DB baseDatos = DB.getInstance();

        Login inicio = new Login();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
    }
}
