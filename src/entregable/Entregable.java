package entregable;

import entregable.gui.Login;
import entregable.logic.Persona;

public class Entregable {

    public static void main(String[] args) {
        Persona admin = new Persona("admin", "tineo", "atunca", "admin");
        System.out.println(admin);

        Login inicio = new Login();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);

    }

}
