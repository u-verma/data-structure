package com.org.easysolution.linear;

import org.omg.CORBA.Object;

public class Stack<T extends Object> {

    private int size;
    private int top = -1;
    private T[] dataArray;

    public Stack(int size) {
        this.size = size;
        dataArray = (T[]) new Object[size];
    }

    public void push(T data) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        top++;
        dataArray[top] = data;
    }

    public T pop() throws IllegalAccessException {
        if (isEmpty()) {
            throw new IllegalAccessException("Stack is full");
        }
        T value = dataArray[top];
        top--;
        return value;
    }

    public T peek(int position) throws IllegalAccessException {
        if (isEmpty() || position >= size) {
            throw new IllegalAccessException("The position is greater than size");
        }
        return dataArray[top - position];
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}


