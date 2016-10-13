/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.hyagosouzza.cs20162aula03.exercicios2;
/**Classe para utilizar o método fatorial.
 * @author Hyago Vieira de Souza
 * @version 1.1
 */
public class Fatorial {
    /**Metodo para retornar o fatorial de n.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param n final int
     * @return int - f - fatorial
     */
    public final int fatorial(final int n) {
        int i = 2;
        int f = 1;
        while (i <= n) {
            f = f * i;
            i = i + 1;
        }
        return f;
    }
}
