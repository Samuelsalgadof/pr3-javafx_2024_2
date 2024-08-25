package co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.mappers;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.dto.ClienteDto;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.dto.ReservaDto;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Cliente;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Reserva;
import java.util.ArrayList;
import java.util.List;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-25T04:32:01-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
*/
public class BarberiaMapperImpl implements BarberiaMapper {

    @Override
    public ReservaDto empleadoToEmpleadoDto(Reserva reserva) {
        if ( reserva == null ) {
            return null;
        }

        String idReserva = null;
        String nombreCliente = null;
        String precio = null;
        String empleadoBarbero = null;
        String fecha = null;

        idReserva = reserva.getIdReserva();
        nombreCliente = reserva.getNombreCliente();
        precio = reserva.getPrecio();
        empleadoBarbero = reserva.getEmpleadoBarbero();
        fecha = reserva.getFecha();

        ReservaDto reservaDto = new ReservaDto( idReserva, nombreCliente, precio, empleadoBarbero, fecha );

        return reservaDto;
    }

    @Override
    public Reserva empleadoDtoToEmpleado(ReservaDto empleadoDto) {
        if ( empleadoDto == null ) {
            return null;
        }

        Reserva reserva = new Reserva();

        reserva.setIdReserva( empleadoDto.idReserva() );
        reserva.setNombreCliente( empleadoDto.nombreCliente() );
        reserva.setPrecio( empleadoDto.precio() );
        reserva.setEmpleadoBarbero( empleadoDto.empleadoBarbero() );
        reserva.setFecha( empleadoDto.fecha() );

        return reserva;
    }

    @Override
    public List<ReservaDto> getEmpleadosDto(List<Reserva> listaEmpleados) {
        if ( listaEmpleados == null ) {
            return null;
        }

        List<ReservaDto> list = new ArrayList<ReservaDto>( listaEmpleados.size() );
        for ( Reserva reserva : listaEmpleados ) {
            list.add( empleadoToEmpleadoDto( reserva ) );
        }

        return list;
    }

    @Override
    public ClienteDto ClienteToClienteDto(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        String nombre = null;
        String cedula = null;
        String email = null;
        String celular = null;
        int edad = 0;

        nombre = cliente.getNombre();
        cedula = cliente.getCedula();
        email = cliente.getEmail();
        celular = cliente.getCelular();
        edad = cliente.getEdad();

        ClienteDto clienteDto = new ClienteDto( nombre, cedula, email, celular, edad );

        return clienteDto;
    }
}
