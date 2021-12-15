package com.disney.Alkemy.demo.Repository;

import com.disney.Alkemy.demo.Entity.Personaje;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepositoy extends CrudRepository<Personaje, Integer> {
    
}
