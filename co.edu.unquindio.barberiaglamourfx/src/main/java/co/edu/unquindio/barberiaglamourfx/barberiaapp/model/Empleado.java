package co.edu.unquindio.barberiaglamourfx.barberiaapp.model;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.builder.ClienteBuilder;

public class Empleado extends Persona {

    public Empleado(String nombre, String cedula, String email, String celular, int edad) {
        super(nombre, cedula, email, celular, edad);

    }

    public Empleado() {
        super();
    }

    public static ClienteBuilder builder() {
        return new ClienteBuilder();
    }
}
