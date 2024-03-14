package entregable.logic;

import java.util.ArrayList;

public class Persona {

    private double saldo;
    private final ArrayList<String> datos;
    private final String password;

    // Constructor
    public Persona(String nombre, String apellidoP, String apellidoM, String password) {
        this.saldo = 0.0;
        this.datos = new ArrayList<>();
        this.datos.add(nombre.toLowerCase());
        this.datos.add(apellidoP.toLowerCase());
        this.datos.add(apellidoM.toLowerCase());
        this.password = password;
    }

    // Getters
    public double getSaldo() {
        return saldo;
    }

    public String getNombre() {
        return this.datos.get(0);
    }

    public String getApellidoP() {
        return this.datos.get(1);
    }

    public String getApellidoM() {
        return this.datos.get(2);
    }

    // ToString
    @Override
    public String toString() {
        return "\nUsername: " + this.getNombre()
                + "\nApellido: " + this.getApellidoP()
                + "\nApellido: " + this.getApellidoM()
                + "\nSaldo: " + saldo;
    }

    // Methods
    public boolean verificarPassword(String _password) {
        return _password.equals(this.password);
    }

    public boolean retiro(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    public boolean deposito(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            return true;
        } else {
            return false;
        }
    }

    public double consulta() {
        return saldo;
    }
}
