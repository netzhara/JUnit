package junits;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class AnnotationsExample {
	

	@BeforeAll
	public static void method0 () {
		System.out.println("Inside Before All");
	}
	@BeforeEach
	public void method1() {
		System.out.println("Inside Before Each");
	}
	@Test
	public void addTest () {
		assertEquals(9,Calculator.add(5, 4));
		assertTrue(true);
		
		String [] array1 = {"one","two","three"};
		String [] array2 = {"one","two","three"};
		
		assertArrayEquals(array1,array2);
		
		System.out.println("Inside Addition Test");
	}
	
	@Test
	public void addTest1 () {
		assertEquals(1,Calculator.sub(5,4));
		System.out.println("Inside Substraction Test");
	} 
	
	@AfterEach
	public void method2() {
		System.out.println("Inside After Each");
		
	}
	@AfterAll
	public  void method() {
		System.out.println("Inside All");
	}
}
