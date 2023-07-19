package ec.edu.espe.arquitectura.prueba2.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
@Document(collection = "OfiInstitucion")
public class OfiInstitucion {

    @Id
    private Integer codInstitucion;
    private String ruc;
    private String razonSocial;
    @Version
    private Integer version;
    
}
