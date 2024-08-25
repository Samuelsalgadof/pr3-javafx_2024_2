package co.edu.unquindio.barberiaglamourfx.barberiaapp.model;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.builder.ClienteBuilder;

public class Cliente extends Persona {

    private String nombreCliente;

    public Cliente(String nombre, String cedula, String email, String celular, int edad) {
        super(nombre, cedula, email, celular, edad);

    }

    public Cliente() {
        super();
    }

    public static ClienteBuilder builder() {
        return new ClienteBuilder();
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
}
