package com.github.hyagosouzza.cs20162aula03.exercicios2;

import org.junit.Test;

import static org.junit.Assert.*;

public class RaizQuadTest {
    
    @Test
    public void testRaizQuadrada() {
        int n = 0;
        int i = 1;
        double expResult = 0.25;
        RaizQuad instance = new RaizQuad();
        double result = instance.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRaizQuadrada2() {
        int n = 7;
        int i = 7;
        double expResult = 2.6457513110645907;
        RaizQuad instance = new RaizQuad();
        double result = instance.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRaizQuadrada3() {
        int n = 81;
        int i = 4;
        double expResult = 9.014272376994608;
        RaizQuad instance = new RaizQuad();
        double result = instance.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRaizQuadrada4() {
        int n = 49;
        int i = 7;
        double expResult = 7.0;
        RaizQuad instance = new RaizQuad();
        double result = instance.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRaizQuadrada5() {
        int n = 25;
        int i = 3;
        double expResult = 5.015247601944898;
        RaizQuad instance = new RaizQuad();
        double result = instance.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRaizQuadrada6() {
        int n = 9;
        int i = 2;
        double expResult = 3.023529411764706;
        RaizQuad instance = new RaizQuad();
        double result = instance.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRaizQuadrada7() {
        int n = 9;
        int i = 5;
        double expResult = 3.0;
        RaizQuad instance = new RaizQuad();
        double result = instance.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testRaizQuadrada8() {
        int n = 2;
        int i = 1;
        double expResult = 1.4166666666666665;
        RaizQuad instance = new RaizQuad();
        double result = instance.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRaizQuadrada9() {
        int n = 2;
        int i = 3;
        double expResult = 1.4142135623746899;
        RaizQuad instance = new RaizQuad();
        double result = instance.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
}
