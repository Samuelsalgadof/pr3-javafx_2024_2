package co.edu.unquindio.barberiaglamourfx.barberiaapp.Utils;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Barberia;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Empleado;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Reserva;

public class BarberiaUtils {

    public static Barberia inicializarDatos() {
        Barberia barberia = new Barberia();



        Reserva reserva = new Reserva();
        reserva.setIdReserva("juan");
        reserva.setNombreCliente("125454");
        reserva.setPrecio("aasfa@gmail.om");
        reserva.setEmpleadoBarbero("3146754322");
        reserva.setFecha("20");
        barberia.getListaReserva().add(reserva);

        reserva = new Reserva();
        reserva.setIdReserva("juan");
        reserva.setNombreCliente("125454");
        reserva.setPrecio("aasfa@gmail.om");
        reserva.setEmpleadoBarbero("3146754322");
        reserva.setFecha("20");
        barberia.getListaReserva().add(reserva);

        System.out.println("Información de la barberia creada");
        return barberia;
    }
}

