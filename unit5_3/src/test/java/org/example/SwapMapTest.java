package org.example;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;


public class SwapMapTest {

    @Test
    public void testSwapMap() {
        SwapMap<Integer,String> map = new SwapMap<>();
        Map<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "one");
        originalMap.put(2, "two");

        Map<String, Integer> swappedMap = map.swapMap(originalMap);

        assertEquals(swappedMap.get("one"), 1);
        assertEquals(swappedMap.get("two"), 2);
    }
}