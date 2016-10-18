package com.github.hyagosouzza.cs20162aula03.exercicios2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FatorialTest {
    
    @Test
    public void testFatorial() {
        int n = 0;
        int expResult = 1;
        Fatorial instance = new Fatorial();
        int result = instance.fatorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorial2() {
        int n = 1;
        int expResult = 1;
        Fatorial instance = new Fatorial();
        int result = instance.fatorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorial3() {
        int n = 2;
        int expResult = 2;
        Fatorial instance = new Fatorial();
        int result = instance.fatorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorial4() {
        int n = 3;
        int expResult = 6;
        Fatorial instance = new Fatorial();
        int result = instance.fatorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorial5() {
        int n = 4;
        int expResult = 24;
        Fatorial instance = new Fatorial();
        int result = instance.fatorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorial6() {
        int n = 5;
        int expResult = 120;
        Fatorial instance = new Fatorial();
        int result = instance.fatorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorial7() {
        int n = 6;
        int expResult = 720;
        Fatorial instance = new Fatorial();
        int result = instance.fatorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorial8() {
        int n = 7;
        int expResult = 5040;
        Fatorial instance = new Fatorial();
        int result = instance.fatorial(n);
        assertEquals(expResult, result);
    }
}
