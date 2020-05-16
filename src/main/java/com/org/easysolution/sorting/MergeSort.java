package com.org.easysolution.sorting;

import static com.org.easysolution.util.CommonUtil.printElement;

public class MergeSort {

    public static void main(String[] args) {
        int[] elementsToSort = {11, 6, 7, 2, 10, 4, 5, 0, 12, 1, 8, 9, 3};
        new MergeSort().mergeSort(elementsToSort);
    }

    public int[] mergeSort(int[] elementsToSort) {
        int[] temp = new int[elementsToSort.length];
        sort(elementsToSort, 0, elementsToSort.length - 1, temp);
        return elementsToSort;
    }

    private void sort(int[] elementsToSort, int leftStartIndex, int rightEndIndex, int[] temp) {
        if (rightEndIndex <= leftStartIndex) {
            return;
        }
        int middleIndex = (leftStartIndex + rightEndIndex) / 2;
        sort(elementsToSort, leftStartIndex, middleIndex, temp);
        sort(elementsToSort, middleIndex + 1, rightEndIndex, temp);
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
