package com.ctc;

public class LinkedList {

    Node head;

    public void print() {
        Node node = head;
        System.out.println("*****");
        while (node != null) {
            System.out.println("  " + node.data + "  ");
            node = node.next;
        }
        System.out.println("*****");
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        Node last = head;
        if (last == null) {
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
    }
}

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
