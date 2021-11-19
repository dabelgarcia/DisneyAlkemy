/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.disney.Alkemy.demo.Service;

import com.disney.Alkemy.demo.Entity.Personaje;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dario
 */
@Service
public interface PersonajeService {
    	public ArrayList<Personaje> listarPersonajePorNombre(String nombre);
	public Personaje listarPersonajePorId(Integer idPersonaje);
	public Personaje listarPersonajePorEdad(Integer edad);
	public void eliminacionPersonaje(Integer idPersonaje);
	public void edicionPersonaje(Personaje personaje);
	public Integer creacionPersonaje( Personaje personaje);
}
