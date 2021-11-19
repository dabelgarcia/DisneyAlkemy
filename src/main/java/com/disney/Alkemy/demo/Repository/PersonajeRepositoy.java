/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.disney.Alkemy.demo.Repository;

import com.disney.Alkemy.demo.Entity.Personaje;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dario
 */
@Repository
public interface PersonajeRepositoy extends CrudRepository<Personaje, Integer> {
    
}
