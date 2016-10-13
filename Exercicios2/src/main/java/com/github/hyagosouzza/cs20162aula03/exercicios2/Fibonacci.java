/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.hyagosouzza.cs20162aula03.exercicios2;
/**Classe para utilizar o método fibo.
 * @author Hyago Vieira de Souza
 * @version 1.1
 */
public class Fibonacci {
    /**Metodo para obtenção do n-ésimo número de Fibonacci.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param n final int
     * @return int - c
     */
    public final int fibo(final int n) {
        int a = 0;
        int c = 1;
        if (n == 0 || n == 1) {
            return n;
        } else {
            int i = 2;
            while (i <= n) {
                int t = c;
                c = c + a;
                a = t;
                i = i + 1;
            }
            return c;
        }
    }
}
