/**
*  Name: Abdulmujeeb Lawal
*/
package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

/**
 * class that contains a method to find the number of common key-value pairs in two hashmaps
 */
public class MapUtilities {

    /**
     * This method takes in two HashMaps and returns the number of key-value pairs that they both share
     *
     * @param map1  first HashMap
     * @param map2  second HashMap
     * @return  number of common pairs
     */
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        // returns 0 of both are empty 
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int commonCount = 0;
        for (String key : map1.keySet()) {
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                commonCount++;
            }
        }

        return commonCount;
    }
}
