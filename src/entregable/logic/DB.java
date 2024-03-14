package entregable.logic;

import java.util.ArrayList;

// patron - singleton
public class DB {

    private static DB instance;
    private final ArrayList<Persona> listaUsuarios;

    // constructor
    private DB() {
        this.listaUsuarios = new ArrayList<>();
        
        // create admin
        Persona admin = new Persona("admin", "tineo", "atunca", "admin");
        admin.deposito(531324);
        this.listaUsuarios.add(admin);
    }

    public static DB getInstance() {
        if (instance == null) {
            instance = new DB();
        }
        return instance;
    }

    // methods
    public void addUser(Persona persona) {
        this.listaUsuarios.add(persona);
    }

    public Persona searchUser(String username, String password) {
        for (Persona user : listaUsuarios) {
            if (user.getNombre().equals(username) && user.verificarPassword(password)) {
                return user;
            }
        }
        return null;
    }
}
