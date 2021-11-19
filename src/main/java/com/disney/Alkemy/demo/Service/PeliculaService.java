/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.disney.Alkemy.demo.Service;

import com.disney.Alkemy.demo.Entity.Pelicula;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dario
 */
@Service
public interface PeliculaService {
	public ArrayList<Pelicula> listarPeliculas(Pelicula pelicula);
	public Pelicula listarPeliculaPorId(Integer idPelicula);
	public void eliminacionPelicula(Integer idPelicula);
	public void edicionPelicula(Pelicula pelicula);
	public Integer creacionPelicula( Pelicula pelicula);
}
