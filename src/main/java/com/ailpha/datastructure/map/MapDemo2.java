package com.ailpha.datastructure.map;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("key1", 1);
        map.put("key2", 2);

        for (Integer value : map.values()) {
            // ...
        }

        Set<String> keySet = map.keySet();

        for (String key : keySet) {
            Integer value = map.get(key);
        }

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
        }
    }

}
