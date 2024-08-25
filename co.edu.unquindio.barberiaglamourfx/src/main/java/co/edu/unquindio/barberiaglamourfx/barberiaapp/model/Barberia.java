package co.edu.unquindio.barberiaglamourfx.barberiaapp.model;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.exceptions.EmpleadoException;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.dto.EmpleadoDto;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.services.IBarberiaServices;

import java.util.ArrayList;


public class Barberia implements IBarberiaServices {
    ArrayList<Cliente> listaClientes = new ArrayList<>();
    ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public Barberia() {

    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public boolean empleadoExiste(String cedula) {
        boolean empleadoEncontrado = false;
        for (Empleado empleado : getListaEmpleados()) {
            if (empleado.getCedula().equalsIgnoreCase(cedula)) {
                empleadoEncontrado = true;
                break;
            }
        }
        return empleadoEncontrado;
    }

    @Override
    public Empleado crearEmpleado(String nombre, String cedula, String email, String celular, int edad) throws EmpleadoException {
        Empleado nuevoEmpleado = null;
        boolean empleadoExiste = verificarEmpleadoExistente(cedula);
        if(empleadoExiste){
            throw new EmpleadoException("El empleado con cedula: "+cedula+" ya existe");
        }else{
            nuevoEmpleado = new Empleado();
            nuevoEmpleado.setNombre(nombre);
            nuevoEmpleado.setCedula(cedula);
            nuevoEmpleado.setCedula(cedula);
            nuevoEmpleado.setFechaNacimiento(fechaNacimiento);
            getListaEmpleados().add(nuevoEmpleado);
        }
        return nuevoEmpleado;
    }

    @Override
    public Boolean eliminarEmpleado(String cedula) throws EmpleadoException {
        return null;
    }

    @Override
    public boolean actualizarEmpleado(String cedulaActual, Empleado empleado) throws EmpleadoException {
        return false;
    }

    @Override
    public boolean verificarEmpleadoExistente(String cedula) throws EmpleadoException {
        return false;
    }

    @Override
    public Empleado obtenerEmpleado(String cedula) {
        return null;
    }

    @Override
    public ArrayList<Empleado> obtenerEmpleados() {
        return null;
    }
}
