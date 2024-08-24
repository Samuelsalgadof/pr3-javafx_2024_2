package co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.mappers;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.dto.ClienteDto;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.dto.EmpleadoDto;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Cliente;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.model.Empleado;
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
    EmpleadoDto empleadoToEmpleadoDto(Empleado empleado);

    Empleado empleadoDtoToEmpleado(EmpleadoDto empleadoDto);

    @IterableMapping(qualifiedByName = "empleadoToEmpleadoDto")
    List<EmpleadoDto> getEmpleadosDto(List<Empleado> listaEmpleados);

//    @Named("mappingToEmpeladoDto")
//    EmpleadoDto mappingToEmpeladoDto(Empleado empleado);


    @Mapping(target = "nombreCliente", source = "cliente.nombre")
    @IterableMapping(qualifiedByName = "cunetaToCuentaDto")
    ClienteDto clienteToClienteDto(Cliente cliente);


}

