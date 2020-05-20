package com.org.easysolution.util;

import lombok.experimental.UtilityClass;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@UtilityClass
public class CommonUtil {

    private static final Logger LOG = Logger.getLogger(CommonUtil.class.getName());

    public static void swapIndexValue(int[] intArray, int index1, int index2) {
        int temp = intArray[index1];
        intArray[index1] = intArray[index2];
        intArray[index2] = temp;
    }

    public static void printElement(int[] elementsToSort) {
        LOG.log(Level.INFO, IntStream.of(elementsToSort)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", ")));
    }
}
