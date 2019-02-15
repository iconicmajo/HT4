/**
 * Estructura de datos
 * Gerardo Mendez 18239
 * Ma. Jose Castro 181202
 * @author Majo!
 */
/**
 * @author Majo!
 *
 */

package Calculadora;

import Interfaces.iCalculadora;

public class Calculadora implements iCalculadora
{

    private static Calculadora cal;

    private Calculadora(){


    }

    /* (non-Javadoc)
     * @see iCalculadora#sumar(double, double)
     */

    public static Calculadora getCalculatorInstance(){
        if (cal==null){
            cal =new Calculadora();
        }
        return cal;
    }

    public double sumar(double n1, double n2){
        double resultado;
        resultado = n1 + n2;
        return resultado;
    }

    /* (non-Javadoc)
     * @see iCalculadora#restar(double, double)
     */
    public double restar(double n1, double n2){
        double resultado;
        resultado = n1 - n2;
        return resultado;
    }

    /* (non-Javadoc)
     * @see iCalculadora#multiplicar(double, double)
     */
    public double multiplicar(double n1, double n2){
        double resultado;
        resultado = n1 * n2;
        return resultado;
    }

    /* (non-Javadoc)
     * @see iCalculadora#dividir(double, double)
     */
    public double dividir(double n1, double n2){
        double resultado;
        resultado = n1 / n2;
        return resultado;
    }

}