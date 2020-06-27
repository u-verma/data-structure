package com.org.easysolution.linear;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class LinkedList<T> {
    private Node head;
    private Node last;
    private int size;

    public int getSize() {
        return size;
    }

    public void addLast(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            last = head;
        } else {
            last.next = newNode;
            this.last = newNode;
        }
        size++;
    }

    public void addFirst(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = new Node(data);
            last = head;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    /**
     * 1. Check if the LinkedList is null.
     * 2. if null then throws exception.
     * 3. if present the return the value.
     * 4. head will become the second Node of original List.
     *
     * @return the removed head value
     */
    public T removeFirst() throws IllegalAccessException {
        if (head == null) {
            throw new IllegalAccessException("No Elements present to remove from the list of size" + size);
        }
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public T get(int index) throws IllegalAccessException {
        if (index < size) {
            Node node = head;
            if (index == 0) {
                return head.data;
            } else if (index == size - 1) {
                return last.data;
            } else {
                while (index != 0) {
                    node = node.next;
                    index--;
                }
            }
            return node.data;
        } else {
            throw new IllegalAccessException("The Index is greater then size" + size);
        }
    }

    public T getkthNodeFromTailPosition(int positionFromTail) throws IllegalAccessException {

        if (head == null || positionFromTail > size - 1) {
            throw new IllegalAccessException("Invalid index from tail" + size);
        }
        Node current = head;
        Node result = head;
        int currentIndex = 0;
        int resultIndex = 0;

        while (currentIndex - resultIndex < positionFromTail) {
            current = current.next;
            currentIndex++;
        }

        while (current.next != null) {
            current = current.next;
            result = result.next;
        }
        return result.data;
    }

    @ToString
    @EqualsAndHashCode
    private final class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
