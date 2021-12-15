package com.disney.Alkemy.demo.Repository;

import com.disney.Alkemy.demo.Entity.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends CrudRepository <Pelicula, Integer> {
    
}
