/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.disney.Alkemy.demo.Entity;

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
public class GeneroTest {
    
    public GeneroTest() {
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
     * Test of getIdGenero method, of class Genero.
     */
    @Test
    public void testGetIdGenero() {
        System.out.println("getIdGenero");
        Genero instance = new Genero();
        Integer expResult = null;
        Integer result = instance.getIdGenero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdGenero method, of class Genero.
     */
    @Test
    public void testSetIdGenero() {
        System.out.println("setIdGenero");
        Integer idGenero = null;
        Genero instance = new Genero();
        instance.setIdGenero(idGenero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Genero.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Genero instance = new Genero();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Genero.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Genero instance = new Genero();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImagen method, of class Genero.
     */
    @Test
    public void testGetImagen() {
        System.out.println("getImagen");
        Genero instance = new Genero();
        String expResult = "";
        String result = instance.getImagen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImagen method, of class Genero.
     */
    @Test
    public void testSetImagen() {
        System.out.println("setImagen");
        String imagen = "";
        Genero instance = new Genero();
        instance.setImagen(imagen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPelicula method, of class Genero.
     */
    @Test
    public void testGetPelicula() {
        System.out.println("getPelicula");
        Genero instance = new Genero();
        List<Pelicula> expResult = null;
        List<Pelicula> result = instance.getPelicula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPelicula method, of class Genero.
     */
    @Test
    public void testSetPelicula() {
        System.out.println("setPelicula");
        List<Pelicula> pelicula = null;
        Genero instance = new Genero();
        instance.setPelicula(pelicula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
