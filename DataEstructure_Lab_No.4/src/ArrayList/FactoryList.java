package ArrayList;


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