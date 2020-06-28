package com.org.easysolution.linear;


public class CircularQueue<T> {
    private int size;
    private int frontPointer, rarePointer = 0;
    private T[] dataArray;

    public CircularQueue(int size) {
        this.size = size;
        dataArray = (T[]) new Object[size];
    }

    public void enqueue(T data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rarePointer = (rarePointer + 1) % size;
        dataArray[rarePointer] = data;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        frontPointer = (frontPointer + 1) % size;
        return dataArray[frontPointer];
    }

    public void displayQueue() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int index = frontPointer + 1;

        //Print all the elements starting from front till rarePointer -1;
        System.out.println("Elements in Circular Queue are: ");
        while (index % size != rarePointer) {
            System.out.print(dataArray[index % size] + ", ");
            index++;
        }
        // handle the last condition separately to print the element at rarePointer
        System.out.print(dataArray[index % size] + "\n");
    }

    public boolean isEmpty() {
        return rarePointer == frontPointer;
    }

    public boolean isFull() {
        return ((rarePointer + 1) % size) == (frontPointer % size);
    }

    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue<Integer>(6);

        // Inserting elements in Circular Queue
        queue.enqueue(14);
        queue.enqueue(22);
        queue.enqueue(13);
        queue.enqueue(-6);

        // Display elements present in Circular Queue
        queue.displayQueue();

        // Deleting elements from Circular Queue
        System.out.println("Deleted value: " + queue.dequeue());
        System.out.println("Deleted value: " + queue.dequeue());

        queue.displayQueue();

        queue.enqueue(9);
        queue.enqueue(20);
        queue.enqueue(5);

        queue.displayQueue();

        queue.enqueue(20);
    }
}
