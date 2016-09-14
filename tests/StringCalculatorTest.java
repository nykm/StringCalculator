import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testEmptyString_Return_Zero() {
		StringCalculator calculator = new Calculator();
		
		int result = calculator.add("");
		assertEquals(0, result);
	}
	
	//@Test
	//public void test() {
	//	fail("Not yet implemented");
	//}

}
