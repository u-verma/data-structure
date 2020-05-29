package com.org.easysolution.sorting;


import static com.org.easysolution.util.CommonUtil.printElement;
import static com.org.easysolution.util.CommonUtil.swap;

public class HeapSort {

    public static void main(String[] args) {
        int[] elements = new int[]{15, 1, 4, 6, 9, 30, 3, 5, 0, 7, 8};
        HeapSort obj = new HeapSort();
        obj.heapSort(elements);
    }

    private int[] heapSort(int[] elements) {

        int size = elements.length;
        for (int index = (size / 2) - 1; index >= 0; index--) {
            heapify(index, elements, size);
        }

        int lastIndex = size - 1;

        while (lastIndex >= 0) {
            swap(elements, lastIndex, 0);
            lastIndex--;
            heapify(0, elements, lastIndex);
        }

        printElement(elements);
        return elements;
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

    private boolean isLeafNode(int index, int size) {
        return index > size / 2 - 1;
    }
}
