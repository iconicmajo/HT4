/**
 * Estructura de datos
 * exTRAIDO DEL TRABAJO DE: 
 * Gerardo Mendez 18239
 * Ma. Jose Castro 181202
 * @author Majo!
 * @param <E> tipo de datos que la clase recibe como parametro 
 * 
 * 
 *  HT4
 * Javier Salazar 18764
 * Rodolfo Alonso 17470
 * Majo Castro 181202
 */



public interface iPila<E>
{

    public void push(E item);

    public E pop();

    public E peek();

    public boolean empty();

    public int size();

}