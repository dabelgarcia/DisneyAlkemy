/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.disney.Alkemy.demo.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Dario
 */
@Entity
public class Pelicula {
	
@Id
@GeneratedValue
private Integer idPelicula;

private String imagen;
private String titulo;


@Temporal(javax.persistence.TemporalType.DATE)
private Date fechaCreacion;
private Integer calificacion;

@OneToMany
private List<Personaje> personaje= new ArrayList<Personaje>();



public Integer getId() {
	return idPelicula;
}

public void setId(Integer id) {
	this.idPelicula = id;
}

public String getImagen() {
	return imagen;
}

public void setImagen(String imagen) {
	this.imagen = imagen;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public Date getFechaCreacion() {
	return fechaCreacion;
}

public void setFechaCreacion(Date fechaCreacion) {
	this.fechaCreacion = fechaCreacion;
}

public Integer getCalificacion() {
	return calificacion;
}

public void setCalificacion(Integer calificacion) {
	this.calificacion = calificacion;
}


public Integer getIdPelicula() {
	return idPelicula;
}

public void setIdPelicula(Integer idPelicula) {
	this.idPelicula = idPelicula;
}



public List<Personaje> getPersonaje() {
	return personaje;
}

public void setPersonaje(List<Personaje> personaje) {
	this.personaje = personaje;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((idPelicula == null) ? 0 : idPelicula.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Pelicula other = (Pelicula) obj;
	if (idPelicula == null) {
		if (other.idPelicula != null)
			return false;
	} else if (!idPelicula.equals(other.idPelicula))
		return false;
	return true;
}
    
}
