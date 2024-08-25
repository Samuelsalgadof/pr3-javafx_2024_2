package co.edu.unquindio.barberiaglamourfx.barberiaapp.controller;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.exceptions.EmpleadoException;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.exceptions.ReservaException;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.dto.ReservaDto;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.mappers.BarberiaMapper;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.*;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.*;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.controller.service.IModelFactoryService;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.Utils.BarberiaUtils;

import java.util.ArrayList;
import java.util.List;

public class ModelFactoryController implements IModelFactoryService {
    Barberia barberia;
    BarberiaMapper mapper = BarberiaMapper.INSTANCE;

    public static ModelFactoryController getinstance() {
            return SingletonHolder.eINSTANCE;
    }

    public void setBarberia(Barberia barberia) {
        this.barberia = barberia;
    }


    //------------------------------  Singleton ------------------------------------------------
    // Clase estatica oculta. Tan solo se instanciara el singleton una vez
    private static class SingletonHolder {
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }

    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    public ModelFactoryController() {
        System.out.println("invocación clase singleton");
        cargarDatosBase();
    }

    private void cargarDatosBase() {
        barberia = BarberiaUtils.inicializarDatos();
    }

    public Barberia getBarberia() {
        return barberia;
    }



    @Override
    public List<ReservaDto> obtenerReservas() {
        return  mapper.getEmpleadosDto(barberia.getListaReserva());
    }

    @Override
    public boolean agregarReserva(ReservaDto reservaDto) {
        try{
            if(!barberia.verificarReservaExistente(reservaDto.idReserva())) {
                Reserva reserva = mapper.empleadoDtoToEmpleado(reservaDto);
                getBarberia().agregarReserva(reserva);
            }
            return true;
        }catch (ReservaException e){
            e.getMessage();
            return false;
        }
    }

    @Override
    public boolean eliminarReserva(String idReserva) {
        boolean flagExiste = false;
        try {
            flagExiste = getBarberia().eliminarReserva(idReserva);
        } catch (ReservaException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flagExiste;
    }

    @Override
    public boolean actualizarReserva(String idReservaActual, ReservaDto reservaDto) {
        try {
            Reserva reserva = mapper.empleadoDtoToEmpleado(reservaDto);
            getBarberia().actualizarReserva(idReservaActual, reserva);
            return true;
        } catch (ReservaException e) {
            e.printStackTrace();
            return false;
        }
    }


}

