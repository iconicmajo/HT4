// UVG Algoritmos y estructuras de datos
// MainHDT4.java
// Autores: Luis Quezada 18028 & Esteban del Valle 18221
// Fecha: 15 de febrero 2019

import Calculadora.Calculadora;
import Factory.FactoryImplements;
import Factory.FactoryStack;

import java.util.*;
import java.io.*;


public class Main {

    public static void main(String args[]) {

        // Variables
        Calculadora calculator = new Calculadora();
        Boolean continue1 = false;
        Boolean continue2= false;
        String operacion = "";
        FactoryImplements<String> factory = new FactoryImplements<String>();
        FactoryStack<String> pila = null;
        Scanner scan = new Scanner(System.in);
        String URL = scan.nextLine();
        char operador;
        double a = 0, b = 0;
        String resultado = "";


        if (!URL.equals("0")){
            try {
                File file = new File(URL);
                Scanner sc = new Scanner(file);

                while (sc.hasNextLine()) {
                    operacion += sc.next();
                }
                System.out.println("Los datos han sido leidos: " + operacion); //Shows the content in the file
                continue1 = true;

            } catch (Exception e) {
                System.out.println("No se encontró el archivo.");
            }
        }else {
            System.out.println("Gracias por utilizar nuestra calculadora");
        }


            String menu2 = "\n\n\tMenu Stacks: \n" +
                    "\t1. ArrayList\n " +
                    "\t2. Vector \n " +
                    "\t3. List";

            String menu3 = "\n\n\tMenu : \n" +
                    "\t1. Simplemente Encadenada\n " +
                    "\t2. Doblemente Encadenada \n " +
                    "\t3. Circular";


            System.out.println(menu1);

            System.out.println("\n>>> Ingrese el numero de opcion del tipo de stack que desea usar: ");

            if (continue1) {
                try {
                    System.out.println(menu2);
                    String opcion = scan.nextLine();
                    switch (Integer.parseInt(opcion)){
                        case 1:
                            pila = factory.Determinar("Array List");
                            continue1 = true;
                            break;

                        case 2:
                        pila = factory.Determinar("Vector");
                        continue2 = true;
                        break;

                        case 3:
                        System.out.println(menu3);
                        String opcion2 = scan.nextLine();

                        switch (Integer.parseInt(opcion2)){
                            case 1:
                            pila = new ListaEncadenada<String>("Lista Simplemente Encadenada");
                            break;

                            case 2:
                            pila = new DoublyLinkedList<String>("Lista Doblemente Encadenada");
                            break;

                            case 3:
                            pila = new ListaCircular<String>("Lista Circular");
                            break;

                            default:
                                System.out.println("Ingrese una opcion correcta");
                        }

                        break;
                        default:
                            System.out.println("Ingrese una opcion correcta");
                    }



                } catch (Exception e) {
                    System.out.println("Ingrese un numero valido");
                }
            }

            if(continue2){
                try{
                    for (int i = 0; i < URL.length() ; i++) {
                        if(URL.charAt(i) != ' '){
                            operador = URL.charAt(i);
                            if(Character.isDigit(operador)){
                                pila.push(String.valueOf(operador));
                            }else{

                                //En el .pop podemos eliminar datos
                                b = Double.parseDouble(pila.pop());
                                a = Double.parseDouble(pila.pop());
                                switch (operador){

                                    //Imprimimos los resultados de las operaciones
                                    case '+' :  resultado = String.valueOf(calculator.sumar(a, b)); pila.push(resultado); break;
                                    case '-' :  resultado = String.valueOf(calculator.restar(a, b));pila.push(resultado); break;
                                    case '*' :  resultado  = String.valueOf(calculator.multiplicar(a, b)); pila.push(resultado); break;
                                    case '/' :  resultado = String.valueOf(calculator.dividir(a, b)); pila.push(resultado); break;
                                }
                            }
                        }
                    }
                    System.out.println(resultado);

                }catch (Exception e){
                    e.printStackTrace();
                }
                }
            }
        }

        }
    }