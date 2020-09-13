package com.ctc;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        Node head = new Node(1);
        linkedList.head = head;
        Node second = new Node(2);
        Node third = new Node(3);
        linkedList.head.next = second;
        second.next = third;
        // print linked list after creating it
        linkedList.print();

        // print linked list after adding another node
        Node fourth = new Node(4);
        third.next = fourth;
        linkedList.print();

        // add a new head node
        linkedList.addFirst(0);
        linkedList.print();

        // add a node at end
        linkedList.addLast(5);
        linkedList.print();
    }
}
