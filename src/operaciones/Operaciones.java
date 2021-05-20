/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 * @version codigo 1
 * @author Borja
 */
public class Operaciones {

    /**
     * El metodo sumar par tiene dos enteros como parametros de entradas y los
     * suma después comprueba que el resto sea 0 al dividirlo entre dos y si es
     * par le suma 1 al resultado si no solo devuelve el resultado
     *
     * @param a integer
     * @param b integer
     * @return devuelve la suma de ambos enteros
     */
    public int sumarPar(int a, int b) {
        int resultado = a + b;
        if (resultado % 2 == 0) {
            return resultado;
        } else {
            return resultado + 1;
        }
    }

    public int mayor(int a, int b) {
        /**
         *El metodo mayor recibe dos enteros y los comprueba en un if, devolviendo el que sea mayor
         * @param a integer
         * @param b integer
         * @return devuelve el entero mayor
         */
        if (a > b) { //if else para b
            return a;
        } else if (b == a) {
            return a;
        } else {
            return b;
        }
    }

    public int sumarVector(int[] numeros) {
        /**
         * el metodo sumar vector recibe un array de enteros que luego suma.
         *
         * @param a integer
         * @param b integer
         * @return devuelve la suma de los indices
         */
        int sum = 0;
        //poner una i en vez del 0
        for (int i = 0; i < numeros.length; i++) {
            sum += numeros[i];
        }
        return sum;
    }

}
