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
public class PersonajeTest {
    
    public PersonajeTest() {
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
     * Test of getIdPersonaje method, of class Personaje.
     */
    @Test
    public void testGetIdPersonaje() {
        System.out.println("getIdPersonaje");
        Personaje instance = new Personaje();
        Integer expResult = null;
        Integer result = instance.getIdPersonaje();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdPersonaje method, of class Personaje.
     */
    @Test
    public void testSetIdPersonaje() {
        System.out.println("setIdPersonaje");
        Integer idPersonaje = null;
        Personaje instance = new Personaje();
        instance.setIdPersonaje(idPersonaje);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImagen method, of class Personaje.
     */
    @Test
    public void testGetImagen() {
        System.out.println("getImagen");
        Personaje instance = new Personaje();
        String expResult = "";
        String result = instance.getImagen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImagen method, of class Personaje.
     */
    @Test
    public void testSetImagen() {
        System.out.println("setImagen");
        String imagen = "";
        Personaje instance = new Personaje();
        instance.setImagen(imagen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Personaje.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Personaje instance = new Personaje();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Personaje.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Personaje instance = new Personaje();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEdad method, of class Personaje.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Personaje instance = new Personaje();
        Integer expResult = null;
        Integer result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEdad method, of class Personaje.
     */
    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        Integer edad = null;
        Personaje instance = new Personaje();
        instance.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPeso method, of class Personaje.
     */
    @Test
    public void testGetPeso() {
        System.out.println("getPeso");
        Personaje instance = new Personaje();
        Long expResult = null;
        Long result = instance.getPeso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPeso method, of class Personaje.
     */
    @Test
    public void testSetPeso() {
        System.out.println("setPeso");
        Long peso = null;
        Personaje instance = new Personaje();
        instance.setPeso(peso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHistoria method, of class Personaje.
     */
    @Test
    public void testGetHistoria() {
        System.out.println("getHistoria");
        Personaje instance = new Personaje();
        String expResult = "";
        String result = instance.getHistoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHistoria method, of class Personaje.
     */
    @Test
    public void testSetHistoria() {
        System.out.println("setHistoria");
        String historia = "";
        Personaje instance = new Personaje();
        instance.setHistoria(historia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPelicula method, of class Personaje.
     */
    @Test
    public void testGetPelicula() {
        System.out.println("getPelicula");
        Personaje instance = new Personaje();
        List<Pelicula> expResult = null;
        List<Pelicula> result = instance.getPelicula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPelicula method, of class Personaje.
     */
    @Test
    public void testSetPelicula() {
        System.out.println("setPelicula");
        List<Pelicula> pelicula = null;
        Personaje instance = new Personaje();
        instance.setPelicula(pelicula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Personaje.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Personaje instance = new Personaje();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Personaje.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Personaje instance = new Personaje();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
