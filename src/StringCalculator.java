import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	public int add(String numbersStr) {
		// Returns the sum of the numbers given in numbersStr
		if (numbersStr == null || numbersStr.isEmpty()) return 0;
		

		Pattern pattern1 = Pattern.compile("([0-9]*)");
		Pattern pattern2 = Pattern.compile("([0-9]*),([0-9]*)");
		
		Matcher matcher = pattern1.matcher(numbersStr);

		if (matcher.matches()) {
			return Integer.parseInt(matcher.group(1));
		}
		
		if (matcher.matches()) {
			int number1 = Integer.parseInt(matcher.group(2));
			int number2 = Integer.parseInt(matcher.group(2));
			return Integer.parseInt(matcher.group(2));
		}
		
		return 0;
	}
}
