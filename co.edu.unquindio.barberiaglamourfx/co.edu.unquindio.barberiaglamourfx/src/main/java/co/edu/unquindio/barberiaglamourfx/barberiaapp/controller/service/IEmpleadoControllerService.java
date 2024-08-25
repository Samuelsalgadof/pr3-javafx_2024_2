package co.edu.unquindio.barberiaglamourfx.barberiaapp.controller.service;


import co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.dto.EmpleadoDto;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Empleado;

public interface IEmpleadoControllerService {
    Empleado obtenerEmpleados();

    boolean agregarEmpleado(EmpleadoDto empleadoDto);

    boolean eliminarEmpleado(String cedula);

    boolean actualizarEmpleado(String cedulaActual, EmpleadoDto empleadoDto);
}
