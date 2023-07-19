package ec.edu.espe.arquitectura.prueba2.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OfiInstitucionRQ {

    private Integer codInstitucion;
    private String ruc;
    private String razonSocial;
    
}
