package junits;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestExample {
	
	@RepeatedTest(3)
	public void addTest () {
		
		assertEquals(9,Calculator.add(5, 4));
	}

}
