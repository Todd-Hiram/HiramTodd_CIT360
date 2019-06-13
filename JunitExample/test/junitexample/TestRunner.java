package junitexample;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/** 
 * JUnit is an open-source testing framework for Java and this testing very 
 * important when it comes to unit testing small blocks of code. This framework 
 * supports several annotations in order to identify a method, and these annotations
 * include the word "test". The "@test" annotation tells the JUnit that the public 
 * void method can run as a test case.
 **/
class TestRunner {

	/**
         * assertEquals test
         * addNumbers
         * 
         * This is the test for the addNumbers method in the JunitExample class 
         * and makes sure that the method runs right. This block creates a new 
         * instance of the JunitExample class. If the excepted results matches the
         * the actual result in this block, then test was successful.
         **/
	@Test
	void addingNumbers() {
		JunitExample JUnit = new JunitExample();
		int expected =12;
		int actual= JUnit.addNumbers(4, 8);
		assertEquals(expected, actual);
	}

	/**
         * assertArrayEquals test
         * skyrimArray
         * 
         * This block matches one array with another, like we have below. If one
         * of the arrays has an added city or if was missing one of them, then the
         * test will fail because both arrays no longer match. But if both arrays 
         * match, then the test will be successful.
         **/
	@Test
	void skyrimArray() {
		String[] expected= {
                    "Falkreath",
                    "Riften",
                    "Whiterun",
                    "Windhelm",
                    "Solitude",
                    "Markarth",
                    "Morthal",
                    "Dawnstar",
                    "Winterhold" };
		String[] actual={
                    "Falkreath",
                    "Riften",
                    "Whiterun",
                    "Windhelm",
                    "Solitude",
                    "Markarth",
                    "Morthal",
                    "Dawnstar",
                    "Winterhold" };
		assertArrayEquals(expected,actual);
	}
        
	/**
         * assertFalse test
         * greaterThan
         * 
         * This block creates a new instance of JUnitboolean to test that the 
         * greaterThan method returns a false. If the entered number comes out
         * true in the assertFalse, then test will fail.
         **/
	@Test
	void greaterThan() {
		JunitExample JUnitboolean= new JunitExample();
		assertFalse(JUnitboolean.greaterThan(3,4));
	}
        
	/**
         * assertNotNull
         * SkyrimJarl
         * 
         * This block creates a new instance of the HashMap on the JunitExample
         * class and it makes sure that the keys in the HashMap all have values. 
         * If a Jarl were were added to the HashMap with out a city for ruling or 
         * vice versa, the test fails.
         **/
	@Test
	void SkyrimJarl() {
		JunitExample JUnitHashMap= new JunitExample();
		assertNotNull(JUnitHashMap.SkyrimJarl("Riften"));
	}
        
	/**
         * assertNotSame
         * SpringCourses
         * 
         * Here we are creating a new instance of our
	 * JUnitCourses that reference our HashMap for
	 * our list of Spring Courses. This test is to
	 * make sure that each of our keys are referencing
	 * different objects. We can't have a CIT262 courses
	 * mistakenly referring to an Object Oriented software
	 * development course. If the keys are referencing the 
	 * same object, the test will fail.
         **/
	@Test
	void SpringCourses() {
		JunitExample JUnitCourses= new JunitExample();
		assertNotSame(JUnitCourses.SpringCourses("CIT262"),JUnitCourses.SpringCourses("CIT360"));
	}
        
	/**
         * AssertNull
         * FallCourses
         * 
         * Here we are creating a new instance of our JUnit
	 * FallCourses that reference our HashMap for my list 
	 * of Fall courses. This test is going to make sure
	 * that that key we enter is null. If the course number
	 * I enter is not null then it will fail. Think of it this
	 * way. I want to make sure the course code "CIT360" is null
	 * in my Fall Semester course list because I want to make sure
	 * I pass this class the first time and don't have to take it 
	 * again. If this course number is Null that means I get to
	 * graduate in December however, if it is not null, that means
	 * I will not graduate in December and I will have to take  
	 * the course again. We want this to be null!
         **/
	@Test
	void FallCourses() {
		JunitExample JUnitFallCourses= new JunitExample();
		assertNull(JUnitFallCourses.FallCourses("CIT360"));
	}
        
	/**
	 * assertTrue
	 * lessThan
     *
     * Here we are creating a new instance
	 * of our JunitlessThanboolean to check
	 * and make sure that number1 is less than number2
	 * it is pulling this information from out lessThan
	 * method in our JUnit class.
         **/
	@Test
	void lessThan() {
		JunitExample JUnitlessThanboolean= new JunitExample();
		assertTrue(JUnitlessThanboolean.lessThan(3,4));
	}
        
	/**
	 * Here we are testing to make sure that the
	 * two value salesPrice and homeAppraisal 
	 * are the same. If they are not the same
	 * the test will fail. We want to make 
	 * that the Appraisal and the salePrice 
	 * on the home are the same or we can
	 *  run into trouble when we go to sell 
	 *  house.
         **/
	@Test
	void appraisal() {

		String salePrice="279900";
		String homeAppraisal="279900";
		assertSame(salePrice,homeAppraisal);
	}
        

	
	/**
	 * Here we are testing to make sure that the
	 * two parameters are the same.If they are not
	 * the same, the test will fail.
         **/
	@Test
	 void hello() {
		assertThat("Hello",is("Hello"));
	}
}