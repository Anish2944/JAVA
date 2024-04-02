public class LinkList {
    public class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
     public static int size;

    public void addHead(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    public void add(int index, int data){
        Node newNode = new Node(data);
        if (index == 0) {
            addHead(data);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    public void print(){
        if (head == null) {
            System.out.println("null");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
     public int removeHead(){
        if (size == 0) {
            System.out.println("link list is empty");
            return -1;
        }
        else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
     }
     public int removeLast(){
         if (size == 0) {
             System.out.println("link list is empty");
            return -1;
        }
        else if (size == 1) {
            int value = tail.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = tail.data;
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
        return value;
     }
     public void deleteNode(int key) {
        if (head == null) {
            return;
        }
        if (head.data == key) {
            head = head.next;
            size--;
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            if (currNode.data == key) {
                prevNode.next = currNode.next;
                size--;
                return;
            }
            prevNode = currNode;
            currNode = currNode.next;
        }
    }
    
     public void search(int key){
        Node tempNode = head;
        int i = 1;
        while (tempNode != null) {
            if (tempNode.data == key) {
                System.out.println("Found at Location " + i);
                return;
            }
            tempNode = tempNode.next;
            i++;
        }
        System.out.println("Not Found");
     }
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.addHead(2);
        linkList.addHead(1);
        linkList.addLast(4);
        linkList.addLast(5);
        linkList.add(2, 3);
        linkList.print();
        // linkList.removeHead();
        // linkList.print();
        // linkList.removeLast();
        // linkList.print();
        // linkList.search(4);
        linkList.deleteNode(3);
        linkList.print();
        System.out.println(linkList.size);
    }
}
