/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolas Moreno
 */
public class PrestamoBordeITTest {
    
    public PrestamoBordeITTest() {
    }

    
            /**
     * Test of estudio method, of class Prestamo.
     * PRUEBAS DE VALORES BORDE
     */
    @Test
    public void test21() {
        System.out.println("Prueba 2.1 VALOR BORDE");
        int cantidad = 1000;
        Prestamo instance = new Prestamo();
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
            /**
     * Test of estudio method, of class Prestamo.
     * PRUEBAS DE VALORES BORDE
     */
    @Test
    public void test22() {
        System.out.println("Prueba 2.2 VALOR BORDE");
        int cantidad = 15000;
        Prestamo instance = new Prestamo();
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
