package ArrayList;

/**
 * Interfaz Ipila
 * HT4
 * Javier Salazar 18764
 * Rodolfo Alonso 17470
 * Majo Castro 181202
 */

import Interfaces.iLista;

public abstract class FactoryList<E> implements iLista<E> {
	
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    public E removeLast() {
        return null;
    }


    public void addLast(E e) {

    }
}