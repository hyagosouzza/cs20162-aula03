/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula03.exercicios2;

/**
 * Classe para utilizar o método somaNaturais.
 * @version 1.1
 */
public class SomatorioElementar {

    /**
     * Metodo para retornar a somatória envolvendo números naturais.
     * @param n final int
     * @return double - s - soma
     */
    public final double somaNaturais(final int n) {
        float i = 1;
        double s = 0;
        float d;
        while (i <= n) {
            d = 1 + i * i;
            s = s + 1 / d;
            i = i + i;
        }
        return s;
    }
}
