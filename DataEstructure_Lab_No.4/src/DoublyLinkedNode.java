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
/**
 * @author Majo!
 *
 * @param <E>
 */
public class DoublyLinkedNode<E> {
	
	protected E data;
	protected DoublyLinkedNode<E> nextElement;
	protected DoublyLinkedNode<E> previousElement;
	
	
	/**
	 * @param v
	 * @param next
	 * @param previous
	 */
	public DoublyLinkedNode(E v, 
				DoublyLinkedNode<E> next, DoublyLinkedNode<E> previous){
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

		public E value() {
			// TODO Auto-generated method stub
			return null;
		}

		public DoublyLinkedNode<E> previous() {
			// TODO Auto-generated method stub
			return null;
		}

		public void  setNext(DoublyLinkedNode<E> next) {
			// TODO Auto-generated method stub
			nextElement = next;
		}

		public DoublyLinkedNode<E> next() {
			// TODO Auto-generated method stub
			return nextElement;
		}

		public void setPrevious(DoublyLinkedNode<E> previous) {
			// TODO Auto-generated method stub
			previousElement = previous;
			
		}
	}

