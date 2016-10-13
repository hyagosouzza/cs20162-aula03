package com.github.hyagosouzza.cs20162aula03.exercicios2;
import org.junit.Test;
import static org.junit.Assert.*;
public class QuadradoPerfeitoTest {
    @Test
    public void testQuadPer() {
        int n = 1;
        boolean expResult = true;
        QuadradoPerfeito instance = new QuadradoPerfeito();
        boolean result = instance.quadPer(n);
        assertEquals(expResult, result);
    }
    @Test
    public void testQuadPer2() {
        int n = 10;
        boolean expResult = false;
        QuadradoPerfeito instance = new QuadradoPerfeito();
        boolean result = instance.quadPer(n);
        assertEquals(expResult, result);
    }
    @Test
    public void testQuadPer3() {
        int n = 144;
        boolean expResult = true;
        QuadradoPerfeito instance = new QuadradoPerfeito();
        boolean result = instance.quadPer(n);
        assertEquals(expResult, result);
    }
    @Test
    public void testQuadPer4() {
        int n = 64;
        boolean expResult = true;
        QuadradoPerfeito instance = new QuadradoPerfeito();
        boolean result = instance.quadPer(n);
        assertEquals(expResult, result);
    }
    @Test
    public void testQuadPer5() {
        int n = 2;
        boolean expResult = false;
        QuadradoPerfeito instance = new QuadradoPerfeito();
        boolean result = instance.quadPer(n);
        assertEquals(expResult, result);
    }
    @Test
    public void testQuadPer6() {
        int n = 9;
        boolean expResult = true;
        QuadradoPerfeito instance = new QuadradoPerfeito();
        boolean result = instance.quadPer(n);
        assertEquals(expResult, result);
    }
    @Test
    public void testQuadPer7() {
        int n = 3;
        boolean expResult = false;
        QuadradoPerfeito instance = new QuadradoPerfeito();
        boolean result = instance.quadPer(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testQuadPer8() {
        int n = 25;
        boolean expResult = true;
        QuadradoPerfeito instance = new QuadradoPerfeito();
        boolean result = instance.quadPer(n);
        assertEquals(expResult, result);
    }
}
