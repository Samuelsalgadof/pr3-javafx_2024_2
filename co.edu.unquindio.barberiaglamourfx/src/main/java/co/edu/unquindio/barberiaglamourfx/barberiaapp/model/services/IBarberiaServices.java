package co.edu.unquindio.barberiaglamourfx.barberiaapp.model.services;


import co.edu.unquindio.barberiaglamourfx.barberiaapp.exceptions.EmpleadoException;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Empleado;

import java.util.ArrayList;

public interface IBarberiaServices {
    public Empleado crearEmpleado(String nombre, String apellido, String cedula, String fechaNacimiento) throws EmpleadoException;
    public Boolean eliminarEmpleado(String cedula)throws EmpleadoException;
    boolean actualizarEmpleado(String cedulaActual, Empleado empleado) throws EmpleadoException;
    public boolean  verificarEmpleadoExistente(String cedula) throws EmpleadoException;
    public Empleado obtenerEmpleado(String cedula);
    public ArrayList<Empleado> obtenerEmpleados();
}
