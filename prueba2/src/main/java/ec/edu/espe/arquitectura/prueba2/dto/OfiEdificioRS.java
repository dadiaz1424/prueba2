package ec.edu.espe.arquitectura.prueba2.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OfiEdificioRS {
    
    private String codEdificio;
    private String codSed;
    private String nombre;
    private Integer pisos;
    private BigDecimal superficie;
    private List<OfiSedeRQ>codSede;
}
