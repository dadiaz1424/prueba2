package ec.edu.espe.arquitectura.prueba2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.arquitectura.prueba2.model.OfiEdificio;

@Repository
public interface OfiEdificioRepository extends  MongoRepository<OfiEdificio, String>{



    
}
