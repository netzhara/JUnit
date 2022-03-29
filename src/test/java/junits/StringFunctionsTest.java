package junits;



import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringFunctionsTest {
	
	@DisplayName("Positive Test")
	@Test
	public void test1() {
		
		assertTrue(StringFunctions.isPalindrome("madam"));
		assertTrue(StringFunctions.isPalindrome("radar"));
	}

	@DisplayName("Negative Test")
	@Test
	public void test2() {
		assertFalse(StringFunctions.isPalindrome("roits"));
	}
}
