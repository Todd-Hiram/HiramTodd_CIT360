/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author hiramtodd
 */
public class javaCollections {
    public static void main(String[] args) {
        // List collection
        /*******************************************************************
         * Also occasionally called a sequence, this is an ordered list that can
         * contain duplicate elements and allows control over where the elements
         * can be inserted and can be accessed using integer indexing. 
         *******************************************************************/
        System.out.println("List Collection Example");
        System.out.println("List of favorite destinations: ");
        List<String> funList = new ArrayList<>();
        funList.add("Disneyland");
        funList.add("\n Laguna Beach");
        funList.add("\n Chiang Mai");
        funList.add("\n New York City");
        funList.add("\n Tokyo");
        System.out.println(funList + "\n");
        
        // Map Collection
        /*******************************************************************
         * Map is an object that maps unique keys to values, and a key is an 
         * object that retrieves a value at another time. There are no duplicate 
         * keys, One key, one value.
         *******************************************************************/
        System.out.println("Map Collection Example");
        System.out.println("Names with Nicknames: ");
        Map<String, String> mapNickNames = new LinkedHashMap<>();
        mapNickNames.put("Peter", "Preisthood");
        mapNickNames.put("\n Michael", "Mickey");
        mapNickNames.put("\n Francis", "Egghead");
        mapNickNames.put("\n Oliver", "Olie");
        mapNickNames.put("\n Julian", "Julie");
        mapNickNames.put("\n Stewart", "Stu");
        mapNickNames.put("\n Logan", "Rogain");
        System.out.println(mapNickNames + "\n");
        
        // TreeSet Collection
        /*******************************************************************
         * TreeSet provides good storage in sorted and ascending order. 
         * The elements are also sorted by keys (indexing). TreeSet is used quite
         * often because of its quick access and retrieval time, especially when 
         * it comes to storing large amounts of sorted information. 
         *******************************************************************/
        System.out.println("TreeSet Collection Example");
        System.out.println("Classic Disney characters: ");
        TreeSet DisneyChar = new TreeSet();
        DisneyChar.add("Mickey Mouse");
        DisneyChar.add("Minnie Mouse");
        DisneyChar.add("Donald Duck");
        DisneyChar.add("Daisy Duck");
        DisneyChar.add("Goofy");
        DisneyChar.add("Pluto" + "\n");
        
        Iterator list = DisneyChar.iterator();
        while(list.hasNext()) {
        Object element = list.next();
        System.out.print(element + "\n");
        }
        
        // Set demonstration using HashSet and TreeSet
        /*******************************************************************
        * Set is an unordered collection of unique objects and duplicates 
        * are not seen. The Set collection cannot hold two equal objects.
        *******************************************************************/
        System.out.println("Set Collection Example");
        System.out.print("My favorite States: "); 
        
        Set<String> setCol = new HashSet<String>(); 
        setCol.add("\n Alabama"); 
        setCol.add("\n Colorado"); 
        setCol.add("\n Arizona"); 
        setCol.add("\n Idaho"); 
        setCol.add("\n Colorado"); 
  
        System.out.println(setCol + "\n"); 
  
        /*TreeSet is used here to organized the set in alphabetical order and 
        still ingnores the Colorado duplicate.*/
        System.out.print("Set sorted using TreeSet" + "\n"); 
        System.out.print("My Favorite States in Alaphabetical order: "); 
        Set<String> tree_Set = new TreeSet<String>(setCol); 
        System.out.println(tree_Set);
        
        // Queue demonstration with LinkedList
        /********************************************************************
        * Queue collection holds the elements that will soon be processed and 
        * also provides other operations such as Insert, Remove, and Examine.
        * Queue has two sides. Entries are added at the bottom of the entry 
        * and then removed from the top of the Queue. Often described as first
        * in, first out.
        ********************************************************************/
        Queue<Integer> q = new LinkedList<>(); 
  
        // Adds elements to queue 
        for (int i=0; i<=10; i++) 
        q.add(i); 

        // Display the queue. 
        System.out.println("Queued values: " + q + "\n"); 

        // Remove the beginning value. 
        int remVal = q.remove(); 
        System.out.println("Values removed: " + remVal + "\n"); 

        System.out.println(q); 

        // View the head of queue 
        int headVal = q.peek(); 
        System.out.println("Head of queue: " + headVal + "\n"); 

        // Display the number or size of queue.
        int size = q.size(); 
        System.out.println("Queue size: " + size); 
   }
}
