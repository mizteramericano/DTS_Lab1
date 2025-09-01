package javaapplication1;

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "-" + age;
    }
}

class Node {

    Person data;
    Node next;
    Node prev;

    Node(Person p) {
        data = p;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node n) {
        next = n;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node n) {
        prev = n;
    }

    public String toString() {
        return data.toString();
    }

}

class LinkedList {

    private Node head;
    private Node tail;
    int count;

    public void addFirst(Node n) {
        if (head == null) {
            tail = n;
        }
        n.setNext(head);
        head = n;
        count++;
    }

    public void addLast(Node n) {
        if (head == null) {
            head = n;
        }
        tail.setNext(n);
        n.setPrev(tail);
        tail = n;
        count++;
    }

    public void deleteFirst() {
        if (head != null) { // list empty
            head = head.getNext();
            if (head != null) {
                head.setPrev(null);
            } else {
                tail = null;
            }
            count--;
        }
    }

    public void deleteLast() {
        if (head == null) {}
        if (head == tail) {
            head = null;
            tail = null;
            count--;
        }
        tail = tail.getPrev();
        tail.setNext(null);
        count--;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp + ",");
            temp = temp.getNext();
        }
        System.out.println("");
    }
}

public class JavaApplication1 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // add data 4
        list.addFirst(new Node(new Person("A", 20)));
        list.addFirst(new Node(new Person("B", 21)));
        list.addFirst(new Node(new Person("C", 22)));
        list.addFirst(new Node(new Person("D", 23)));

        list.addLast(new Node(new Person("E", 24)));
        list.print(); // D-23,C-22,B-21,A-20,E-24,

        list.deleteFirst();
        list.print(); // C-22,B-21,A-20,E-24,

        list.deleteLast();
        list.print(); // C-22,B-21,A-20,

    }

}
