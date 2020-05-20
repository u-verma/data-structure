package com.org.easysolution.sorting;

import static com.org.easysolution.util.CommonUtil.printElement;

public class MergeSort {

    public int[] sort(int[] elementsToSort) {
        if (null == elementsToSort || elementsToSort.length == 0 || elementsToSort.length == 1) {
            return elementsToSort;
        }
        int[] temp = new int[elementsToSort.length];
        mergeSort(elementsToSort, 0, elementsToSort.length - 1, temp);
        return elementsToSort;
    }

    private void mergeSort(int[] elementsToSort, int lowerBoundIndex, int upperBoundIndex, int[] temp) {
        if (upperBoundIndex <= lowerBoundIndex) {
            return;
        }
        int middleIndex = (lowerBoundIndex + upperBoundIndex) / 2;
        mergeSort(elementsToSort, lowerBoundIndex, middleIndex, temp);
        mergeSort(elementsToSort, middleIndex + 1, upperBoundIndex, temp);
        merge(elementsToSort, lowerBoundIndex, upperBoundIndex, middleIndex, temp);
    }


    private int[] merge(int[] elementToSort, int lowerBoundIndex, int upperBoundIndex, int middleIndex, int[] temp) {
        int leftStartIndex = lowerBoundIndex;
        int rightStartIndex = middleIndex + 1;
        int count = lowerBoundIndex;

        while (leftStartIndex <= middleIndex && rightStartIndex <= upperBoundIndex) {

            if (elementToSort[leftStartIndex] < elementToSort[rightStartIndex]) {
                temp[count] = elementToSort[leftStartIndex];
                leftStartIndex++;
            } else {
                temp[count] = elementToSort[rightStartIndex];
                rightStartIndex++;
            }
            count++;
        }

        while (leftStartIndex <= middleIndex) {
            temp[count] = elementToSort[leftStartIndex];
            count++;
            leftStartIndex++;
        }

        while (rightStartIndex <= upperBoundIndex) {
            temp[count] = elementToSort[rightStartIndex];
            count++;
            rightStartIndex++;
        }

        while (lowerBoundIndex <= upperBoundIndex) {
            elementToSort[lowerBoundIndex] = temp[lowerBoundIndex];
            lowerBoundIndex++;
        }
        printElement(elementToSort);
        return elementToSort;
    }
}
