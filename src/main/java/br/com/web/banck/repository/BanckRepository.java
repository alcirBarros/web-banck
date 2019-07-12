package br.com.web.banck.repository;

import br.com.web.banck.entity.Banck;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BanckRepository extends CrudRepository<Banck, Integer> {
    
}
