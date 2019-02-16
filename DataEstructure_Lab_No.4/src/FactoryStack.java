/**
 * FactoryStack
 * HT4
 * Javier Salazar 18764
 * Rodolfo Alonzo 17470
 * Majo Castro 181202
 */

/**
 * @author Majo!
 * @author Javier!
 *
 */





import Interfaces.iPila;

abstract public class FactoryStack<E> implements iPila<E> {

    @Override
    public boolean empty(){
        return size() == 0;
    }



}
