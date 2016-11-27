package Item;

/**
 * Creates a List of items.
 * 
 * @author Osamah Al-Ghammari
 *
 */
public class ItemList implements ItemCollection {
	private Node head;

	public ItemList() {
		this.head = null;
	}

	public void add(Item person) {
		Node p = new Node();
		Node temp = head;
		
		p.setValue(person);
		if (head == null) {
			head = p;
			return;
		}
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(p);
	}

	public boolean remove(Item person) {
		Node temp = head;
		Node prev = null;
		if (head == null) {
			throw new IllegalStateException("Can not delete from an empty list");
		} else if (head.getValue().equals(person)) { 								
			head = head.getNext();
			return true;
		} 
		else { // Search for other occurrences
			temp = head.getNext();
			prev = head;
			// doing through all list elements 
			while (temp != null && temp.compareTo(person) == false) { 
				prev = temp;
				temp = temp.getNext();
			}
			if (temp != null && temp.getValue().equals(person)) {
				prev.setNext(temp.getNext());
				
				return true;
			} else {
				return false;
			}
		}
	}
	
	@Override
	public boolean contains(Item person){
        Node n = head;
        while(n!=null){
        	if (n.getValue()== person)return true;
            n = n.getNext();
        }
        return false;
    }
	
	public boolean isEmpty() {
		Node n = head;
		if (head == null)return true;
		return false;
	}
	
	public boolean isFull() {
		Node n = head;
		if (head == null)return false;
		return true;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		Node n = head;
		while (n != null) {
			sb.append(n.getValue());
			if (n.getNext() != null)
				sb.append(",");
			n = n.getNext();
		}
		sb.append("]");
		return sb.toString();
	}



}
