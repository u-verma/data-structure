package com.org.easysolution.linear;

import org.omg.CORBA.Object;

public class Queue<T> {
    private int size;
    private int frontPointer = -1;
    private int rarePointer = -1;
    private T[] dataArray;

    public Queue(int size) {
        this.size = size;
        dataArray = (T[]) new Object[size];
    }

    public void enqueue(T data) throws IllegalAccessException {
        if (isFull()) {
            throw new IllegalAccessException("queue is full");
        } else {
            rarePointer++;
            dataArray[rarePointer] = data;
        }
    }

    public T dequeue() throws IllegalAccessException {
        T value;
        if (isEmpty()) {
            throw new IllegalAccessException("Queue is empty");
        } else {
            frontPointer++;
            value = dataArray[frontPointer];
        }
        return value;
    }

    public boolean isEmpty() {
        return frontPointer == rarePointer;
    }

    public boolean isFull() {
        return rarePointer == size - 1;
    }
}
