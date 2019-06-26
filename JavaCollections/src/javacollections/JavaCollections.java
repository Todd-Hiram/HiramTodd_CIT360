/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
        
        /**
         * SortedMap Interface
         * 
         * This example demonstrates the few API of SortedMap interface using 
         * TreeSet implementation class. We have firstKey(), lastKey(), 
         * tailMap(String fromKey), and headMap(String toKey).
         **/
        System.out.println("*** SortedMap Interface ***");
        // We create a TreeMap
        SortedMap<String, String> fileExtensions = new TreeMap<>();
        
        // Here we add new key-value pairs to a TreeMap
        fileExtensions.put("Python ", " .py");
        fileExtensions.put("C++ ", " .cpp");
        fileExtensions.put("Kotlin ", " .kt");
        fileExtensions.put("Golang ", " .go");
        fileExtensions.put("Java ", " .java");
        
        // Print the TreeMap (Output will be sorted base on keys)
        System.out.println(fileExtensions);
        System.out.println("First key: " + fileExtensions.firstKey());
        System.out.println("Last key: " + fileExtensions.lastKey());
        
        SortedMap<String, String> sortedMap = fileExtensions.tailMap("java");
        System.out.println("tailMap: " + sortedMap);
        

        sortedMap = fileExtensions.headMap("java");
        System.out.println("headMap : " + sortedMap + "\n");
        // https://www.javaguides.net/2018/08/collections-framework-the-sortedmap-interface.html
        
        
        /**
         * Map Interface
         * 
         * Map interface is a part of the Java Collection Framework that does not inherit
         * Collection Interface.
         * 
         * This is an example of Map interface with it's implementation class - HashMap 
         **/
        System.out.println("*** Map Interface ***");
        // Create a HashMap
        Map<String, Integer> numberMapping = new HashMap<>();
        
        // Add key-value pairs to a HashMap
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);
        
        // Add new key-value pair only if the key does not exist in the HashMap, 
        // or is mapped to 'null'
        numberMapping.putIfAbsent("Four", 4);
        
        System.out.println(numberMapping + "\n");
        // https://www.javaguides.net/2018/08/collections-framework-the-map-interface.html
    
        
        /**
         * The Deque Interface
         * 
         * This interface defines methods to access the elements at both ends of the
         * Deque instance.
         * 
         * Deque is a double-ended queue which is what is a linear collection of 
         * elements that supports the insertion and removal of elements at both the
         * end points.
         **/
        System.out.println("*** Deque Interface ***");
        Deque<String> deque = new ArrayDeque<String>();
        deque.offer("element1");
        deque.offer("element2");
        deque.add("element3");
        deque.offerFirst("element4");
        System.out.println("After offerFirst Traversal...");
        for (String s : deque) {
         System.out.println(s);
        }
        
        // deque.poll();
        // deque.pollFirst();//it is same as poll()
        deque.pollLast();
        System.out.println("After pollLast() Traversal..." + "\n");
        for (String s : deque) {
         System.out.println(s + "\n");
        }
        // https://www.javaguides.net/2018/08/collections-framework-the-deque-interface.html
        
        
        
        /**
         * Queue Interface
         * 
         * This Queue Interface demonstrates with LinkedList() implementation. This
         * example also demonstrates the Queue methods - isEmpty(), size(), element(),
         * and peek().
         * 
         * The example checks if a Queue is empty, finds the size of a Queue, searches
         * for an element in a Queue, and gets the element at the front of the Queue
         * without removing it.
         **/
        System.out.println("*** Queue Interface ***");
        Queue<String> elementQueue = new LinkedList<>();
        
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
        
        // https://www.javaguides.net/2018/08/collections-framework-queue-interface.html

        
        
        
        /**
         * SortedSet Interface
         * 
         * This SortSet is a Set that maintains its elements in ascending order, 
         * and in the natural order or according to a Comparator provided at 
         * SortSet creation time. SortSet interface also provides operations for 
         * Range view that allows arbitrary range operations on the sorted set, 
         * Endpoints that returns the first or last elements in the sorted set, and
         * Comparator access which returns the Comparator, if any, used to sort the
         * set.
         **/
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
        
        SortedSet<String> tailSet = fruits.tailSet("Pineapple");
        System.out.println("tailSet: " + tailSet + "\n");
        
        // https://www.javaguides.net/2018/08/collection-framework-the-sortedset-interface.html
        
        
        
        /**
         * List Interface
         * 
         * The List interface lists are zero-based index. The elements of the list
         * can be accessed using an integer index - get() API. This is an ordered
         * collection (also known as a sequence) and guarantees an insertion order.
         * A user using this interface has complete control over where in the list
         * each element is inserted. 
         * 
         * This is a simple List interface demonstration using ArrayList implementation class. 
         **/
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
        
        // https://www.javaguides.net/2018/08/collections-framework-the-list-interface.html
        
        
       
        
        /**
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
         **/
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
        
        // https://www.javaguides.net/2018/08/collections-framework-the-set-interface.html
        
        

        /**
         * Collection interface
         * 
         * This is a root interface in the hierarchy and represents groups of objects
         * known as its elements. The examples above are sub interfaces of Collection
         * Interfaces. JDK (Java Development Kit) may not provide any direct 
         * implementations for this interface but it does for the sub interfaces.
         **/
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
        
        // https://www.javaguides.net/2018/08/collections-framework-the-collection-interface.html

    }
}
