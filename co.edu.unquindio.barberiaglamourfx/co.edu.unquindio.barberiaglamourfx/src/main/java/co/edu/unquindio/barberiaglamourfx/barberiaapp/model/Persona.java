package co.edu.unquindio.barberiaglamourfx.barberiaapp.model;



public abstract class Persona {

    private String nombre;

    private String cedula;

    private String email;

    private String celular;

    private int edad;

    public Persona(String nombre, String cedula, String email, String celular, int edad) {

        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.celular = celular;
        this.edad = edad;
    }

    public Persona() {

    }


    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}