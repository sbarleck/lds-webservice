package com.linha.saude.linha.saude;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "linha_instituicao", path = "linha-instituicao")
public interface InstituicaoSaudeRepository extends MongoRepository<InstituicaoSaude, String> {

    List<InstituicaoSaude> findByName(@Param("name") String name);

}
