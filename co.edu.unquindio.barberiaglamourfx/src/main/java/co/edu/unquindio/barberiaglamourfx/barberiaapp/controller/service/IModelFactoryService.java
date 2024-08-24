package co.edu.unquindio.barberiaglamourfx.barberiaapp.controller.service;


import co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.dto.EmpleadoDto;

import java.util.ArrayList;
import java.util.List;


public interface IModelFactoryService {

    List<EmpleadoDto> obtenerEmpleados();
    boolean agregarEmpleado(EmpleadoDto empleadoDto);

    boolean eliminarEmpleado(String cedula);

    boolean actualizarEmpleado(String cedulaActual, EmpleadoDto empleadoDto);


}
