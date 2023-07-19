package ec.edu.espe.arquitectura.prueba2.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
@Document(collection = "OfiSede")
public class OfISede {

    @Id
    private String codSede;
    private Integer codigoInstitucion;
    private String nombre;
    private String direccion;
    private Boolean esPrincipal;
    private Date fechaCreacion;
    @Version
    private Integer version;

    
}
