package com.disney.Alkemy.demo.Entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Dario
 */
@Entity
public class Personaje {
	
@Id
@GeneratedValue
private Integer idPersonaje;

private String imagen;
private String nombre;
private Integer edad;
private Long peso;
private String historia;

@OneToMany
private List<Pelicula> pelicula= new ArrayList<Pelicula>();

public Integer getIdPersonaje() {
	return idPersonaje;
}
public void setIdPersonaje(Integer idPersonaje) {
	this.idPersonaje = idPersonaje;
}
public String getImagen() {
	return imagen;
}
public void setImagen(String imagen) {
	this.imagen = imagen;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Integer getEdad() {
	return edad;
}
public void setEdad(Integer edad) {
	this.edad = edad;
}
public Long getPeso() {
	return peso;
}
public void setPeso(Long peso) {
	this.peso = peso;
}
public String getHistoria() {
	return historia;
}
public void setHistoria(String historia) {
	this.historia = historia;
}


public List<Pelicula> getPelicula() {
	return pelicula;
}
public void setPelicula(List<Pelicula> pelicula) {
	this.pelicula = pelicula;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((idPersonaje == null) ? 0 : idPersonaje.hashCode());
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
	Personaje other = (Personaje) obj;
	if (idPersonaje == null) {
		if (other.idPersonaje != null)
			return false;
	} else if (!idPersonaje.equals(other.idPersonaje))
		return false;
	return true;
}

    
}
