package co.edu.unquindio.barberiaglamourfx.barberiaapp.Utils;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Barberia;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Cliente;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Empleado;

public class BarberiaUtils {

    public static Barberia inicializarDatos() {
        Barberia barberia = new Barberia();

        Cliente cliente = new Cliente();
        cliente.setNombre("juan");
        cliente.setCedula("81298812");
        cliente.setEmail("figuerojuan1991@gmail.com");
        cliente.setCelular("3046758399");
        cliente.setEdad(43);
        barberia.getListaClientes().add(cliente);

        cliente = new Cliente();
        cliente.setNombre("Zara");
        cliente.setCedula("813313");
        cliente.setEmail("Zara1994@gmail.com");
        cliente.setCelular("3236758320");
        cliente.setEdad(34);
        barberia.getListaClientes().add(cliente);


        cliente = new Cliente();
        cliente.setNombre("Pablo");
        cliente.setCedula("814414");
        cliente.setEmail("figueroPablo1991@gmail.com");
        cliente.setCelular("3175754689");
        cliente.setEdad(22);
        barberia.getListaClientes().add(cliente);

        Empleado empleado = new Empleado();
        empleado.setNombre("juan");
        empleado.setCedula("125454");
        empleado.setEmail("aasfa@gmail.om");
        empleado.setCelular("3146754322");
        empleado.setEdad(19);
        barberia.getListaEmpleados().add(empleado);

        empleado = new Empleado();
        empleado.setNombre("Ana");
        empleado.setCedula("125454");
        empleado.setEmail("ana@gmail.om");
        empleado.setCelular("3106754752");
        empleado.setEdad(39);
        barberia.getListaEmpleados().add(empleado);

        System.out.println("Información de la barberia creada");
        return barberia;
    }
}

