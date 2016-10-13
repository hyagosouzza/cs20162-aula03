/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.hyagosouzza.cs20162aula03.exercicios2;
/**Classe para utilizar o método mod.
 * @author Hyago Vieira de Souza
 * @version 1.1
 */
public class RestoDivInt {
    /**Metodo para retornar o resto da divisão a/b.
     * @author Hyago Vieira de Souza
     * @since Relase 01 da aplicação
     * @param a final int
     * @param b final int
     * @return int - s
     */
    public final int mod(final int a, final int b) {
        int s = a;
        while (b <= s) {
            s = s - b;
        }
        return s;
    }
}
