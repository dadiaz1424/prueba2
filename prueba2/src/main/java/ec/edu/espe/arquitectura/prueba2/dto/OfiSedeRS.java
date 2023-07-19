package ec.edu.espe.arquitectura.prueba2.dto;

import java.util.Date;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OfiSedeRS {
    private String codSede;
    private Integer codigoInstitucion;
    private String nombre;
    private String direccion;
    private Boolean esPrincipal;
    private Date fechaCreacion;
    private List<OfiEdificioRQ> codInstitucionRQs;
    
}
