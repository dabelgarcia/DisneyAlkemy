/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.disney.Alkemy.demo.Service;

import com.disney.Alkemy.demo.Entity.Genero;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dario
 */
@Service
public interface GeneroService {
	
	public ArrayList<Genero> listarGenero(String nombre);
	public Genero listarGeneroPorId(Integer idGenero);
	public void eliminacionGenero(Integer idGenero);
	public void edicionGenero(Genero genero);
	public Integer creacionGenero( Genero genero);

    public Genero listarGeneroPorId(Long idGenero);
}