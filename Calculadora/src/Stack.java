/**
 * @author Gerardo
 * Hoja 2
 * Majo Castro 181202
 * Gerardo Mendez 18239
 * 1/02/2019
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Stack 
{

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException 
    {   
        iPila<String> pila = new Pila<>();
        iCalculadora calculadora = new Calculadora();
        ArrayList<String> array = new ArrayList<>();
        
        Scanner read = new Scanner(new File("doc.txt"));
        read.useDelimiter(" ");
        String data;
        
        while(read.hasNext())
        {
            data = read.next();
            array.add(data);
        }
        
        for(int i = 0; i < array.size(); i++)
        {
            pila.push(array.get(array.size()-i-1));
        }
        
        try
        {
            while(!pila.empty())
            {
                double a, b;
                double c = 0;
                String d, e;
                a = Double.parseDouble(pila.pop());
                b = Double.parseDouble(pila.pop());
                d = pila.pop();
                
                if(d.equals("+"))
                {
                    c = calculadora.sumar(a, b);
                }
            
                else if(d.equals("-"))
                {
                    c = calculadora.restar(a, b);
                }
                
                else if(d.equals("*"))
                {
                    c = calculadora.multiplicar(a, b);
                }
                
                else if(d.equals("/"))
                {
                    c = calculadora.dividir(a, b);
                }
                
                else
                {
                    throw new IllegalArgumentException();
                }
            
                e = String.valueOf(c);
            
                if(pila.size() > 0)
                {
                    pila.push(e);
                }
                
                if(pila.size() == 0)
                {
                    System.out.println("");
                    System.out.println("El resultado final de las operaciones del archivo de texto es: " + e);
                    System.out.println("");
                }
            }
        }
        catch(NumberFormatException e){
            System.out.println("");
            System.out.println("Hay dos simbolos juntos o dos numeros juntos (ademas de los primeros dos) en el archivo de texto ingresado");
            System.out.println("Por favor corregir para que el programa pueda realizar los calculos deseados");
            System.out.println("");
            //System.out.println("El archivo de texto que se utilizo no cumple con las condiciones");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("");
            System.out.println("El archivo de texto utilizado para el programa no termina en un simbolo de operacion");
            System.out.println("Por favor corregir para que el programa pueda realizar los calculos deseados");
            System.out.println("");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("");
            System.out.println("El archivo de texto incluye simbolos que no corresponden a operaciones matematicas");
            System.out.println("Por favor corregir para que el programa pueda realizar los calculos deseados");
            System.out.println("");
        }
    }
}