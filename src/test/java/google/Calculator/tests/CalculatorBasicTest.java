package google.Calculator.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import google.Calculator.testcomponents.BaseTest;

public class CalculatorBasicTest extends BaseTest{
		
	@Test(groups={"smoke"})
	public void performBasicAddition() {
		String sum = calcPage.basicAddition();
		Assert.assertEquals(sum,"12");
	}
	
	@Test
	public void performBasicSubtraction() {
		String diff = calcPage.basicSubtraction();
		Assert.assertEquals(diff, "7");
	}
	
	@Test
	public void performBasicMultiplication() {
		String prod = calcPage.basicMultiplication();
		Assert.assertEquals(prod, "5460");
	}
	
	@Test
	public void performBasicDivison() {
		String quo = calcPage.basicDivision();
		Assert.assertEquals(quo, "100");
	}
	
	@Test(groups= {"smoke"})
	public void performClearLastEntry() {
		String res = calcPage.clearLastEntry();
		Assert.assertEquals(res, "90");
	}
	
}
