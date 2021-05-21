/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolas Moreno
 */
public class PrestamoITAfterBeforeTest {
    
    private Prestamo instance;
    
    public PrestamoITAfterBeforeTest() {
    }
    
    @Before
    public void setUp() {
        instance = new Prestamo();
    }
    
    @After
    public void tearDown() {
        instance=null;
    }

/**
     * Test of main method, of class Prestamo.
     * PRUEBAS DE EQUIVALENCIA
     */
    @Test
    public void test11() {
        System.out.println("Prueba 1.1 CASOS DE EQUIVALENCIA");
        int cantidad = 750;
        String expResult = "Préstamo no concedido carece de interes";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of estudio method, of class Prestamo.
     * PRUEBAS DE EQUIVALENCIA
     */
    @Test
    public void test12() {
        System.out.println("Prueba 1.2 CASOS DE EQUIVALENCIA");
        int cantidad = 17000;
        String expResult = "Préstamo no concedido es una operación con demasiado riesgo";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        /**
     * Test of estudio method, of class Prestamo.
     * PRUEBAS DE EQUIVALENCIA
     */
    @Test
    public void test13() {
        System.out.println("Prueba 1.3 CASOS DE EQUIVALENCIA");
        int cantidad = 10000;
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    
}
