package com.github.hyagosouzza.cs20162aula03.exercicios2;
import org.junit.Test;
import static org.junit.Assert.*;
public class RazaoAureaTest {
    @Test
    public void testRazaoAurea() {
        int x = 0;
        int y = 1;
        int z = 1;
        double expResult = 1.0;
        RazaoAurea instance = new RazaoAurea();
        double result = instance.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testRazaoAurea2() {
        int x = 0;
        int y = 1;
        int z = 2;
        double expResult = 2.0;
        RazaoAurea instance = new RazaoAurea();
        double result = instance.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testRazaoAurea3() {
        int x = 1;
        int y = 2;
        int z = 3;
        double expResult = 1.6;
        RazaoAurea instance = new RazaoAurea();
        double result = instance.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testRazaoAurea4() {
        int x = 1;
        int y = 2;
        int z = 2;
        double expResult = 1.6666666666666667;
        RazaoAurea instance = new RazaoAurea();
        double result = instance.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testRazaoAurea5() {
        int x = 0;
        int y = 5;
        int z = 5;
        double expResult = 1.6;
        RazaoAurea instance = new RazaoAurea();
        double result = instance.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testRazaoAurea6() {
        int x = 0;
        int y = 10;
        int z = 15;
        double expResult = 1.618032786885246;
        RazaoAurea instance = new RazaoAurea();
        double result = instance.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testRazaoAurea7() {
        int x = 6;
        int y = 9;
        int z = 10;
        double expResult = 1.6180257510729614;
        RazaoAurea instance = new RazaoAurea();
        double result = instance.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testRazaoAurea8() {
        int x = 2;
        int y = 4;
        int z = 8;
        double expResult = 1.6181818181818182;
        RazaoAurea instance = new RazaoAurea();
        double result = instance.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testRazaoAurea9() {
        int x = 64;
        int y = 99;
        int z = 1;
        double expResult = 1.6464646464646464;
        RazaoAurea instance = new RazaoAurea();
        double result = instance.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
}
