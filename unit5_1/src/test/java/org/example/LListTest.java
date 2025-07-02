package org.example;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

import static org.testng.Assert.*;

public class LListTest {
    private LList list;

    @BeforeMethod
    public void setUp(){
        list = new LList();
    }

    @Test
    public void addTest(){
        list.add("A");
        list.add(123);
        list.add(45.67);
        list.add(true);
        list.add(new Object());

        assertEquals(list.get(0), "A");
        assertEquals(list.get(1), 123);
        assertEquals(list.get(2), 45.67);
        assertEquals(list.get(3), true);
        assertNotNull(list.get(4));

        list.add(1,"AB");

        assertEquals(list.get(0), "A");
        assertEquals(list.get(1), "AB");
        assertEquals(list.get(2), 123);

    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testAddAtIndexOutOfBounds() {
        list.add(-1, "A");
        list.add(1, "A");
    }


    @Test
    public void addFirstTest(){
        list.addFirst("A1");
        list.addFirst(2);
        assertEquals(list.get(1),"A1");
        assertEquals(list.get(0),2);
    }

    @Test
    public void removeTest(){
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.remove("B");

        assertEquals(list.get(0), "A");
        assertEquals(list.get(1), "C");

        list.remove(1);

        assertEquals(list.get(0), "A");
        assertEquals(list.get(1), "D");

        list.remove("C");
        assertEquals(list.size(), 2);
    }

    @Test(expectedExceptions = NoSuchElementException.class)
    public void testRemoveFromEmptyList() {
        list.remove("A");
        list.removeLast();
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testRemoveByIndexOutOfBounds() {
        list.remove(-1);
        list.add("A");
        list.remove(1);
    }


    @Test
    public void removeFirstTest(){
        list.add("A");
        list.add("B");
        list.removeFirst();

        assertEquals(list.get(0), "B");
    }

    @Test
    public void removeLastTest(){
        list.add("A");
        list.add("B");
        list.removeLast();

        assertEquals(list.get(0), "A");
    }

    @Test
    public void getTest(){
        list.add("A");
        list.add("B");
        list.add("C");
        assertEquals(list.get(0), "A");
        assertEquals(list.get(1), "B");
        assertEquals(list.get(2), "C");
    }


    @Test
    public void setTest(){
        list.add("A");
        list.add("B");
        list.set(1, "C");
        assertEquals(list.get(0), "A");
        assertEquals(list.get(1), "C");
    }

    @Test
    public void sizeTest(){
        assertEquals(list.size(), 0);
        list.add("A");
        assertEquals(list.size(), 1);
        list.add("B");
        assertEquals(list.size(), 2);
        list.removeFirst();
        assertEquals(list.size(), 1);
        list.clear();
        assertEquals(list.size(), 0);
    }

    @Test
    public void containsTest(){
        assertFalse(list.contains("A"));
        list.add("A");
        assertTrue(list.contains("A"));
    }

    @Test
    public void clearTest(){
        list.add("A");
        list.add("B");
        list.clear();
        assertEquals(list.size(), 0);
        assertFalse(list.contains("A"));
        assertFalse(list.contains("B"));
    }
}