import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class TestRunner {

	class JUnitTest {

		/*This is testing our addingNumbers method from JUnit
		 * to make use that the method runs properly.
		 * We are creating a new instance of our JUnit class
		 * and It is saying that if that excepted result
		 * matches the actual result then the test
		 * is successful.*/
		@Test
		void addingTest() {
			JUnit JUnit = new JUnit();
			int expected = 12;
			int actual = JUnit.addNumbers(4, 8);
			assertEquals(expected, actual);
		}

		/*Here we are making sure that our Array matches what
		 * it is supposed to contain. In our example, the Array
		 * only supposed to contain the Cities in Skyrim. If something
		 * is added that isn't a Skyrim City or one of the Cities is
		 * missing, the test will fail because the expected and the actual
		 * don't match.  */
		@Test
		void skyrimArray() {
			String[] expected = {"Falkreath", "Riften", "Whiterun", "Windhelm", "Solitude", "Markarth", "Morthal", "Dawnstar", "Winterhold"};
			String[] actual = {"Falkreath", "Riften", "Whiterun", "Windhelm", "Solitude", "Markarth", "Morthal", "Dawnstar", "Winterhold"};
			assertArrayEquals(expected, actual);
		}

		/*Here we are creating a new instance of
		 * our JUnitboolean and testing that the
		 *  greaterThan method returns false. If the
		 * numbers entered into the assertFalse produce
		 * a true, the test will fail.*/
		@Test
		void greaterThan() {
			JUnit JUnitboolean = new JUnit();
			assertFalse(JUnitboolean.greaterThan(3, 4));
		}

		/*In this test, we are creating a new instance
		 * of our JUnitHashMap and making sure that the keys
		 * in our HashMap all have values. If I were to put
		 * a Jarl in to our HashMap and not include the City
		 * they rule over, the test would fail. Similarly,
		 * if I enter a city that is not in my HashMap, that
		 * test will also fail. */
		@Test
		void SkyrimJarl() {
			JUnit JUnitHashMap = new JUnit();
			assertNotNull(JUnitHashMap.SkyrimJarl("Riften"));
		}

		/*Here we are creating a new instance of our
		 * JUnitCourses that reference our HashMap for
		 * our list of Spring Courses. This test is to
		 * make sure that each of our keys are referencing
		 * different objects. We can't have a CIT262 courses
		 * mistakenly referring to an Object Oriented software
		 * development course. If the keys are referencing the
		 * same object, the test will fail. */
		@Test
		void SpringCourses() {
			JUnit JUnitCourses = new JUnit();
			assertNotSame(JUnitCourses.SpringCourses("CIT262"), JUnitCourses.SpringCourses("CIT360"));
		}

		/*Here we are creating a new instance of our JUnit
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
		 * the course again. We want this to be null!*/
		@Test
		void FallCourses() {
			JUnit JUnitFallCourses = new JUnit();
			assertNull(JUnitFallCourses.FallCourses("CIT360"));
		}

		/*Here we are testing to make sure that the
		 * two value salesPrice and homeAppraisal
		 * are the same. If they are not the same
		 * the test will fail. We want to make
		 * that the Appraisal and the salePrice
		 * on the home are the same or we can
		 *  run into trouble when we go to sell
		 *  house.*/
		@Test
		void appraisal() {

			String salePrice = "279900";
			String homeAppraisal = "279900";
			assertSame(salePrice, homeAppraisal);
		}

		/*Here we are creating a new instance
		 * of our JunitlessThanboolean to check
		 * and make sure that number1 is less than number2
		 * it is pulling this information from out lessThan
		 * method in our JUnit class.*/
		@Test
		void lessThan() {
			JUnit JUnitlessThanboolean = new JUnit();
			assertTrue(JUnitlessThanboolean.lessThan(3, 4));
		}

		/*Here we are testing to make sure that the
		 * two parameters are the same.If they are not
		 * the same, the test will fail.*/
		@Test
		void hello() {
			assertThat("Hello", is("Hello"));
		}
	}
}
