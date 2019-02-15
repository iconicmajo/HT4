/**
 * Estructura de datos
 * Gerardo Mendez 18239
 * Ma. Jose Castro 181202
 * @author Majo!
 * @param <E> tipo de datos que la clase recibe como parametro 
 */
package Interfaces;


public interface iPila<E>
{

    public void push(E item);

    public E pop();

    public E peek();

    public boolean empty();

    public int size();

}