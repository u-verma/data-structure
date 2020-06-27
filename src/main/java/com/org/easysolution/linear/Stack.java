package com.org.easysolution.linear;

import org.omg.CORBA.Object;

public class Stack<T extends Object> {

    private T data;
    private int size;
    private int top = -1;
    private T[] dataArray;

    public Stack(int size) {
        this.size = size;
        dataArray = (T[]) new Object[size];
    }

    public void push(T data){
        if(isFull()){
            throw new StackOverflowError("Stack is full");
        }
        top++;
        dataArray[top] = data;
    }

    public T pop() throws IllegalAccessException {
        T value = getValue();
        top--;
        return value;
    }

    public T peek(T data) throws IllegalAccessException {
        T value = getValue();
        return value;
    }

    public boolean isFull(){
        return top == size-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    private T getValue() throws IllegalAccessException {
        if (isEmpty()) {
            throw new IllegalAccessException("Stack is full");
        }
        return dataArray[top];
    }
}
