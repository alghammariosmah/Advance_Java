/**
 * Created by Admin on 11/17/2016.
 */
public class StringList {
    private Node head = null;
    private String input;

    public void insert(String input){
        Node p = new Node(input);
        p.setNext(head);
        head = p;
    }

    public void insertAfter(String input){
        Node new_node = new Node(input);
        if (head == null)
        {
            head = new Node(input);
            return;
        }
        new_node.setNext(null);

        Node last = head;
        while (last.getNext() != null)
            last = last.getNext();

        last.setNext(new_node);
    }
    public Boolean search(String input){
        Node n = head;
        while(n!=null){
            if (n.getValue()== input)return true;
            n = n.getNext();
        }
        return false;
    }

    public void delete(String input){
        Node n = head;
        while(n!=null){
            if (n.getValue()== input) n.setValue(null);
            n = n.getNext();
        }
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        Node n = head;
        while(n!=null){
            if (n.getValue() != null){
                if (n!=head) sb.append(",");
                sb.append(n.getValue());
            }
            n = n.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

}
