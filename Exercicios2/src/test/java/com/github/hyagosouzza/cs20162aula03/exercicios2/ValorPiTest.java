package com.github.hyagosouzza.cs20162aula03.exercicios2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValorPiTest {
    
    @Test
    public void testAcharPi() {
        int n = 1;
        double expResult = 4.0;
        ValorPi instance = new ValorPi();
        double result = instance.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAcharPi2() {
        int n = 2;
        double expResult = 2.666666626930237;
        ValorPi instance = new ValorPi();
        double result = instance.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAcharPi3() {
        int n = 3;
        double expResult = 3.4666666388511658;
        ValorPi instance = new ValorPi();
        double result = instance.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAcharPi4() {
        int n = 5;
        double expResult = 3.33968248963356;
        ValorPi instance = new ValorPi();
        double result = instance.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAcharPi5() {
        int n = 10;
        double expResult = 3.0418395549058914;
        ValorPi instance = new ValorPi();
        double result = instance.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAcharPi6() {
        int n = 50;
        double expResult = 3.121594585478306;
        ValorPi instance = new ValorPi();
        double result = instance.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAcharPi7() {
        int n = 25;
        double expResult = 3.1815766245126724;
        ValorPi instance = new ValorPi();
        double result = instance.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testAcharPi8() {
        int n = 99;
        double expResult = 3.151693342253566;
        ValorPi instance = new ValorPi();
        double result = instance.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }
}
