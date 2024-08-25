package co.edu.unquindio.barberiaglamourfx.barberiaapp.model;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.exceptions.EmpleadoException;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.exceptions.ReservaException;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.dto.EmpleadoDto;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.services.IBarberiaServices;

import java.util.ArrayList;
import java.util.List;


public class Barberia implements IBarberiaServices {


    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Reserva> getListaReserva() {
        return listaReserva;
    }

    public void setListaReserva(List<Reserva> listaReserva) {
        this.listaReserva = listaReserva;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    List<Cliente> listaClientes = new ArrayList<>();
    List<Empleado> listaEmpleados = new ArrayList<>();
    List<Reserva> listaReserva = new ArrayList<>();

    public Barberia() {

    }

    @Override
    public Reserva crearReserva(String idReserva, String nombreCliente, String precio, String EmpleadoBarbero, String Fecha) throws ReservaException {
        Reserva nuevoReserva = null;
        boolean reservaExiste = verificarReservaExistente(idReserva);
        if (reservaExiste) {
            throw new EmpleadoException("El empleado con cedula: " + idReserva + " ya existe");
        } else {
            nuevoReserva = new Reserva();
            nuevoReserva.setIdReserva(idReserva);
            nuevoReserva.setNombreCliente(nombreCliente);
            nuevoReserva.setPrecio(precio);
            nuevoReserva.setEmpleadoBarbero(EmpleadoBarbero);
            nuevoReserva.setFecha(Fecha);
            getListaReserva().add(nuevoReserva);
        }
        return nuevoReserva;

    }

    @Override
    public Boolean eliminarReserva(String idReserva) throws ReservaException {
        Reserva reserva = null;
        boolean flagExiste = false;
        reserva = obtenerReservas(idReserva);
        if (reserva == null)
            throw new ReservaException("El empleado a eliminar no existe");
        else {
            getListaEmpleados().remove(reserva);
            flagExiste = true;
        }
        return flagExiste;
    }

    @Override
    public boolean actualizarReserva(String idReservaActual, Reserva reserva) throws ReservaException {
        Reserva reservaActual = obtenerReservas(idReservaActual);
        if (reservaActual == null)
            throw new ReservaException("El empleado a actualizar no existe");
        else {
            reservaActual.setIdReserva(reserva.getIdReserva());
            reservaActual.setNombreCliente(reserva.getNombreCliente());
            reservaActual.setPrecio(reserva.getPrecio());
            reservaActual.setEmpleadoBarbero(reserva.getEmpleadoBarbero());
            reservaActual.setFecha(reserva.getFecha());
            return true;
        }
    }

    @Override
    public boolean verificarReservaExistente(String idReserva) throws ReservaException {
        if (reservaExiste(idReserva)) {
            throw new ReservaException("La reserva con IdReserva: " + idReserva + " ya existe");
        } else {
            return false;
        }
    }


    @Override
    public Reserva obtenerReservas(String idReserva) {
        Reserva reservaEncontrada = null;
        for (Reserva reserva : getListaReserva()) {
            if(reserva.getIdReserva().equalsIgnoreCase(idReserva)){
                reservaEncontrada = reserva;
                break;
            }
        }
        return reservaEncontrada;
    }

    @Override
    public ArrayList<Reserva> obtenerReserva() {
        // TODO Auto-generated method stub
        return (ArrayList<Reserva>) getListaReserva();
    }

    private boolean reservaExiste(String idReserva) {
        boolean reservaEncontrada = false;
        for (Reserva reserva : getListaReserva()) {
            if (reserva.getIdReserva().equalsIgnoreCase(idReserva)) {
                reservaEncontrada = true;
                break;
            }
        }
        return reservaEncontrada;

    }
    public void agregarReserva(Reserva nuevoReserva) throws ReservaException {
        getListaReserva().add(nuevoReserva);

    }
}
