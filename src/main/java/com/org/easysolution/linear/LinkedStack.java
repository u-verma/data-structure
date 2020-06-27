package com.org.easysolution.linear;

public class LinkedStack<T> {

    private Node top = null;
    private int size;
    private int maxSize = 20;

    public LinkedStack(int maxSize) {
        this.maxSize = size;
    }

    public void push(T data){
        if (isFull()){
            throw new StackOverflowError("stack is full");
        }
        Node node = new Node(data);
        if(top == null){
           top = node;
        }else{
            node.next = top;
            top = node;
        }
        size++;
    }

    public T pop() throws IllegalAccessException {
        if(isEmpty()){
            throw new IllegalAccessException("the stack is empty");
        }
        T data = top.data;
        top = top.next;
        return data;
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
