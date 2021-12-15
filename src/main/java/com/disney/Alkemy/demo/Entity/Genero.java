
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
public class Genero {

@Id
@GeneratedValue
 private Integer idGenero;

 private String nombre;
 private String imagen;
 
 @OneToMany
 private List<Pelicula> pelicula= new ArrayList<Pelicula>();

    public Genero(Genero genero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public Integer getIdGenero() {
	return idGenero;
}

public void setIdGenero(Integer idGenero) {
	this.idGenero = idGenero;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getImagen() {
	return imagen;
}

public void setImagen(String imagen) {
	this.imagen = imagen;
}

public List<Pelicula> getPelicula() {
	return pelicula;
}

public void setPelicula(List<Pelicula> pelicula) {
	this.pelicula = pelicula;
}



}
