package com.github.hyagosouzza.cs20162aula03;

import com.github.hyagosouzza.cs20162aula03.ValorPi;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValorPiTest {

    @Test
    public void testAcharPi() {
        int n = 1;
        double expResult = 4.0;
        double result = ValorPi.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAcharPi2() {
        int n = 2;
        double expResult = 2.666666626930237;
        double result = ValorPi.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAcharPi3() {
        int n = 3;
        double expResult = 3.4666666388511658;
        double result = ValorPi.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAcharPi4() {
        int n = 5;
        double expResult = 3.33968248963356;
        double result = ValorPi.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAcharPi5() {
        int n = 10;
        double expResult = 3.0418395549058914;
        double result = ValorPi.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAcharPi6() {
        int n = 50;
        double expResult = 3.121594585478306;
        double result = ValorPi.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAcharPi7() {
        int n = 25;
        double expResult = 3.1815766245126724;
        double result = ValorPi.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAcharPi8() {
        int n = 99;
        double expResult = 3.151693342253566;
        double result = ValorPi.acharPi(n);
        assertEquals(expResult, result, 0.0);
    }

}
