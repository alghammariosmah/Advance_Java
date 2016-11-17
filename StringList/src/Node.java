class Node{
    public Node(){
        this(null,null);
    }

    public Node (String value){
        this(value,null);
    }
    public Node(String value, Node next){
        this.value = value;
        this.next = next;
    }

    public Node getNext(){
        return next;
    }
    public void setNext(Node next){
        this.next = next;
    }

    public void setValue(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }

    private String value;
    private Node next;
}