/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.hyagosouzza.cs20162aula03.exercicios2;
/**Classe para utilizar o método raizQuadrada.
 * @author Hyago Vieira de Souza
 * @version 1.1
 */
public class RaizQuad {
    /**Metodo para retornar a raiz quadrada.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param n final int
     * @param i final int
     * @return double - r
     */
    public final double raizQuadrada(final int n, final int i) {
        double r = 1;
        int ii = 1;
        while (0 <= ii) {
            r = (r + n / r) / 2;
            ii = ii - 1;
        }
        return r;
    }
}
