package com.org.easysolution.linear;

public class LinkedStack<T> {

    private Node top = null;
    private int size;
    private int maxSize;

    public LinkedStack(int maxSize) {
        this.maxSize = maxSize;
    }

    public void push(T data){
        if (isFull()){
            throw new StackOverflowError("stack is full");
        }
        Node node = new Node(data);
        if (top != null) {
            node.next = top;
        }
        top = node;
        size++;
    }

    public T pop() throws IllegalAccessException {
        if(isEmpty()){
            throw new IllegalAccessException("the stack is empty");
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public T peek(int position) throws IllegalAccessException {
        if(isEmpty() || position >= size){
            throw new IllegalAccessException("stack is empty or out of bound");
        }
        Node node = top;
        while(position>0){
            node = node.next;
            position--;
        }
        return node.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    private final class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
