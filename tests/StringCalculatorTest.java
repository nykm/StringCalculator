import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testEmptyString_Return_Zero() {
		StringCalculator calculator = new StringCalculator();
		
		int result = calculator.add("");
		assertEquals(0, result);
	}
	
	@Test
	public void testEmptyString_One_Value_Return_Value() {
		StringCalculator calculator = new StringCalculator();
		
		int result = calculator.add("5");
		assertEquals(5, result);
	}
	
	@Test
	public void testEmptyString_Values_5_7_Return_Value() {
		StringCalculator calculator = new StringCalculator();
		
		int result = calculator.add("5,7");
		assertEquals(12, result);
	}
	
	//@Test
	//public void test() {
	//	fail("Not yet implemented");
	//}

}
