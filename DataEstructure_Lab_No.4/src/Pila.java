
/**
 * @uthor Majo!
 * Extraido de HT2 de:
 * Estructura de datos
 * Gerardo Mendez 18239
 * Ma. Jose Castro 181202
 */

/**
 * Pila
 * HT4
 * Javier Salazar 18764
 * Rodolfo Alonso 17470
 * Majo Castro 181202
 */


import java.util.Vector;



public class Pila<E> implements iPila<E>
{

    private Vector<E> vector;

    /**
     *
     */
    public Pila() {
        this.vector = new Vector<E>();
    }

    /* (non-Javadoc)
     * @see iPila#push(java.lang.Object)
     */
    @Override
    public void push(E item)
    {
        vector.add(item);
    }

    /* (non-Javadoc)
     * @see iPila#pop()
     */
    @Override
    public E pop()
    {
        E res;
        res = vector.remove(size()-1);
        return res;
    }

    /* (non-Javadoc)
     * @see iPila#peek()
     */
    @Override
    public E peek()
    {
        E peek;
        peek = vector.get(size()-1);
        return peek;
    }

    /* (non-Javadoc)
     * @see iPila#empty()
     */
    @Override
    public boolean empty()
    {
        return vector.isEmpty();
    }

    /* (non-Javadoc)
     * @see iPila#size()
     */
    @Override
    public int size()
    {
        int size;
        size = vector.size();
        return size;
    }

}