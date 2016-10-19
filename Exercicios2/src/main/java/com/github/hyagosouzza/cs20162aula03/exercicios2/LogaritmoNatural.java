/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula03.exercicios2;

/**
 * Classe para utilizar o método logNat.
 * @version 1.1
 */
public class LogaritmoNatural {
    
    /**
     * Metodo para retornar o fatorial de n.
     * @param n final int
     * @return float - f - fatorial
     */
    public final float fatorial(final float n) {
        float i = 2;
        float f = 1;
        while (i <= n) {
            f = f * i;
            i = i + 1;
        }
        return f;
    }
    
    /**
     * Metodo para retornar o resultado de "n" elevado a "m".
     * @param n final int
     * @param m final int
     * @return float - resultado
     */
    public final float potencia(final float n, final float m) {
        int contador = 0;
        float resultado = 1;
        while (contador < m) {
            resultado = resultado * n;
            contador = contador + 1;
        }
        return resultado;
    }
    
    /**
     * Metodo para retornar o resultado do logaritmo natural.
     * @param a final int
     * @param b final int
     * @return float - e - resultado
     */
    public final float logNat(final float a, final float b) {
        int i = 2;
        float e = a + 1;
        float f;
        float p;
        while (i <= b) {
            p = potencia(a, b);
            f = fatorial(i);
            e = e + p / f;
            i = i + 1;
        }
        return e;
    }
}
