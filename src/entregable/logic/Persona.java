package entregable.logic;

public class Persona {

    private double saldo;
    private final String nombre;
    private final String apellidoP;
    private final String apellidoM;
    private final String password;

    // Constructor
    public Persona(String nombre, String apellidoP, String apellidoM, String password) {
        this.saldo = 0.0;
        this.nombre = nombre.toLowerCase();
        this.apellidoP = apellidoP.toLowerCase();
        this.apellidoM = apellidoM.toLowerCase();
        this.password = password;
    }

    // Getters
    public double getSaldo() {
        return saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public Persona getPersonByNombre(String nombre) {
        return this;
    }

    // ToString
    @Override
    public String toString() {
        return "\nUsername: " + nombre
                + "\nApellido: " + apellidoP
                + "\nApellido: " + apellidoM
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

    public void deposito(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public double consulta() {
        return saldo;
    }
}
