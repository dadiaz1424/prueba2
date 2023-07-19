package ec.edu.espe.arquitectura.prueba2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.arquitectura.prueba2.model.OfISede;


@Repository
public interface OfiSedeRepository extends  MongoRepository<OfISede, String>{
    
}
