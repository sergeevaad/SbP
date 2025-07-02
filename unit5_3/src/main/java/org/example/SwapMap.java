package org.example;

import java.util.HashMap;
import java.util.Map;

public class SwapMap<K,V> {
    public Map<V,K> swapMap(Map<K,V> map){
        if (map==null){
            return null;
        }
        Map<V,K> res = new HashMap<>();
        for (Map.Entry<K,V> pairs: map.entrySet()){
            res.put(pairs.getValue(),pairs.getKey());
        }

        return res;
    }
}
