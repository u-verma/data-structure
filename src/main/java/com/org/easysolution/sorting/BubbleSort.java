package com.org.easysolution.sorting;

import static com.org.easysolution.util.CommonUtil.printElement;
import static com.org.easysolution.util.CommonUtil.swap;

public class BubbleSort {

    public int[] sort(int[] elementsToSort) {
        int length = elementsToSort.length;
        boolean isSwapped;
        for (int outerIndex = 0; outerIndex < length; outerIndex++) {
            isSwapped = false;
            for (int innerIndex = 0; innerIndex < length-1 - outerIndex; innerIndex++) {
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
