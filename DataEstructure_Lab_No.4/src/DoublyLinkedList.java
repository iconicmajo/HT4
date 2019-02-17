/**
 * 
 */

/**
 * @author Majo!
 *
 */
public class DoublyLinkedList<E> implements iLista<E> {
	
	protected int count;
	protected DoublyLinkedNode<E> head;
	protected DoublyLinkedNode<E> tail;
	
	public DoublyLinkedList()
	// post: constructs an empty list
	{
	head = null;
	tail = null;
	count = 0;
	}
	
	public void addFirst(E value)
	// pre: value is not null
	// post: adds element to head of list
	{
	// construct a new element, making it head
	head = new DoublyLinkedNode<E>(value, head, null);
	// fix tail, if necessary
	if (tail == null) tail = head;
	count++;
	}
	
	public void addLast(E value)
	// pre: value is not null
	// post: adds new value to tail of list
	{
	// construct new element
	tail = new DoublyLinkedNode<E>(value, null, tail);
	// fix up head
	if (head == null) head = tail;
	count++;
	}
	
	public E removeLast()
	// pre: list is not empty
	// post: removes value from tail of list
	{
	Assert.pre(!isEmpty(),"List is not empty.");
	DoublyLinkedNode<E> temp = tail;
	tail = tail.previous();
	if (tail == null) {
	head = null;
	} else {
	tail.setNext(null);
	}
	count--;
	return temp.value();
	}
	public void addLast(E value)
	{
	// construct new element
	tail = new DoublyLinkedNode<E>(value, null, tail);
	count++;
	}
	public E removeLast()
	{
	Assert.pre(!isEmpty(),"List is not empty.");
	DoublyLinkedNode<E> temp = tail;
	tail = tail.previous();
	tail.setNext(null);
	count--;
	return temp.value();
	}
	public E remove(E value)
	// pre: value is not null. List can be empty
	// post: first element matching value is removed from list
	{
	DoublyLinkedNode<E> finger = head;
	while (finger != null &&
	!finger.value().equals(value))
	{
	finger = finger.next();
	}
	if (finger != null)
	{
	// fix next field of element above
	if (finger.previous() != null)
	{
	finger.previous().setNext(finger.next());
	} else {
	head = finger.next();
	}
	// fix previous field of element below
	if (finger.next() != null)
	{
	finger.next().setPrevious(finger.previous());
	} else {
		tail = finger.previous();
	}
	count--; // fewer elements
	return finger.value();
	}
	return null;
	}
	
	
	public int lastIndexOf(E value)
	// pre: value is not null
	// post: returns the (0-origin) index of value,
	// or -1 if value is not found
	{
		int i = size()-1;
		DoublyLinkedNode<E> finger = tail;
		// search for last matching value, result is desired index
		while (finger != null && !finger.value().equals(value))
	{
		finger = finger.previous();
		i--;
	}
	if (finger == null)
	{ // value not found, return indicator
	return -1;
	} else {
	// value found, return index
	return i;
	}
	}
	}
	
	
	
}
