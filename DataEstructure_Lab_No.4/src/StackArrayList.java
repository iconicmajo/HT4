


import java.util.ArrayList;



public class StackArrayList<E> extends FactoryStack<E> {
    ArrayList<E> d;

    public StackArrayList(){
        d = new ArrayList<E>();

    }

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
        return d.get(size());

    }

    @Override
    public int size() {
        return d.size();

    }
}
