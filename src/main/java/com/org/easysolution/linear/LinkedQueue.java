package com.org.easysolution.linear;

public class LinkedQueue<T> {

    private Node front, last = null;
    private final int MAX_SIZE;
    private int size;

    public LinkedQueue(int size) {
        this.MAX_SIZE = size;
    }

    public void enqueue(T data) {
        Node node = new Node(data);
        if (isFull()) {
            System.out.println("The queue is full");
            return;
        } else if (isEmpty()) {
            front = node;
            last = node;
            size++;
        } else {
            last.next = node;
            last = node;
            size++;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return null;
        } else {
            T data = front.data;
            front = front.next;
            size--;
            return data;
        }
    }

    public boolean isFull() {
        return size >= MAX_SIZE;
    }

    public boolean isEmpty() {
        return front == null;
    }

    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
