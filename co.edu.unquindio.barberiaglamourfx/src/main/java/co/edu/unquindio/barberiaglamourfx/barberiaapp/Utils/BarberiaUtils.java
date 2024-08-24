package co.edu.unquindio.barberiaglamourfx.barberiaapp.Utils;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Barberia;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Cliente;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Empleado;

public class BarberiaUtils {

    public static Barberia inicializarDatos() {
        Barberia barberia = new Barberia();

        Cliente cliente = new Cliente();
        cliente.getNombre("juan");
        cliente.getCedula("81298812");
        cliente.getEmail("figuerojuan1991@gmail.com");
        cliente.getEdad("13");
        barberia.getListaClientes().add(cliente);

        cliente = new Cliente();
        cliente.getNombre("Zara");
        cliente.getCedula("813313");
        cliente.getEmail("Zara1994@gmail.com");
        cliente.getEdad("34");
        barberia.getListaClientes().add(cliente);


        cliente = new Cliente();
        cliente.getNombre("Pablo");
        cliente.getCedula("814414");
        cliente.getEmail("figueroPablo1991@gmail.com");
        cliente.getEdad("13");
        barberia.getListaClientes().add(cliente);

        Empleado empleado = new Empleado();
        empleado.se("juan");
        empleado.setApellido("arias");
        empleado.setCedula("125454");
        empleado.setTelefono("314");
        empleado.setDireccion("Armenia");
        empleado.setCorreo("aasfa@gmail.om");
        empleado.setFechaNacimiento("13-08-2000");
        empleado.setSalario(500000.0);
        empleado.setCodigo("123");
        banco.getListaEmpleados().add(empleado);

        empleado = new Empleado();
        empleado.setNombre("Ana");
        empleado.setApellido("alzate");
        empleado.setCedula("125454");
        empleado.setTelefono("314");
        empleado.setDireccion("Circasia");
        empleado.setCorreo("ana@gmail.om");
        empleado.setFechaNacimiento("21-08-2000");
        empleado.setSalario(600000.0);
        empleado.setCodigo("123");
        banco.getListaEmpleados().add(empleado);

        empleado = new Empleado();
        empleado.setNombre("Pedro");
        empleado.setApellido("perez");
        empleado.setCedula("125454");
        empleado.setTelefono("314");
        empleado.setDireccion("Quimbaya");
        empleado.setCorreo("aasfa@gmail.om");
        empleado.setFechaNacimiento("01-08-2000");
        empleado.setSalario(700000.0);
        empleado.setCodigo("123");
        banco.getListaEmpleados().add(empleado);
        System.out.println("Información del banco creada");
        return banco;
    }
}

