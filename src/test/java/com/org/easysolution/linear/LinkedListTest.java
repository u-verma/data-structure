package com.org.easysolution.linear;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LinkedListTest {

    private LinkedList underTest;

    @BeforeEach
    void setUp() {
        underTest = new LinkedList<String>();
        underTest.addLast("TestName1");
        underTest.addLast("TestName2");
        underTest.addLast("TestName3");
    }

    @Test
    void shouldAddElementInOrderToLinkedList() {
        assertThat(underTest.get(0)).isEqualTo("TestName1");
        assertThat(underTest.get(1)).isEqualTo("TestName2");
        assertThat(underTest.get(2)).isEqualTo("TestName3");
    }

    @Test
    void shouldThrowExceptionIfIndexIsGreaterThanSize() {
        assertThrows(RuntimeException.class, () -> underTest.get(3));
    }

    @Test
    void shouldAddElementAtFirstPosition() {
        underTest.addFirst("FirstData");
        assertThat(underTest.get(0)).isEqualTo("FirstData");
        assertThat(underTest.get(1)).isEqualTo("TestName1");
        assertThat(underTest.get(2)).isEqualTo("TestName2");
        assertThat(underTest.get(3)).isEqualTo("TestName3");
        assertThrows(RuntimeException.class, () -> underTest.get(4));
    }

    @Test
    void shouldRemoveFirstPositionElementFromList() throws IllegalAccessException {
        underTest.removeFirst();
        assertThat(underTest.get(0)).isEqualTo("TestName2");
        assertThat(underTest.get(1)).isEqualTo("TestName3");
        assertThat(underTest.getSize()).isEqualTo(2);
        assertThrows(RuntimeException.class, () -> underTest.get(3));
    }

    @Test
    void shouldThrowExceptionIfTryToRemoveFromEmptyList()  {
        underTest = new LinkedList();
        assertThrows(IllegalAccessException.class, () -> underTest.removeFirst());
    }
}