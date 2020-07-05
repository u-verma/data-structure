package com.org.easysolution.sorting;

import static com.org.easysolution.util.CommonUtil.printElement;

public class SortPractice {

    public static void main(String[] args) {
        int[] elements = new int[]{15, 1, 4, 6, 9, 30, 3, 5, 0, 7, 8};
        SortPractice obj = new SortPractice();
        obj.heapSort(elements);
    }

    private void heapSort(int[] elements) {

        int size = elements.length - 1;
        for (int rootIndex = (size / 2) - 1; rootIndex >= 0; rootIndex--) {
            heapify(elements, rootIndex, size);
        }
        printElement(elements);

        while (size >= 0) {
            swap(elements, 0, size);
            heapify(elements, 0, --size);
        }
        printElement(elements);
    }


    private void heapify(int[] elements, int rootIndex, int size) {

        int largestValueIndex = rootIndex;
        int leftIndex = (2 * rootIndex) + 1;
        int rightIndex = (2 * rootIndex) + 2;


        if (leftIndex < size && elements[leftIndex] > elements[largestValueIndex]) {
            largestValueIndex = leftIndex;
        }

        if (rightIndex < size && elements[rightIndex] > elements[largestValueIndex]) {
            largestValueIndex = rightIndex;
        }

        if (largestValueIndex < size && largestValueIndex != rootIndex) {
            swap(elements, rootIndex, largestValueIndex);
            heapify(elements, largestValueIndex, size);
        }

    }

    private void swap(int[] elements, int index1, int index2) {
        int temp = elements[index1];
        elements[index1] = elements[index2];
        elements[index2] = temp;
    }
}
