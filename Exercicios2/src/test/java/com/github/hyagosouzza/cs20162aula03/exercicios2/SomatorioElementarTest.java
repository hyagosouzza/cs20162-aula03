package com.github.hyagosouzza.cs20162aula03.exercicios2;
import org.junit.Test;
import static org.junit.Assert.*;
public class SomatorioElementarTest {
    @Test
    public void testSomaNaturais() {
        int n = 1;
        double expResult = 0.5;
        SomatorioElementar instance = new SomatorioElementar();
        double result = instance.somaNaturais(n);
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testSomaNaturais2() {
        int n = 2;
        double expResult = 0.7000000029802322;
        SomatorioElementar instance = new SomatorioElementar();
        double result = instance.somaNaturais(n);
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testSomaNaturais3() {
        int n = 3;
        double expResult = 0.7000000029802322;
        SomatorioElementar instance = new SomatorioElementar();
        double result = instance.somaNaturais(n);
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testSomaNaturais4() {
        int n = 9;
        double expResult = 0.7742081480100751;
        SomatorioElementar instance = new SomatorioElementar();
        double result = instance.somaNaturais(n);
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testSomaNaturais5() {
        int n = 10;
        double expResult = 0.7742081480100751;
        SomatorioElementar instance = new SomatorioElementar();
        double result = instance.somaNaturais(n);
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testSomaNaturais6() {
        int n = 21;
        double expResult = 0.7780991985928267;
        SomatorioElementar instance = new SomatorioElementar();
        double result = instance.somaNaturais(n);
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testSomaNaturais7() {
        int n = 100;
        double expResult = 0.77931888938474;
        SomatorioElementar instance = new SomatorioElementar();
        double result = instance.somaNaturais(n);
        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void testSomaNaturais8() {
        int n = 50;
        double expResult = 0.7790748083498329;
        SomatorioElementar instance = new SomatorioElementar();
        double result = instance.somaNaturais(n);
        assertEquals(expResult, result, 0.0);
    }
}
