package co.edu.unquindio.barberiaglamourfx.barberiaapp.model;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.builder.ClienteBuilder;

public class Cliente extends Persona {

    public Cliente(String nombre, String cedula, String email, String celular, int edad) {
        super(nombre, cedula, email, celular, edad);

    }

    public Cliente() {
        super();
    }

    public static ClienteBuilder builder() {
        return new ClienteBuilder();
    }
}
