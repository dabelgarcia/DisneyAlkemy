/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.disney.Alkemy.demo.Entity;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dario
 */
public class PeliculaTest {
    
    public PeliculaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Pelicula.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Pelicula instance = new Pelicula();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Pelicula.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Pelicula instance = new Pelicula();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImagen method, of class Pelicula.
     */
    @Test
    public void testGetImagen() {
        System.out.println("getImagen");
        Pelicula instance = new Pelicula();
        String expResult = "";
        String result = instance.getImagen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImagen method, of class Pelicula.
     */
    @Test
    public void testSetImagen() {
        System.out.println("setImagen");
        String imagen = "";
        Pelicula instance = new Pelicula();
        instance.setImagen(imagen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class Pelicula.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Pelicula instance = new Pelicula();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Pelicula.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Pelicula instance = new Pelicula();
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaCreacion method, of class Pelicula.
     */
    @Test
    public void testGetFechaCreacion() {
        System.out.println("getFechaCreacion");
        Pelicula instance = new Pelicula();
        Date expResult = null;
        Date result = instance.getFechaCreacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaCreacion method, of class Pelicula.
     */
    @Test
    public void testSetFechaCreacion() {
        System.out.println("setFechaCreacion");
        Date fechaCreacion = null;
        Pelicula instance = new Pelicula();
        instance.setFechaCreacion(fechaCreacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalificacion method, of class Pelicula.
     */
    @Test
    public void testGetCalificacion() {
        System.out.println("getCalificacion");
        Pelicula instance = new Pelicula();
        Integer expResult = null;
        Integer result = instance.getCalificacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCalificacion method, of class Pelicula.
     */
    @Test
    public void testSetCalificacion() {
        System.out.println("setCalificacion");
        Integer calificacion = null;
        Pelicula instance = new Pelicula();
        instance.setCalificacion(calificacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdPelicula method, of class Pelicula.
     */
    @Test
    public void testGetIdPelicula() {
        System.out.println("getIdPelicula");
        Pelicula instance = new Pelicula();
        Integer expResult = null;
        Integer result = instance.getIdPelicula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdPelicula method, of class Pelicula.
     */
    @Test
    public void testSetIdPelicula() {
        System.out.println("setIdPelicula");
        Integer idPelicula = null;
        Pelicula instance = new Pelicula();
        instance.setIdPelicula(idPelicula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonaje method, of class Pelicula.
     */
    @Test
    public void testGetPersonaje() {
        System.out.println("getPersonaje");
        Pelicula instance = new Pelicula();
        List<Personaje> expResult = null;
        List<Personaje> result = instance.getPersonaje();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonaje method, of class Pelicula.
     */
    @Test
    public void testSetPersonaje() {
        System.out.println("setPersonaje");
        List<Personaje> personaje = null;
        Pelicula instance = new Pelicula();
        instance.setPersonaje(personaje);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Pelicula.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Pelicula instance = new Pelicula();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Pelicula.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Pelicula instance = new Pelicula();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
