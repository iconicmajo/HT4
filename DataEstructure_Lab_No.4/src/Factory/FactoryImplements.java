package Factory;

import ArrayList.StackArrayList;
import Factory.FactoryStack;
import Stack.PilaVector;

public class FactoryImplements<E> {

    public FactoryStack<E> Determinar(String type) {
        PilaVector v = new PilaVector();


        if (type.equals("Vector")) {
            return new PilaVector<E>();
        }

        else if (type.equals("ArrayList")) {
            return new StackArrayList<E>();
        }


        return null;
    }
}