package com.org.easysolution.sorting;

import static com.org.easysolution.util.CommonUtil.printElement;
import static com.org.easysolution.util.CommonUtil.swapIndexValue;

public class InsertionSort {

    public static void main(String[] args) {
        new InsertionSort().sort(new int[]{6, 11, 7, 2, 4, 10, 12, 0, 5, 1, 8, 9, 3});
    }

    public int[] sort(int[] elementsToSort) {
        int length = elementsToSort.length;
        for (int forwardIndex = 0; forwardIndex < length-1; forwardIndex++) {
            for (int sortedIndex = forwardIndex + 1; sortedIndex > 0; sortedIndex--) {
                if (elementsToSort[sortedIndex] < elementsToSort[sortedIndex-1]) {
                    swapIndexValue(elementsToSort, sortedIndex, sortedIndex-1);
                }else {
                    break;
                }
            }
            printElement(elementsToSort);
        }
        return elementsToSort;
    }
}
