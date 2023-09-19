package com.example.javalearn.LRU;

public class Node {
    int curSize;

    int maxSize;

    String value;

    Node next ;

    Node pre ;
    ;

    public Node(int maxSize, String value) {
        Node head = new Node("0");
        Node tail = new Node("0");
        this.value = value;
        this.maxSize = maxSize;
        this.pre = head;
        this.next = tail;
        head.next = this;
        tail.pre = this;
        curSize = 1;
    }

    public Node(String value) {
        this.value = value;
    }
    private void add(Node node){

    }
}
