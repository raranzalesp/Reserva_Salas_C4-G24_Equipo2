package co.edu.unab.salas_computo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unab.salas_computo.models.UsuarioModel;

public interface UsuarioRepository extends MongoRepository<UsuarioModel , String>  {
    
}
