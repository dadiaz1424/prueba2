package ec.edu.espe.arquitectura.prueba2.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OfiSedeRQ {

    private String codSede;
    private Integer codigoInstitucion;
    private String nombre;
    private String direccion;
    private Boolean esPrincipal;
    private Date fechaCreacion;
    
}
