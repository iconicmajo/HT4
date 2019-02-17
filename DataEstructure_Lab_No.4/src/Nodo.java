/**
 * Interfaz Ipila
 * HT4
 * Javier Salazar 18764
 * Rodolfo Alonso 17470
 * Majo Castro 181202
 */

/**
 * @author Majo!
 *
 */
public class Nodo<E> {
	    
	protected E data; // value stored in this element
   protected Nodo<E> nextElement; // ref to next

   public Nodo(E v, Nodo<E> next)
   // pre: v is a value, next is a reference to 
   //      remainder of list
   // post: an element is constructed as the new 
   //      head of list
   {
       data = v;
       nextElement = next;
   }

   public Nodo(E v)
   // post: constructs a new tail of a list with value v
   {
      this(v,null);
   }

   public Nodo<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }

   public void setNext(Nodo<E> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }

   public E value()
   // post: returns value associated with this element
   {
      return data;
   }

   public void setValue(E value)
   // post: sets value associated with this element
   {
      data = value;
   }
}

