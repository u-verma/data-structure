package com.org.easysolution.sorting;

import static com.org.easysolution.util.CommonUtil.printElement;
import static com.org.easysolution.util.CommonUtil.swap;

public class BubbleSort {

    public int[] sort(int[] elementsToSort) {
        int size = elementsToSort.length;
        boolean isSwapped;
        for (int outerIndex = 0; outerIndex < size; outerIndex++) {
            isSwapped = false;
            for (int innerIndex = 0; innerIndex < size-1 - outerIndex; innerIndex++) {
                if (elementsToSort[innerIndex] > elementsToSort[innerIndex + 1]) {
                    swap(elementsToSort, innerIndex, innerIndex + 1);
                    isSwapped = true;
                }
            }
            printElement(elementsToSort);
            if (!isSwapped) {
                break;
            }
        }
        return elementsToSort;
    }
}
