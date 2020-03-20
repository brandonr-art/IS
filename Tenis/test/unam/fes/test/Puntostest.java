/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unam.fes.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import unam.fes.is.Tenis;

/**
 *
 * @author brand
 */
public class Puntostest {
    
    public Puntostest() {
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

    
     @Test
     public void empate() {
     Tenis juego = new Tenis(4,4,"Brandon","Areli");
         assertEquals("Deuce", juego.juego());
     
     }
     @Test
     public void empate2() {
     Tenis juego = new Tenis(5,5,"Brandon","Areli");
         assertEquals("Deuce", juego.juego());
     
     }
     
     
     @Test
     public void ganando1_2() {
     Tenis juego = new Tenis(1,2,"Brandon","Areli");
         assertEquals("Quince,Treinta", juego.juego());
     
     }
     @Test
     public void ganador() {
     Tenis juego = new Tenis(4,0,"Brandon","Areli");
         assertEquals("Brandon Ganador", juego.juego());
     
     }
     @Test
     public void ganador2() {
     Tenis juego = new Tenis(1,4,"Brandon","Areli");
         assertEquals("Areli Ganador", juego.juego());
     
     }
     
}
