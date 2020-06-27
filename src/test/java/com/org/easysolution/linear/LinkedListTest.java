package com.org.easysolution.linear;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LinkedListTest {

    private LinkedList<Integer> underTest;

    @BeforeEach
    void setUp() {
        underTest = new LinkedList<Integer>();
        underTest.addLast(4);
        underTest.addLast(7);
        underTest.addLast(8);
        underTest.addLast(9);
        underTest.addLast(9);
        underTest.addLast(9);
        underTest.addLast(10);
        underTest.addLast(13);
        underTest.addLast(17);
        underTest.addLast(17);
    }

    @Test
    void shouldGetElementInOrderFromLinkedList() throws IllegalAccessException {
        assertAllElementInList(0);
    }

    @Test
    void shouldThrowExceptionIfIndexIsGreaterThanSize() {
        assertThrows(IllegalAccessException.class, () -> underTest.get(10));
    }

    @Test
    void shouldAddElementAtFirstPosition() throws IllegalAccessException {
        underTest.addFirst(2);
        assertThat(underTest.get(0)).isEqualTo(2);
        assertAllElementInList(1);
        assertThat(underTest.getSize()).isEqualTo(11);
        assertThrows(IllegalAccessException.class, () -> underTest.get(11));
    }

    @Test
    void shouldRemoveFirstPositionElementFromList() throws IllegalAccessException {
        underTest.removeFirst();
        assertThat(underTest.get(0)).isEqualTo(7);
        assertThat(underTest.getSize()).isEqualTo(9);
        assertThrows(IllegalAccessException.class, () -> underTest.get(9));
    }

    @Test
    void shouldThrowExceptionIfTryToRemoveFromEmptyList() {
        underTest = new LinkedList();
        assertThrows(IllegalAccessException.class, () -> underTest.removeFirst());
    }

    @Test
    void shouldAddElementAtLastPosition() throws IllegalAccessException {
        underTest.addLast(20);
        assertThat(underTest.get(10)).isEqualTo(20);
        assertAllElementInList(0);
        assertThat(underTest.getSize()).isEqualTo(11);
        assertThrows(IllegalAccessException.class, () -> underTest.get(11));
    }

    @Test
    void shouldGetKthElementFromTheLastPosition() throws IllegalAccessException {
        Integer data = underTest.getkthNodeFromTailPosition(7);
        assertThat(data).isEqualTo(8);
    }

    private void assertAllElementInList(int initialIndex) throws IllegalAccessException {
        assertThat(underTest.get(initialIndex)).isEqualTo(4);
        assertThat(underTest.get(++initialIndex)).isEqualTo(7);
        assertThat(underTest.get(++initialIndex)).isEqualTo(8);
        assertThat(underTest.get(++initialIndex)).isEqualTo(9);
        assertThat(underTest.get(++initialIndex)).isEqualTo(9);
        assertThat(underTest.get(++initialIndex)).isEqualTo(9);
        assertThat(underTest.get(++initialIndex)).isEqualTo(10);
        assertThat(underTest.get(++initialIndex)).isEqualTo(13);
        assertThat(underTest.get(++initialIndex)).isEqualTo(17);
        assertThat(underTest.get(++initialIndex)).isEqualTo(17);
    }
}