package co.edu.unquindio.barberiaglamourfx.barberiaapp.controller.service;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.dto.ReservaDto;

import java.util.List;

public interface IReservaCitasControllerService {

    List<ReservaDto> obtenerReservas();

    boolean agregarReserva(ReservaDto reservaDto);

    boolean eliminarReserva(String idReserva);

    boolean actualizarReserva(String idReservaActual, ReservaDto reservaDto);
}
