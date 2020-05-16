package com.org.easysolution.sorting;

import java.util.logging.Logger;

import static com.org.easysolution.util.CommonUtil.printElement;

public class MergeSort {

    private static final Logger LOG = Logger.getLogger(MergeSort.class.getName());

    public static void main(String[] args) {
        int[] elementsToSort = {11, 6, 7, 2, 10, 4, 5, 0, 12, 1, 8, 9, 3};
        int[] temp = new int[elementsToSort.length];
        new MergeSort().sort(elementsToSort, 0, elementsToSort.length - 1, temp);

    }

    public void sort(int[] elementsToSort, int lowerBound, int upperBound, int[] temp) {
        if (upperBound <= lowerBound) {
            return;
        }
        int middleIndex = (lowerBound + upperBound) / 2;
        sort(elementsToSort, lowerBound, middleIndex, temp);
        sort(elementsToSort, middleIndex + 1, upperBound, temp);
        merge(elementsToSort, lowerBound, upperBound, middleIndex, temp);
    }


    private int[] merge(int[] elementToSort, int lowerBound, int upperBound, int middleIndex, int[] temp) {
        int count = lowerBound;
        int rightArrayStartIndex = middleIndex + 1;
        int leftArrayStartIndex = lowerBound;

        while (leftArrayStartIndex <= middleIndex && rightArrayStartIndex <= upperBound) {

            if (elementToSort[leftArrayStartIndex] < elementToSort[rightArrayStartIndex]) {
                temp[count] = elementToSort[leftArrayStartIndex];
                leftArrayStartIndex++;
            } else {
                temp[count] = elementToSort[rightArrayStartIndex];
                rightArrayStartIndex++;
            }
            count++;
        }

        while (leftArrayStartIndex <= middleIndex) {
            temp[count] = elementToSort[leftArrayStartIndex];
            count++;
            leftArrayStartIndex++;

        }
        while (rightArrayStartIndex <= upperBound) {
            temp[count] = elementToSort[rightArrayStartIndex];
            count++;
            rightArrayStartIndex++;
        }

        while (lowerBound <= upperBound) {
            elementToSort[lowerBound] = temp[lowerBound];
            lowerBound++;
        }

        printElement(elementToSort);
        return elementToSort;
    }
}
