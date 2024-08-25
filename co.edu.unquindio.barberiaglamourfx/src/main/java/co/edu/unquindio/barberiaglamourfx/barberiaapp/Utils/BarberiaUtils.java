package co.edu.unquindio.barberiaglamourfx.barberiaapp.Utils;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Barberia;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Empleado;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Reserva;

public class BarberiaUtils {

    public static Barberia inicializarDatos() {
        Barberia barberia = new Barberia();



        Reserva reserva = new Reserva();
        reserva.setIdReserva("123113");
        reserva.setNombreCliente("Alejo");
        reserva.setPrecio("15.000");
        reserva.setEmpleadoBarbero("Oscar");
        reserva.setFecha("20/09");
        barberia.getListaReserva().add(reserva);

        reserva = new Reserva();
        reserva.setIdReserva("11231");
        reserva.setNombreCliente("Pablo");
        reserva.setPrecio("20.000");
        reserva.setEmpleadoBarbero("German");
        reserva.setFecha("28/08");
        barberia.getListaReserva().add(reserva);

        reserva = new Reserva();
        reserva.setIdReserva("145641");
        reserva.setNombreCliente("Sebastian");
        reserva.setPrecio("30.000");
        reserva.setEmpleadoBarbero("Pacho");
        reserva.setFecha("26/05");
        barberia.getListaReserva().add(reserva);

        reserva = new Reserva();
        reserva.setIdReserva("123113");
        reserva.setNombreCliente("Santiago");
        reserva.setPrecio("25.000");
        reserva.setEmpleadoBarbero("Jorge");
        reserva.setFecha("24/06");
        barberia.getListaReserva().add(reserva);

        System.out.println("Información de la barberia creada");
        return barberia;
    }
}

