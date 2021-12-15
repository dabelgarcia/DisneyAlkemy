package com.disney.Alkemy.demo.Repository;

import com.disney.Alkemy.demo.Entity.Genero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends CrudRepository<Genero, Integer> {

}
    

