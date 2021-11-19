package com.disney.Alkemy.demo.Controller;

import com.disney.Alkemy.demo.Entity.Genero;
import com.disney.Alkemy.demo.Service.GeneroService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GeneroController {
    
	@Autowired
	private GeneroService generoService;
	
	
	  @GetMapping (path = "/id")
	  public ResponseEntity<Genero> listarGeneroPorId(@RequestParam @PathVariable Integer idGenero){		  
		  Genero genero =  generoService.listarGeneroPorId(idGenero);		  
		  Genero genero = new Genero(genero);
		  return ResponseEntity.ok(genero);
	  }
	  
   @GetMapping(path = "/buscador")
   public ResponseEntity<ArrayList<Genero>> listarGenero(@RequestParam String nombre){
		  ArrayList<Genero> genero= generoService.listarGenero(String genero);
		  ArrayList<Genero> genero= new ArrayList<>();
		  for(Genero g : genero) {
			  genero.add(new Genero(g));
		  }
		  return ResponseEntity.ok(generoDTO);
		}
	  
	  
	
	@SuppressWarnings("rawtypes")
	@DeleteMapping(path = "/id")
	  public ResponseEntity eliminacionGenero(@RequestParam @PathVariable Integer idGenero) {
		generoService.eliminacionGenero(idGenero);
	  	return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	  }
	  
	  
	 
	@SuppressWarnings("rawtypes")
	@PutMapping(path = "/id")
	  public ResponseEntity edicionGenero(@PathVariable @RequestParam Long idGenero, @Valid @RequestParam GeneroDTO generoDTO) {
		Genero genero= generoService.listarGeneroPorId(idGenero);
		genero.setIdGenero(generoDTO.getIdGenero());
		genero.setImagen(generoDTO.getImagen());
		genero.setNombre(generoDTO.getNombre());
	  	generoService.edicionGenero(genero);
	  	return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	  }
	  
	  
	  @PostMapping
	  public ResponseEntity<GeneroDTO> creacionGenero(@Valid @RequestBody  GeneroDTO generoDTO){
		  Genero genero = new Genero();
		  genero.setIdGenero(generoDTO.getIdGenero());
		  genero.setImagen(generoDTO.getImagen());
		  genero.setNombre(generoDTO.getNombre());
	  	generoService.creacionGenero(genero);
		  return ResponseEntity.status(HttpStatus.CREATED).body(generoDTO);
	  }
}

