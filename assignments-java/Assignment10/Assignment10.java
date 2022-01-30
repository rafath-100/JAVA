package Assignment10;

class Node {
    String data;
    Node next;
    Node(String data, Node next){
        this.data=data;
        this.next=next;
    }
    Node(String data){
        this(data, null);
    }
    public String toString() {
        if (data == null)
            return "null";
        return data;
    }
}

//SList consists of only 2 methods
class SList {
    Node head = new Node(null);
    public SListIterator iterateList() {
        return new SListIterator(head);
    }
    public String toString() {
        if(head==null) {
            return "list is empty: ";
        }
        SListIterator iterator = this.iterateList();
        StringBuilder s=new StringBuilder();
        while (iterator.hasNext()) {
            s.append(iterator.next() + (iterator.hasNext() ? ", " : ""));
        }
        return ""+s;
    }
}

//SListIterator class which is not implementing ListIterator
class SListIterator {
    Node temp;
    SListIterator(Node node){
        this.temp = node;
    }
    public Node next() {
        temp = temp.next;
        return temp;
    }
    public boolean hasNext() {
        return temp.next!=null;
    }
    public void insertNode(String data) {
        temp.next = new Node(data, temp.next);
        temp = temp.next;
    }
    public void removeNode() {
        if(temp.next != null) {
            temp.next = temp.next.next;
        }
    }
}

//Main class
class Assignment10 {

    public static void main(String[] args) {
        SList obj1 = new SList();
        SListIterator obj2 = obj1.iterateList();
        System.out.print(obj1);
        obj2.insertNode("99");
        obj2.insertNode("9");
        System.out.println(obj1);
        SListIterator obj3 = obj1.iterateList();
        obj3.removeNode();
        System.out.println(obj1);

    }

}
