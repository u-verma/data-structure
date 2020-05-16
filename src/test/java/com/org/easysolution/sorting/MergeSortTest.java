package com.org.easysolution.sorting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortTest {

    private MergeSort underTest = new MergeSort();
    private int[] unsorted = {11, 6, 7, 2, 10, 4, 5, 0, 12, 1, 8, 9, 3};
    private int[] sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    @Test
    void shouldSortAnIntegerArray() {
        int[] result = underTest.mergeSort(unsorted);
        assertThat(result).isEqualTo(sorted);
    }

    @Test
    void shouldSortSingleElementArray() {
        int[] result = underTest.mergeSort(new int[]{4});
        assertThat(result).isEqualTo(new int[]{4});
    }

    @Test
    void shouldReturnNULLListForNUll() {
        int[] result = underTest.mergeSort(null);
        assertThat(result).isNull();
    }

    @Test
    void shouldReturnEmptyListForEmptyArray() {
        int[] result = underTest.mergeSort(new int[0]);
        assertThat(result).isNotNull();
        assertThat(result).isEmpty();
    }

}