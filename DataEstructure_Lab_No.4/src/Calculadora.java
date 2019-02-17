/**
 * Extraido del trabajo  HT2 de: 
 * Estructura de datos
 * Gerardo Mendez 18239
 * Ma. Jose Castro 181202
 * @author Majo!
 */

/**
 * Interfaz Ipila
 * HT4
 * Javier Salazar 18764
 * Rodolfo Alonso 17470
 * Majo Castro 181202
 */

/**
 * @author Majo!
 *
 */





public class Calculadora implements iCalculadora
{

    private static Calculadora cal;

    private Calculadora(){


    }

    /* (non-Javadoc)
     * @see Esta es la implementación singleton donde unicamente se instancia una vez, de lo contrario muestra
     * un mensaje donde indica que ya hay uno existente
     */

    public static Calculadora getCalculatorInstance(){
        if (cal==null){
            cal =new Calculadora();
        }
        else {
        	System.out.println("No se puede crear el objeto calculadora, porque ya hay uno existente");
        }
        return cal;
    }

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
    /* (non-Javadoc)
     * @see 
     * Esto evita que en algun momento sea clonada la instancia 
     */
    public Calculadora clone() {
    	try {
    		trow new CloeNotSupportedException();
    		
    	}
    	catch (cloneNotSupportedException ex) {
    		System.out.println("No se puede clonar un objeto calculadora");
    	}
    	retunr null;
    }

}