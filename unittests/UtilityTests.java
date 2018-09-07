package unittests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utility.StringUtility;
class UtilityTests {

	@Test
	void testchangeNumber() {
String before = "My monkey has three apples and five bananas";
String expected = "My monkey has 3 apples and 5 bananas";
StringUtility test = new StringUtility();
assertEquals(test.changeNumber(before),expected);

	}
	@Test
	void testchangeNumber1() {
String before = "My monkey has -three apples and five bananas";
String expected = "My monkey has -three apples and 5 bananas";
StringUtility test = new StringUtility();
assertEquals(test.changeNumber(before),expected);

	}
	@Test
	void testchangeNumber3() {
String before = null;
String expected = null;
StringUtility test = new StringUtility();
assertEquals(test.changeNumber(before),expected);

	}
	@Test
	void testLowerCase() {
String before = "My mOnkey has three appLes and five bananas";
String expected = "my monkey has three apples and five bananas";
StringUtility test = new StringUtility();
assertEquals(test.lowerCaseTransformation(before),expected);

	}
	@Test
	void testLowerchangeNumber() {
		String before = "My mOnkey has tHree appLes and fIve bananas";
		String expected = "my monkey has 3 apples and 5 bananas";
StringUtility test = new StringUtility();
assertEquals(test.changeNumber(test.lowerCaseTransformation(before)),expected);

	}
	@Test
	void testremoveWhiteSpaces() {
	String before = "my monkey has 3 apples and 5 bananas";
	String expected = "mymonkeyhas3applesand5bananas";
StringUtility test = new StringUtility();
assertEquals(test.removeWhiteSpaces(before),expected);

}
	
}

