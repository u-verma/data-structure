package com.org.easysolution.lineardatastructure;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class LinkedList<T> {
    private Node head;
    private Node last;
    private int size;
    private int mode;

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

    public T get(int index) {
        Node node = head;
        Node next = head.next;
        if (index < size) {
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
