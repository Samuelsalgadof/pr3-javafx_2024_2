package co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.mappers;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.dto.ClienteDto;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.dto.EmpleadoDto;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.dto.ReservaDto;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Cliente;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Empleado;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Reserva;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface BarberiaMapper {
    BarberiaMapper INSTANCE = Mappers.getMapper(BarberiaMapper.class);

    @Named("empleadoToEmpleadoDto")
    ReservaDto empleadoToEmpleadoDto(Reserva reserva);

    Reserva empleadoDtoToEmpleado(ReservaDto empleadoDto);

    @IterableMapping(qualifiedByName = "empleadoToEmpleadoDto")
    List<ReservaDto> getEmpleadosDto(List<Reserva> listaEmpleados);

    @Mapping(target = "nombreCliente", source = "Cliente.nombre")
    @IterableMapping(qualifiedByName = "ClienteToClienteDto")
    ClienteDto ClienteToClienteDto(Cliente cliente);
}

