package junitexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/** 
 * JUnit is an open-source testing framework for Java and this testing very 
 * important when it comes to unit testing small blocks of code. This framework 
 * supports several annotations in order to identify a method, and these annotations
 * include the word "test". The "@test" annotation tells the JUnit that the public 
 * void method can run as a test case.
 **/

public class JunitExample {

	/**
     * assertEquals test
     * addNumbers
     * 
     * This block will return with the sum of two numbers into the ints and
     * pass them into the method which will then return the sum.
     **/
	public int addNumbers(int number1, int number2) {
		return number1 + number2;	
	}
	
	/**
     * assertArrayEquals
     * skyrimArray
	 *
	 * Here we are creating an ArrayList of all
	 * the cities of Skyrim. After the list is 
	 * created, we will return the contents.
         **/
	public List skyrimArray(){
	List<String> skyrimCities= new ArrayList<>();	
		return skyrimCities;
	}
        
	/**
    * assertFalse
    * greaterThan
    * 
    * This method is set up to be tested by JUnit in order to make sure that
    * number1 is greater than number2, and that the return is true. If not, 
    * then method will returns false.
    **/
	public boolean greaterThan(int number1,int number2) {
		if (number1 > number2){
			return true; 
		}else {
			return false;
		}
	}
	
	/**
    * assertNotNull
    * SkyrimJarl
    * 
    * This block is a hash map of all the Jarls (Rulers) of Skyrim and the 
    * cities they rule. The city is the acting key in this hash map when it 
    * comes to testing.
    **/
	public String SkyrimJarl(final String key) {
            
		Map<String, String> SkyrimJarl=new HashMap<>();
		SkyrimJarl.put("Dawnstar","Brina Merilis");
		SkyrimJarl.put("Falkreath","Dengeir of Stuhn");
		SkyrimJarl.put("Markarth","Thongvor Silver-Blood");
		SkyrimJarl.put("Morthal","Sorli the Builder");
		SkyrimJarl.put("Riften","Maven Black-Briar");
		SkyrimJarl.put("Solitude","Elisif the Fair");
		SkyrimJarl.put("Whiterun","Vignar Gray-Mane");
		SkyrimJarl.put("Windhelm","Brunwulf Free-Winter");
		SkyrimJarl.put("Winterhold","Kraldar");
		
		return SkyrimJarl.get(key);
	}
        
	/**
    * assertNotSame
    * SpringCourses
    * 
    * This block is another Hash Map and it is of the courses I have left 
    * before I graduate. The key this time is the course code, and following 
    * after are the reference courses.
    **/
	public String SpringCourses(final String key) {
            
		Map<String,String> SpringCourses=new HashMap<>();
		SpringCourses.put("CIT498","Internship");
		SpringCourses.put("CIT495","Senior Practicum");
		SpringCourses.put("CIT353","Operating Systems II");
		SpringCourses.put("CIT360","Object-Oriented Software Development");
	
		return SpringCourses.get(key);
	}
        
	/**
    * AssertNull
    * FallCourses
    * 
	* Here are are creating a hashmap of the courses I 
	* will be taking in the fall. the key is the
	* course code and each course code has a course
	* description.
    **/
	public String FallCourses(final String key) {
            
		Map<String,String> FallCourses=new HashMap<>();
		FallCourses.put("CIT261","Mobile Application Development");
		FallCourses.put("CIT353","Operating Systems II");
		FallCourses.put("CIT365",".NET Software Development");
		FallCourses.put("CIT380","Project Management");
		FallCourses.put("CIT495","Senior Practicum");
	
		return FallCourses.get(key);
	}

	/**
    * assertTrue
    * lessThan
    * 
	* Here we are making sure that number one is
	* less than number two. If is is the case then
	* the method will return true. If number 1 is
	* not less than number 2 then the method will
	* return false.
    **/
	public boolean lessThan(int number1,int number2) {
		if (number1<number2){
			return true; 
		} else {
			return false;
		}
	}
}