package Item;
/**
 * Creates a List of strings.
 * 
 * @author Osamah Al-Ghammari
 *
 */
public class StringList {
    private Node head;
	/**
	 * An setup constructor 
	 */
	public StringList() {
		this.head = null;
	}
    /**
	 * Inserts passed value to the beginning of the String list
	 * 
	 * @param s input to be inserted.
	 *            
	 */
    public void insert(String input){
        if (input == null)input = "";
        Node p = new Node();
        Node temp = head;
        
        p.setValue(input);
        if(head == null){
        	head = p;
        	return;
        }
        if (temp == head){ // insert in the beginning of the list
        	p.setNext(head);
        	head = p;
        }
    }
    /**
	 * Deletes the passed string value
	 * 
	 * @param s String value         
	 * @return true if the string found else false.
	 */
	public boolean delete(String value) {
		Node temp = head;
		Node prev = null;
		if (head == null) {
			throw new IllegalStateException("Can not delete from an empty list");
		} else if (head.getValue().equals(value)) { // deleting the first occurrence
			head = head.getNext();
			return true;
		} else { // Search for other occurrences
			temp = head.getNext();
			prev = head;
			while (temp != null && temp.getValue().compareTo(value) < 0) { // doing through all list elements
				prev = temp;
				temp = temp.getNext();
			}
			if (temp != null && temp.getValue().equals(value)) {
				prev.setNext(temp.getNext());
				return true;
			} else {
				return false;
			}
		}
	}

	/**
	 * This method will search for the passed string, will return true if found
	 * else false.
	 * 
	 * @param input String value to be searched.
	 *            
	 * @return returns true if passed string found else false.
	 */
    public Boolean search(String input){
        Node n = head;
        while(n!=null && n.getValue().compareToIgnoreCase(input) <= 0){
        	if (n.getValue().equalsIgnoreCase(input))return true;
        	if (n.getValue()== input)return true;
            n = n.getNext();
        }
        return false;
    }
    
	public int getSize() {
		Node n = head;
		int count = 0;
		if (head == null)return 0;
		while (n != null) {
			count+=1;
			n = n.getNext();
		}
		return count;
	}
	
	/**
	 * This function returns the number of string occurrences in a list
	 * 
	 * @param value
	 * @return returns the number of occurrences 
	 */
    public int getOccurences(String value){
    	Node n = head;
    	int count = 0;
    	while (n != null){
    		if(n.getValue() == value) count++;
    		n = n.getNext();
    	}
    	return count;
    }

	/**
	 * 
	 * @return Returns the size of the list.
	 */
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        Node n = head;
        while(n!=null){
        	sb.append(n.getValue());
            if (n.getNext() != null)sb.append(",");
            n = n.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

}
