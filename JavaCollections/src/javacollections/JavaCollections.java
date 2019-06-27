/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author hiramtodd
 */
public class JavaCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /***********************************************************************
         * SortedMap Interface
         * 
         * This example demonstrates the few API of SortedMap interface using 
         * TreeSet implementation class. We have firstKey(), lastKey(), 
         * tailMap(String fromKey), and headMap(String toKey).
         ***********************************************************************/
        System.out.println("*** SortedMap Interface ***");
        
        // Creating a TreeMap
        SortedMap<String, String> fileExtensions  = new TreeMap<>();

        // Adding new key-value pairs to a TreeMap
        fileExtensions.put("python", ".py");
        fileExtensions.put("c++", ".cpp");
        fileExtensions.put("kotlin", ".kt");
        fileExtensions.put("golang", ".go");
        fileExtensions.put("java", ".java");

        // Printing the TreeMap (Output will be sorted based on keys)
        System.out.println(fileExtensions + "\n");
        
        // Returns the first (lowest) key currently in this map.
        System.out.println("First Key :" + fileExtensions.firstKey());
        
        // Returns the last (highest) key currently in this map.
        System.out.println("Last Key :" + fileExtensions.lastKey() + "\n");
        
        // Returns a view of the portion of this map whose keys are greater than or equal to fromKey.
        SortedMap<String, String> sortedMap = fileExtensions.tailMap("java");
        System.out.println("tailMap : " + sortedMap);
        
        // Returns a view of the portion of this map whose keys are strictly less than toKey.
        sortedMap = fileExtensions.headMap("java");
        System.out.println("headMap : " + sortedMap + "\n");
        
        /** 
         * {C++ = .cpp, Golang = .go, Java = .java, Kotlin = .kt, Python = .py}
         * 
         * First key: C++ 
         * Last key: Python 
         * 
         * tailMap: {java=.java, kotlin=.kt, python=.py}
         * headMap : {c++=.cpp, golang=.go} 
         **/
        
        // https://www.javaguides.net/2018/08/collections-framework-the-sortedmap-interface.html
        
        
        /************************************************************************
         * Map Interface
         * 
         * Map interface is a part of the Java Collection Framework that does not inherit
         * Collection Interface.
         * 
         * This is an example of Map interface with it's implementation class - HashMap 
         ************************************************************************/
