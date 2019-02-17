/**
 * Nodo de la lista doblemente encandenada
 * Javier Salazar 18764
 * Rodolfo Alonso 17470
 * Majo Castro 181202
 */

/**
 * @author Majo!
 *
 */
public class DoublyLinkedNode<E> {
	
	protected E data;
	protected DoublyLinkedNode<E> nextElement;
	protected DoublyLinkedNode<E> previousElement;
	
	
	public DoublyLinkedNode(E v, DoublyLinkedNode<E> next, DoublyLinkedNode<E> previous){
		data = v;
		nextElement = next;
		
		if (nextElement != null) 
			nextElement.previousElement = this;
		
		previousElement = previous;

		if (previousElement != null) 
			previousElement.nextElement = this;
		
		}
	
		public DoublyLinkedNode(E v)
		// post: constructs a single element
		{
		this(v,null,null);
		}
	}

