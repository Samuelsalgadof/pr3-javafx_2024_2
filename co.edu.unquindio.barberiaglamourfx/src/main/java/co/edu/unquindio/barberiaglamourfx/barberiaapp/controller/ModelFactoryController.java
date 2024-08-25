package co.edu.unquindio.barberiaglamourfx.barberiaapp.controller;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.exceptions.EmpleadoException;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.dto.EmpleadoDto;
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

    public void setBanco(Barberia barberia) {
        this.barberia = barberia;
    }


    @Override
    public List<EmpleadoDto> obtenerEmpleados() {
        return  mapper.getEmpleadosDto(barberia.getListaEmpleados());
    }

    @Override
    public boolean agregarEmpleado(EmpleadoDto empleadoDto) {
        try{
            if(!barberia.verificarEmpleadoExistente(empleadoDto.cedula())) {
                Empleado empleado = mapper.empleadoDtoToEmpleado(empleadoDto);
                getBarberia().agregarEmpleado(empleado);
            }
            return true;
        }catch (EmpleadoException e){
            e.getMessage();
            return false;
        }
    }

    @Override
    public boolean eliminarEmpleado(String cedula) {
        boolean flagExiste = false;
        try {
            flagExiste = getanco().eliminarEmpleado(cedula);
        } catch (EmpleadoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flagExiste;
    }

    @Override
    public boolean actualizarEmpleado(String cedulaActual, EmpleadoDto empleadoDto) {
        try {
            Empleado empleado = mapper.empleadoDtoToEmpleado(empleadoDto);
            getBanco().actualizarEmpleado(cedulaActual, empleado);
            return true;
        } catch (EmpleadoException e) {
            e.printStackTrace();
            return false;
        }
    }
}

