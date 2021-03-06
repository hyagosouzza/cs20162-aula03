package com.github.hyagosouzza.cs20162aula03.exercicios2;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogaritmoNaturalTest {
    
    @Test
    public void testFatorial() {
        float n = 0;
        float expResult = 1;
        LogaritmoNatural instance = new LogaritmoNatural();
        float result = instance.fatorial(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testFatorial2() {
        float n = 1;
        float expResult = 1;
        LogaritmoNatural instance = new LogaritmoNatural();
        float result = instance.fatorial(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testPotencia() {
        float n = 1;
        float m = 2;
        float expResult = 1;
        LogaritmoNatural instance = new LogaritmoNatural();
        float result = instance.potencia(n, m);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testPotencia2() {
        float n = 2;
        float m = 2;
        float expResult = 4;
        LogaritmoNatural instance = new LogaritmoNatural();
        float result = instance.potencia(n, m);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testPotencia3() {
        float n = 2;
        float m = 0;
        float expResult = 1;
        LogaritmoNatural instance = new LogaritmoNatural();
        float result = instance.potencia(n, m);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testPotencia4() {
        float n = 2;
        float m = 1;
        float expResult = 2;
        LogaritmoNatural instance = new LogaritmoNatural();
        float result = instance.potencia(n, m);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testLogNat() {
        float a = 1;
        float b = 2;
        float expResult = 2.5f;
        LogaritmoNatural instance = new LogaritmoNatural();
        float result = instance.logNat(a, b);
        assertEquals(expResult, result, 0.0);
    }
}
