//import javax.xml.soap.Node;

public class linkedlist {
    Node first;

    public linkedlist() {
        first = null;
    }
    public static void main(String args[]) {
        linkedlist list = new linkedlist();
        list.addLast(new Node("A",null));
        list.addLast(new Node("B",null));
        list.addLast(new Node("C",null));
        list.addLast(new Node("D",null));
        list.addLast(new Node("E",null));
    }


    public void addLast(Node newNode){

    }
    public Node removeFirst() {
        return null;
    }
    public int size() {
        return 0;
    }
    public boolean isEmpty() {
        return size() == 0;
    }
}
