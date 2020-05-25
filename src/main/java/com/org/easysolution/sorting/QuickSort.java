package com.org.easysolution.sorting;

import static com.org.easysolution.util.CommonUtil.printElement;
import static com.org.easysolution.util.CommonUtil.swapIndexValue;

public class QuickSort {

    public static void main(String[] args) {

        int[] unsorted = {6, 3, 7, 2, 10, 4, 5, 0, 12, 6, 1, 8, 9, 3, 11};

        new QuickSort().quickSort(unsorted, 0, unsorted.length - 1);

    }

    public int partition(int[] elementsToSort, int lowerBoundIndex, int upperBoundIndex) {
        int pivot = elementsToSort[lowerBoundIndex];
        int lastSwapIndex = lowerBoundIndex;

        for (int currentIndex = lowerBoundIndex + 1; currentIndex <= upperBoundIndex; currentIndex++) {
            if (elementsToSort[currentIndex] < pivot) {
                lastSwapIndex++;
                swapIndexValue(elementsToSort, currentIndex, lastSwapIndex);
            }
        }
        swapIndexValue(elementsToSort, lastSwapIndex, lowerBoundIndex);
        printElement(elementsToSort);
        return lastSwapIndex;
    }

    private void quickSort(int[] elementsToSort, int lowerBoundIndex, int upperBoundIndex) {
        if (upperBoundIndex <= lowerBoundIndex) {
            return;
        }
        int pivotIndex = partition(elementsToSort, lowerBoundIndex, upperBoundIndex);
        quickSort(elementsToSort, lowerBoundIndex, pivotIndex - 1);
        quickSort(elementsToSort, pivotIndex + 1, upperBoundIndex);
    }
}
