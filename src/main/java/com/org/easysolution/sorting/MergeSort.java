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

    private void mergeSort(int[] elementsToSort, int leftStartIndex, int rightEndIndex, int[] temp) {
        if (rightEndIndex <= leftStartIndex) {
            return;
        }
        int middleIndex = (leftStartIndex + rightEndIndex) / 2;
        mergeSort(elementsToSort, leftStartIndex, middleIndex, temp);
        mergeSort(elementsToSort, middleIndex + 1, rightEndIndex, temp);
        merge(elementsToSort, leftStartIndex, rightEndIndex, middleIndex, temp);
    }


    private int[] merge(int[] elementToSort, int lowerBoundIndex, int upperBoundIndex, int middleIndex, int[] temp) {
        int count = lowerBoundIndex;
        int rightStartIndex = middleIndex + 1;
        int leftStartIndex = lowerBoundIndex;

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
