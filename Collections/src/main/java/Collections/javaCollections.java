/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author hiramtodd
 */
public class javaCollections {
    public static void main(String[] args) {
        // List collection
        /*
        Also occasionally called a sequence, this is an ordered list that can
        contain duplicate elements and allows control over where the elements
        can be insserted and can be accessed using integer indexing.
        */
        System.out.println("\n List Collection Example");
        System.out.println("\n List of favorite destinations: ");
        List<String> funList = new ArrayList<>();
        funList.add("Disneyland");
        funList.add("Laguna Beach");
        funList.add("Chiang Mai");
        funList.add("New York City");
        funList.add("Tokyo");
        System.out.println(funList);
        
        // Map Collection
        /*
        Map is an object that maps keys to values. One key, one value. 
        There is no duplicating.        
        */
        System.out.println("\n Map Collection Example: ");
        System.out.println("\n Names with Nicknames: ");
        Map<String, String> mapNickNames = new LinkedHashMap<>();
        mapNickNames.put("Peter", "Preisthood");
        mapNickNames.put("Michael", "Mickey");
        mapNickNames.put("Francis", "Egghead");
        mapNickNames.put("Oliver", "Olie");
        mapNickNames.put("Julian", "Julie");
        mapNickNames.put("Stewart", "Stu");
        mapNickNames.put("Logan", "Rogain");
        System.out.println(mapNickNames);
        
        // Tree Collection
        /*
        */
        System.out.println("\n Tree Collection Example");
        System.out.println("\n ");
    }
}
