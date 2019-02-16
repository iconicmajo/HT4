import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
public class Principal {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
         iPila<String> pila = new Pila<>();
         iCalculadora calculadora = new Calculadora();
         iLista<String> lista = new Lista<>();
         ArrayList<String> array = new ArrayList<>();

        Scanner read = new Scanner(new File("doc.txt"));
        read.useDelimiter(" ");
        String data;
        // TODO Auto-generated method stub
        int opArray = 0;
        int opLista = 0;
        System.out.println("******BIENVENIDO**********");
        System.out.println("Que desea hacer?");
        System.out.println("1. Implementar como ArrayList");
        System.out.println("2. Implementar como Vector");
        System.out.println("3. Implementar como Lista");
        int op = read.nextInt();
        read.nextLine();
        while (op !=4) {
            if (op == 1) {
                System.out.println("Como desea implementarlo?");
                System.out.println("1. Circular");
                System.out.println("2. Encadenada");
                System.out.println("3. Doblemente encadenada");
                opArray = read.nextInt();
                read.nextLine();
            }
            if (op == 2) {
                //De una se cambia al vector de la HT2
                System.out.println("Implements vector");
                //calculadora.

            }
            if(op == 3) {
                System.out.println("Como desea implementarlo?");
                System.out.println("1. Circular");
                System.out.println("2. Encadenada");
                System.out.println("3. Doblemente encadenada");
                opLista = read.nextInt();
                read.nextLine();
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

}