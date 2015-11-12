package com.linha.saude.linha.saude;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "user", path = "usuario")
public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    List<Usuario> findByName(@Param("name") String name);
    List<Usuario> findByEmail(@Param("email") String email);

}
