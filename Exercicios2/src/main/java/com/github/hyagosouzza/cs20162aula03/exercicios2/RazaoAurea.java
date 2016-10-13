/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.hyagosouzza.cs20162aula03.exercicios2;
/**Classe para utilizar o método razaoAurea.
 * @author Hyago Vieira de Souza
 * @version 1.1
 */
public class RazaoAurea {
    /**Metodo para retornar a razão áurea.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param x final int
     * @param y final int
     * @param z final int
     * @return double - c/a
     */
    public final double razaoAurea(final int x, final int y, final int z) {
        int c = y;
        int a = x;
        int i = 1;
        while (i <= z) {
            int t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }
        return (double) c / a;
    }
}
