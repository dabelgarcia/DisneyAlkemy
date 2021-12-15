package com.disney.Alkemy.demo.Controller;

import com.disney.Alkemy.demo.Entity.Genero;
import com.disney.Alkemy.demo.Service.GeneroService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Genero")
public class GeneroController {
    
    @Autowired
    private GeneroService generoService;
    
    @GetMapping("/lista-Genero")
    public String listaAutores(ModelMap modelo){
        List<Genero> generos = generoService.listarGenero();
        
        modelo.addAttribute("genero", generos);
        
        return "lista-genero";
    }
    
    @GetMapping("/formulario-genero")
    public String formularioAutores(){
        
        return "formulario-genero";
    }
    
    @PostMapping("/formulario-genero")
    public String guardarGenero(ModelMap modelo, @RequestParam String nombreAutor){
        try {
            GeneroService.guardarGenero();
            
            modelo.put("exito", "registro exitoso");
            
            return "formulario-autores";
        } catch (Exception e) {
            modelo.put("error", "registro erroneo.");
            
            return "formulario-autores";
        }
    }
    
    @GetMapping("/eliminar-autor/{id}")
    public String eliminarAutor(@PathVariable String id){
        autorServicio.eliminarAutor(id);
        
        return "redirect:/autores/lista-autores";
    }
    
    @GetMapping("/modificar-autor/{id}")
    public String formularioModificarAutores(@PathVariable String id, ModelMap modelo){
        modelo.put("autor", autorServicio.buscarAutorPorId(id));
        
        return "formulario-modificar-autores";
    }
    
    @PostMapping("/modificar-autor/{id}")
    public String modificarAutor(@PathVariable String id, @RequestParam String nombreAutor){
        try {
            autorServicio.modificarAutor(id, nombreAutor);
            
            return "redirect:/autores/lista-autores";
        } catch (Exception e) {
            return "formulario-modificar-autores";
        }
    }
    
    @GetMapping("/alta-autor/{id}")
    public String alta(@PathVariable String id){
        try {
            autorServicio.altaAutor(id);
            
            return "redirect:/autores/lista-autores";
        } catch (Exception e) {
            return "redirect:/autores/lista-autores";
        }
    }
    
    @GetMapping("/baja-autor/{id}")
    public String baja(@PathVariable String id){
        try {
            autorServicio.bajaAutor(id);
            
            return "redirect:/autores/lista-autores";
        } catch (Exception e) {
            return "redirect:/autores/lista-autores";
        }
    }
}