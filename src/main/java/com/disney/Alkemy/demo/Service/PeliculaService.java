package com.disney.Alkemy.demo.Service;

import com.disney.Alkemy.demo.Entity.Pelicula;
import com.disney.Alkemy.demo.Repository.PeliculaRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface PeliculaService {
    
    @Autowired
    private PeliculaRepository peliculaRepository;
    
    @Transactional
    public void guardarPelicula(String nombrePelicula) throws Exception {
        validar(nombrePelicula);
       
        Pelicula pelicula = new pelicula();
        pelicula set.guardarPelicula(nombrePelicula);
        
        peliculaRepository.save(pelicula);
        
    }
    
        @Transactional(readOnly = true)
    public List<Autor> listarAutores(){
        List<Autor> autores = autorRepositorio.findAll(Sort.by(Sort.Direction.ASC, "nombre"));
        
        return autores;
    }
    
    @Transactional
    public void eliminarAutor(String id){
        autorRepositorio.deleteById(id);
    }
    
    @Transactional(readOnly = true)
    public Autor buscarAutorPorId(String id){
        Optional<Autor> respuesta = autorRepositorio.findById(id);
        
        Autor autor = respuesta.get();
        
        return autor;
    }
    
    @Transactional
    public void modificarAutor(String id, String nombreAutor) throws Exception{
        validar(nombreAutor);
        
        Autor autor = buscarAutorPorId(id);
        autor.setNombre(nombreAutor);
        
        autorRepositorio.save(autor);
    }
    
    @Transactional
    public void altaAutor(String id){
        Autor autor = buscarAutorPorId(id);
        autor.setAlta(true);
        
        autorRepositorio.save(autor);
    }
    
    @Transactional
    public void bajaAutor(String id){
        Autor autor = buscarAutorPorId(id);
        autor.setAlta(false);
        
        autorRepositorio.save(autor);
    }
    
    @Transactional
    public List<Autor> listarAutoresAlta(){
        List<Autor> autoresAlta = autorRepositorio.listarAutoresAlta();
        
        return autoresAlta;
    }
    
    public void validar(String nombreAutor) throws Exception{
        if(nombreAutor == null || nombreAutor.isEmpty()){
            throw new Exception();
    }
    
}
}
	public ArrayList<Pelicula> listarPeliculas(Pelicula pelicula);
	public Pelicula listarPeliculaPorId(Integer idPelicula);
	public void eliminacionPelicula(Integer idPelicula);
	public void edicionPelicula(Pelicula pelicula);
	public Integer creacionPelicula( Pelicula pelicula);
}
