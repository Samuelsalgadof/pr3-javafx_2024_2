package co.edu.unquindio.barberiaglamourfx.barberiaapp.controller.service;


import co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.dto.EmpleadoDto;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.dto.ReservaDto;

import java.util.ArrayList;
import java.util.List;


public interface IModelFactoryService {

    List<ReservaDto> obtenerReservas();

    boolean agregarReserva(ReservaDto reservaDto);

    boolean eliminarReserva(String idReserva);

    boolean actualizarReserva(String idReservaActual, ReservaDto reservaDto);


}
