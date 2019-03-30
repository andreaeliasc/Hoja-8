/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrea
 */
public class BinaryTree2Test {
    
    public BinaryTree2Test() {
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
     * Test of getRaiz method, of class BinaryTree2.
     */
    @Test
    public void testGetRaiz() {
        System.out.println("getRaiz");
        BinaryTree2 instance = null;
        BinaryNode expResult = null;
        BinaryNode result = instance.getRaiz();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRaiz method, of class BinaryTree2.
     */
    @Test
    public void testSetRaiz() {
        System.out.println("setRaiz");
        BinaryTree2 instance = null;
        instance.setRaiz(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNodo method, of class BinaryTree2.
     */
    @Test
    public void testAddNodo() {
        System.out.println("addNodo");
        BinaryNode nodo = null;
        BinaryTree2 instance = null;
        instance.addNodo(nodo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recorrer method, of class BinaryTree2.
     */
    @Test
    public void testRecorrer() {
        System.out.println("recorrer");
        BinaryTree2.recorrido tipo = null;
        BinaryTree2 instance = null;
        instance.recorrer(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPalabra method, of class BinaryTree2.
     */
    @Test
    public void testBuscarPalabra() {
        System.out.println("buscarPalabra");
        String palabra = "";
        BinaryTree2 instance = null;
        String expResult = "";
        String result = instance.buscarPalabra(palabra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
