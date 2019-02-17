/**
 * Factory List
 * HT4
 * Javier Salazar 18764
 * Rodolfo Alonso 17470
 * Majo Castro 181202
 */

public class ListFactory<E> {
    public iLista<E> SetType(String type){

        if (type.equals("SL")) {
            return new ListaEncadenada<E>();
        }else if(type.equals("CL")){
        	return new ListaCircular<E>();
        }else if(type.equals("DL")){
        	return new DoublyLinkedList<E>();
        }
        return null;
    }
}
