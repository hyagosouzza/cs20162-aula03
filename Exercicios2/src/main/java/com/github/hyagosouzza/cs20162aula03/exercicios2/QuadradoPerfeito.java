/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula03.exercicios2;

/**
 * Classe para utilizar o método quadPer.
 * @version 1.1
 */
public class QuadradoPerfeito {
    
    /**
     * Metodo para retornar se o número é um quadrado perfeito.
     * @param n final int
     * @return boolean - true
     */
     public final boolean quadPer(final int n) {
         int i = 1;
         int q = 1;
         while (q < n) {
             i = i + 2;
             q = q + i;
         }
         return q == n;
     }
}
