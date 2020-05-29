package com.org.easysolution.sorting;


import static com.org.easysolution.util.CommonUtil.printElement;

public class HeapSort {

    public static void main(String[] args) {

        int[] elements = new int[]{15, 1, 4, 6, 9, 30, 3, 5, 0, 7, 8};

        HeapSort obj = new HeapSort();

        for (int index = (elements.length / 2) - 1; index >= 0; index--) {
            obj.heapify(index, elements, elements.length);
        }

        for (int index = elements.length - 1; index >= 0; index--) {
            obj.swap(elements, index, 0);
            obj.heapify(0, elements, index);
        }

        printElement(elements);

    }

    private void heapify(int rootIndex, int[] elements, int size) {

        int largestIndex = rootIndex;
        int leftChildIndex = (rootIndex * 2) + 1;
        int rightChildIndex = (rootIndex * 2) + 2;


        if (leftChildIndex < size && elements[leftChildIndex] > elements[largestIndex]) {
            largestIndex = leftChildIndex;
        }

        if (rightChildIndex < size && elements[rightChildIndex] > elements[largestIndex]) {
            largestIndex = rightChildIndex;
        }

        if (largestIndex != rootIndex) {
            swap(elements, rootIndex, largestIndex);
            if (!isLeafNode(largestIndex, size)) {
                heapify(largestIndex, elements, size);
            }
        }
    }

    private void swap(int[] elements, int index1, int index2) {
        int temp = elements[index1];
        elements[index1] = elements[index2];
        elements[index2] = temp;
    }

    private boolean isLeafNode(int index, int size) {
        return index > size / 2 - 1;
    }
}
