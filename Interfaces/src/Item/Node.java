package Item;

public class Node {
	/**
	 * Empty constructor
	 */
	public Node(){
		this(null,null);
	}
	
	public Node(Item value){
		this.value = value;
		this.next = null;
	}
	/**
	 * Constructor to initialize node and value.
	 * @param value value of type String
	 * @param node Node to hold reference of next node.
	 */
	public Node(Item value, Node node){
		this.value=value;
		this.next=node;
	}
	/**
	 * 
	 * @return value of type String
	 */
	public Item getValue() {
		return value;
	}
	/**
	 * Sets the passed string to value.
	 * @param value 
	 */
	public void setValue(Item value) {
		this.value = value;
	}
	/**
	 * 
	 * @return Reference of the next node
	 */
	public Node getNext() {
		return next;
	}
	/**
	 * 
	 * @param node Reference of the next node.
	 */
	public void setNext(Node node) {
		this.next = node;
	}
	
	public boolean compareTo(Item value2){
		return this.value== value2;
	}
	
	/**
	 * Value of type String to hold the value
	 */
	private Item value;
	/**
	 * Node to hold the reference of next object.
	 */
	public Node next;
	
}