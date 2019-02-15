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
/**
 * @author Majo!
 *
 */
public class Calculadora implements iCalculadora 
{
    
    /* (non-Javadoc)
     * @see iCalculadora#sumar(double, double)
     */
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

