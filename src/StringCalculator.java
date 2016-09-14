import java.util.regex.Pattern;

public class StringCalculator {
	public int add(String numbersStr) {
		// Returns the sum of the numbers given in numbersStr
		if (numbersStr == null || numbersStr.isEmpty()) return 0;
		
		
		Pattern pattern = Pattern.compile("([0-9]*)[ \n]([0-9]*)");
		
		
		return 0;
	}
}