//        System.out.println("*** Map Interface ***");
//        // Create a HashMap
//        Map<String, Integer> numberMapping = new HashMap<>();
//        
//        // Add key-value pairs to a HashMap
//        numberMapping.put("One", 1);
//        numberMapping.put("Two", 2);
//        numberMapping.put("Three", 3);
//        
//        // Add new key-value pair only if the key does not exist in the HashMap, 
//        // or is mapped to 'null'
//        numberMapping.putIfAbsent("Four", 4);
//        
//        System.out.println(numberMapping + "\n");
        
        // https://www.javaguides.net/2018/08/collections-framework-the-map-interface.html
    
        
        /************************************************************************
         * The Deque Interface
         * 
         * This interface defines methods to access the elements at both ends of the
         * Deque instance.
         * 
         * Deque is a double-ended queue which is what is a linear collection of 
         * elements that supports the insertion and removal of elements at both the
         * end points.
         ************************************************************************/
        System.out.println("*** Deque Interface ***");
        
        Deque<String> deque = new ArrayDeque<String>();
        deque.offer("element1");
        deque.offer("element2");
        deque.add("element3");
        // This is an Insert operation that brings the element at the beginning of the Deque instance
        deque.offerFirst("element4");
        
        System.out.println("After offerFirst Traversal...");
        for (String s : deque) {
         System.out.println(s);
        }
        
        // This uses the pollLast() method to remove the last element in the instance, which is element3
        deque.pollLast();
        System.out.println("After pollLast() Traversal..." + "\n");
        for (String s : deque) {
         System.out.println(s + "\n");
        }
        
        /** 
         * After offerFirst Traversal...
         * element4
         * element1
         * element2
         * element3
         * After pollLast() Traversal...
         * element4
         * element1
         * element2 
         **/
        
        // https://www.javaguides.net/2018/08/collections-framework-the-deque-interface.html
        
        
        
        /*************************************************************************
         * Queue Interface
         * 
         * This Queue Interface demonstrates with LinkedList() implementation. 
         * This example also demonstrates the Queue methods - isEmpty(), size(), 
         * element(), and peek().
         * 
         * The example checks if a Queue is empty, finds the size of a Queue, 
         * searches for an element in a Queue, and gets the element at the front 
         * of the Queue without removing it.
         ************************************************************************/
        System.out.println("*** Queue Interface ***");
        
        // Create and initialize a Queue using a LinkedList
        Queue<String> elementQueue = new LinkedList<>();
        
        // All new elements to the Queue (The )
        elementQueue.add("element1");
        elementQueue.add("element2");
        elementQueue.add("element3");
        elementQueue.add("element4");
        
        System.out.println("WaitingQueue empty: " + elementQueue);
        
        // Check if the Queue is empty
        System.out.println("Is waitingQueue empty?: " + elementQueue.isEmpty());
        
        // Find the size of the Queue
        System.out.println("Size of waitingQueue empty?: " + elementQueue.size());
        
        // Check if the Queue contains an element
        String name = "Johnny";
        if(elementQueue.contains(name)) {
            
            System.out.println("WaitingQueue " + name);
            
        } else {
            
            System.out.println("Waiting Queue doesn't contain " + name);
            
        }

        // Get the element at the front of the Queue without removing it using element()
        // The element() method throws NoSuchElementException if the Queue is empty
        String firstElementInTheWaitingQueue =  elementQueue.element();
        System.out.println("Waiting Queue (element()) : " + firstElementInTheWaitingQueue);

        // Get the element at the front of the Queue without removing it using peek()
        // The peek() method is similar to element() except that it returns null if the Queue is empty
        firstElementInTheWaitingQueue = elementQueue.peek();
        System.out.println("Waiting Queue : " + firstElementInTheWaitingQueue + "\n");
        
        /** 
         * WaitingQueue empty: [element1, element2, element3, element4]
         * Is waitingQueue empty?: false
         * Size of waitingQueue empty?: 4
         * Waiting Queue doesn't contain Johnny
         * Waiting Queue (element()) : element1
         * Waiting Queue : element1 
         **/
        
        // https://www.javaguides.net/2018/08/collections-framework-queue-interface.html

        
        
        /************************************************************************
         * SortedSet Interface
         * 
         * This SortSet is a Set that maintains its elements in ascending order, 
         * and in the natural order or according to a Comparator provided at 
         * SortSet creation time. SortSet interface also provides operations for 
         * Range view that allows arbitrary range operations on the sorted set, 
         * Endpoints that returns the first or last elements in the sorted set, and
         * Comparator access which returns the Comparator, if any, used to sort the
         * set.
         ************************************************************************/
        System.out.println("*** SortedSet Interface ***");
        
        // Create a TreeSet
        SortedSet<String> fruits = new TreeSet();
        
        // Adding new elements to a TreeSet
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");
        fruits.add("Peach");
        fruits.add("Mango");
        
        // Returns the first (lowest) element currently in this set
        String first = fruits.first();
        System.out.println("First element: " + first);
        
        // Return the last (highest) element currently in this set
        String last = fruits.last();
        System.out.println("Last element: " + last);
        
        // Returns the comparator used to order the elements in the set, or null
        // if this set uses the natural ordering of its elements
        Comparator<?> comparator = fruits.comparator();
        
        SortedSet<String> tailSet = fruits.tailSet("Orange");
        System.out.println("tailSet: " + tailSet + "\n");
        
        /** 
         * First element: Apple
         * Last element: Pineapple
         * tailSet: [Pineapple] 
         **/
        
        // https://www.javaguides.net/2018/08/collection-framework-the-sortedset-interface.html
        
        
        
        /************************************************************************
         * List Interface
         * 
         * The List interface lists are zero-based index. The elements of the list
         * can be accessed using an integer index - get() API. This is an ordered
         * collection (also known as a sequence) and guarantees an insertion order.
         * A user using this interface has complete control over where in the list
         * each element is inserted. 
         * 
         * This is a simple List interface demonstration using ArrayList implementation class. 
         ************************************************************************/
        System.out.println("*** List Interface ***");
        // Create an ArrayList of String using
        List<String> disneyCharacters = new ArrayList<>();
        
        // Adding new elements to the ArrayList
        disneyCharacters.add("Mickey");
        disneyCharacters.add("Donald");
        disneyCharacters.add("Goofey");
        disneyCharacters.add("Pluto");
        disneyCharacters.add("Goofey");
        System.out.println(disneyCharacters + "\n");
        
        /**
         * [Mickey, Donald, Goofey, Pluto, Goofey]
         **/
        
        // https://www.javaguides.net/2018/08/collections-framework-the-list-interface.html
        
        
       
        
        /************************************************************************
         * Set Interface
         * 
         * Set interface only contains unique elements and no duplicates will display,
         * and contains only one null element. Also, there is no random access of 
         * elements on account of there is no get() API, models the mathematical set
         * abstraction, no insertion order guarantee, and adds stronger contract on
         * the behavior of equals and hashCode operations, allowing Set instances 
         * to be compared meaningfully even if their implementation types vary. If
         * the elements are the same then the two instances are equal. 
         * 
         * Also, Set interface only contains unique elements and will not allow 
         * duplicates. If a duplicate is added, it will not display.
         ************************************************************************/
        // Create a HashSet
        Set<String> uniques = new HashSet<String>();
        Set<String> dups    = new HashSet<String>();

        // Adding new elements to the HashSet
        uniques.add("Monday");
        uniques.add("Tuesday");
        uniques.add("Wednesday");
        uniques.add("Thursday");
        uniques.add("Friday");
        uniques.add("Saturday");
        uniques.add("Sunday");
        
        // Adding duplicate elements will be ignored
        uniques.add("Monday");

        for(String a : uniques) {
            if (!uniques.add(a)) {
                dups.add(a);
            }

            // This prints the seven days of the week
            System.out.println(uniques);
            // This prints the length of the elements without the duplicate
            System.out.println(uniques.size() + "\n");

            // Destructive set-difference
            uniques.removeAll(dups);

            // Prints the unique days of the week
            System.out.println("Unique words: " + uniques);
            
            // Prints the duplicates days
            System.out.println("Duplicate words: " + dups);
            
            // This prints the length of the elements without the duplicates
            System.out.println(uniques.size());

        }
        
        /** 
         * [Monday, Thursday, Friday, Sunday, Wednesday, Tuesday, Saturday]
         * 7
         * 
         * Unique words: [Thursday, Friday, Sunday, Wednesday, Tuesday, Saturday]
         * Duplicate words: [Monday]
         * 6 
         **/
        
        // https://www.javaguides.net/2018/08/collections-framework-the-set-interface.html
        
        

        /************************************************************************
         * Collection interface
         * 
         * This is a root interface in the hierarchy and represents groups of objects
         * known as its elements. The examples above are sub interfaces of Collection
         * Interfaces. JDK (Java Development Kit) may not provide any direct 
         * implementations for this interface but it does for the sub interfaces.
         ************************************************************************/
        System.out.println("*** Collection Interface ***");
        
        // Creating an ArrayList of String using
        Collection <String> animals = new ArrayList<>();
        
        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Gorilla");
        animals.add("Giraffe");
        System.out.println(animals);
        
        String[] arrayOfAnimals = new String[4];
        
        System.out.println(arrayOfAnimals.length);
        arrayOfAnimals[0] = "Lion";
        arrayOfAnimals[1] = "Tiger";
        arrayOfAnimals[2] = "Gorilla";
        arrayOfAnimals[3] = "Giraffe";
        for (String string : arrayOfAnimals) {
            System.out.println(string + "\n");
        }
        
        /** 
         * [Lion, Tiger, Gorilla, Giraffe]
         * 4
         * Lion 
         * Tiger
         * Gorilla
         * Giraffe
         **/
        
        // https://www.javaguides.net/2018/08/collections-framework-the-collection-interface.html

        
        
        /************************************************************************
         * Map Interface
         * 
         * Map interface is a part of the Java Collection Framework that does not inherit
         * Collection Interface.
         * 
         * Returns true if this map contains a mapping for the specified key. More formally, 
         * returns true if and only if this map contains a mapping for a key k such that 
         * (key==null ? k==null: key.equals(k)). (There can be at most one such mapping.)
         ************************************************************************/
        System.out.println("*** Map Interface ***");
        
        Map<String, String> userCityMapping = new HashMap<>();
        
        userCityMapping.put("John", "New York");
        userCityMapping.put("Walt", "Marcelline");
        userCityMapping.put("Rajeev", "Bengaluru");
        userCityMapping.put("Steve", "London");

        
        String userName = "Walt";
        
        // Check if a key exists in a HashMap
        if(userCityMapping.containsKey(userName)) {
            
            // Get the value assigned to a given key in the HashMap
            String city = userCityMapping.get(userName);
            System.out.println(userName + " lives in " + city);

        } else {
            
            System.out.println("City details not found for user " + userName);
            
        }
        
        /** 
         * Walt lives in Marcelline
         **/
    }
}
