package co.edu.unquindio.barberiaglamourfx.barberiaapp.model.services;


import co.edu.unquindio.barberiaglamourfx.barberiaapp.exceptions.EmpleadoException;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.exceptions.ReservaException;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Empleado;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Reserva;

import java.util.ArrayList;

public interface IBarberiaServices {
    public Reserva crearReserva(String idReserva, String idUsuarioAsociado, String fecha, String idCancha, String PrecioReserva) throws ReservaException;

    public Boolean eliminarReserva(String idReserva) throws ReservaException;

    boolean actualizarReserva(String idReservaActual, Reserva reserva) throws ReservaException;

    public boolean verificarReservaExistente(String idReserva) throws ReservaException;

    public Reserva obtenerReservas(String idReserva);

    public ArrayList<Reserva> obtenerReserva();
}
