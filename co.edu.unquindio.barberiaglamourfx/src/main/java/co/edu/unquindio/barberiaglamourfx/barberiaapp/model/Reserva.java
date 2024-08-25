package co.edu.unquindio.barberiaglamourfx.barberiaapp.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Reserva {
    String idReserva;
    String nombreCliente;
    String precio;
    String empleadoBarbero;
    String fecha;

    ArrayList<Cliente>listaClientesAsociados=new ArrayList<Cliente>();

    public ArrayList<Cliente> getListaClientesAsociados() {
        return listaClientesAsociados;
    }

    public void setListaClientesAsociados(ArrayList<Cliente> listaClientesAsociados) {
        this.listaClientesAsociados = listaClientesAsociados;
    }

    public Reserva(ArrayList<Cliente> listaClientesAsociados, String fecha, String empleadoBarbero, String precio, String nombreCliente, String idReserva) {
        this.listaClientesAsociados = listaClientesAsociados;
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


