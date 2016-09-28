package com.github.hyagosouzza.cs20162aula03;

import com.github.hyagosouzza.cs20162aula03.RestoDivInt;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestoDivIntTest {

    @Test
    public void testMod() {
        int a = 1;
        int b = 1;
        int expResult = 0;
        int result = RestoDivInt.mod(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMod2() {
        int a = 35;
        int b = 7;
        int expResult = 0;
        int result = RestoDivInt.mod(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMod3() {
        int a = 9;
        int b = 6;
        int expResult = 3;
        int result = RestoDivInt.mod(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMod4() {
        int a = 64;
        int b = 5;
        int expResult = 4;
        int result = RestoDivInt.mod(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMod5() {
        int a = 4;
        int b = 3;
        int expResult = 1;
        int result = RestoDivInt.mod(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMod6() {
        int a = 10;
        int b = 9;
        int expResult = 1;
        int result = RestoDivInt.mod(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMod7() {
        int a = 5;
        int b = 2;
        int expResult = 1;
        int result = RestoDivInt.mod(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMod8() {
        int a = 2;
        int b = 5;
        int expResult = 2;
        int result = RestoDivInt.mod(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMod9() {
        int a = 1;
        int b = 1;
        int expResult = 0;
        int result = RestoDivInt.mod(a, b);
        assertEquals(expResult, result);
    }

}
