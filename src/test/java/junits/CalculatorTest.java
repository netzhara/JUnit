package junits;
import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.junit.jupiter.api.Disabled;

public class CalculatorTest {
	

	@Test
	public void addTest () {
		assertEquals(9,Calculator.add(5, 4));
	}
	
	@Disabled
	@Test
	public void addTest1 () {
		assertEquals(1,Calculator.sub(5,4));
	}
}
