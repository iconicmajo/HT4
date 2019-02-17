/**
 * Interfaz Ipila
 * HT4
 * Javier Salazar 18764
 * Rodolfo Alonso 17470
 * Majo Castro 181202
 */



import java.util.Vector;

public class PilaVector<E> extends FactoryStack<E>{
    Vector<E> d;

    @Override
    public void push(E item) {
        d.add(item);

    }

    @Override
    public E pop() {
        return d.remove(size()-1);
    }

    @Override
    public E peek() {
        E peek;
        peek = d.get(size()-1);
        return peek;    }

    @Override
    public int size() {
        return d.size();    }
}
