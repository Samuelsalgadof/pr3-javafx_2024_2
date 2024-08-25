package co.edu.unquindio.barberiaglamourfx.barberiaapp.controller;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.controller.service.IReservaCitasControllerService;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.dto.ReservaDto;

import java.util.List;

public class ReservaCitasController implements IReservaCitasControllerService {


    ModelFactoryController modelFactoryController;

    public  ReservaCitasController(){
        modelFactoryController = ModelFactoryController.getInstance();
    }

    public List<ReservaDto> obtenerReservas() {
        return modelFactoryController.obtenerReservas();
    }

    @Override
    public boolean agregarReserva(ReservaDto reservaDto) {
        return modelFactoryController.agregarReserva(reservaDto);
    }

    @Override
    public boolean eliminarReserva(String idReserva) {
        return modelFactoryController.eliminarReserva(idReserva);
    }

    @Override
    public boolean actualizarReserva(String idReservaActual, ReservaDto reservaDto) {
        return modelFactoryController.actualizarReserva(idReservaActual, reservaDto);
    }
}

