/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.hyagosouzza.cs20162aula03.exercicios2;
/**Classe para utilizar o método acharPi.
 * @author Hyago Vieira de Souza
 * @version 1.1
 */
public class ValorPi {
    /**Metodo para retornar o valor de PI.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param n final int
     * @return double - p - PI
     */
    public final double acharPi(final int n) {
        final int quatro = 4;
        float i = 1;
        float s = -1;
        float d = -1;
        double p = 0;
        while (i <= n) {
            d = d + 2;
            s = -1 * s;
            p = p + quatro * s / d;
            i = i + 1;
        }
        return p;
    }
}
