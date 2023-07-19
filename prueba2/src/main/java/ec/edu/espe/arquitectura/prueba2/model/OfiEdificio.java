package ec.edu.espe.arquitectura.prueba2.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
@Document(collection = "OfiEdificio")
public class OfiEdificio {

    @Id
    private String codEdificio;
    private String codSed;
    private String nombre;
    private Integer pisos;
    private BigDecimal superficie;
    @Version
    private Integer version;
    
}
