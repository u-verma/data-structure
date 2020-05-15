package com.org.easysolution.linear;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class LinkedList<T> {
    private Node head;
    private Node last;
    private int size;
    private int mode;

    public int getSize() {
        return size;
    }

    public void addLast(T data) {
        if (head == null) {
            head = new Node(data, last);
            last = head;
        } else {
            Node newNode = new Node(data, null);
            last.next = newNode;
            this.last = newNode;
        }
        size++;
    }

    public void addFirst(T data) {
        if (head == null) {
            head = new Node(data, null);
            last = head;
        } else {
            Node newNode = new Node(data, head);
            head = newNode;
        }
        size++;
    }
    
    /**
     * 1. Check if the LinkedList is null.
     * 2. if null then throws exception.
     * 3. if present the return the value.
     * 4. head will become the second Node of original List.
     */
    public void removeFirst() throws IllegalAccessException {
        if(head==null){
            throw new IllegalAccessException("No Element to remove from the list of size" +  size);
        }
        Node newFirst= head.getNext();
        head = newFirst;
        size--;
    }

    public T get(int index) {
        if (index < size) {
            Node node = head;
            Node next = head.next;
            for (int i = 0; i < index; i++) {
                if (i == index || index == 0) {
                    break;
                } else {
                    node = next;
                    next = node.next;
                }
            }
            return node.getData();
        } else {
            throw new ArrayIndexOutOfBoundsException("The Index is greater then size" + size);
        }
    }

    public Node getLastNode(Node node) {
        if (node.next == null) {
            return node;
        }
        return getLastNode(node.getNext());
    }

    @ToString
    private final class Node {
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }
}
