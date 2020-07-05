package com.org.easysolution.sorting;

import static com.org.easysolution.util.CommonUtil.printElement;
import static com.org.easysolution.util.CommonUtil.swap;

public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(new int[]{6, 11, 7, 2, 4, 10, 12, 0, 5, 1, 8, 9, 3});
        insertionSort.sortVersion2(new int[]{6, 11, 7, 2, 4, 10, 12, 0, 5, 1, 8, 9, 3});
    }

    public int[] sort(int[] elementsToSort) {
        int length = elementsToSort.length;
        for (int forwardIndex = 0; forwardIndex < length - 1; forwardIndex++) {
            for (int sortedIndex = forwardIndex + 1; sortedIndex > 0; sortedIndex--) {
                if (elementsToSort[sortedIndex] < elementsToSort[sortedIndex - 1]) {
                    swap(elementsToSort, sortedIndex, sortedIndex - 1);
                } else {
                    break;
                }
            }
            printElement(elementsToSort);
        }
        return elementsToSort;
    }

    public int[] sortVersion2(int[] elementsToSort) {
        int length = elementsToSort.length;
        for (int forwardIndex = 0; forwardIndex < length - 1; forwardIndex++) {
            int sortedIndex = forwardIndex + 1;
            while (sortedIndex > 0 && elementsToSort[sortedIndex] < elementsToSort[sortedIndex - 1]) {
                swap(elementsToSort, sortedIndex, sortedIndex - 1);
                sortedIndex--;
            }
            printElement(elementsToSort);
        }

        return elementsToSort;
    }
}
