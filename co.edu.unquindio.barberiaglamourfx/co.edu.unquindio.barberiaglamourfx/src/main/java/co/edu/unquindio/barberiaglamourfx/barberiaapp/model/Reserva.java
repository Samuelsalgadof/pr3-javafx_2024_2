package co.edu.unquindio.barberiaglamourfx.barberiaapp.model;



public class Reserva {
    String idReserva;
    String nombreCliente;
    String precio;
    String empleadoBarbero;
    String fecha;







    public Reserva( String fecha, String empleadoBarbero, String precio, String nombreCliente, String idReserva) {

        this.fecha = fecha;
        this.empleadoBarbero = empleadoBarbero;
        this.precio = precio;
        this.nombreCliente = nombreCliente;
        this.idReserva = idReserva;
    }



    public Reserva() {
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getEmpleadoBarbero() {
        return empleadoBarbero;
    }

    public void setEmpleadoBarbero(String empleadoBarbero) {
        this.empleadoBarbero = empleadoBarbero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}


