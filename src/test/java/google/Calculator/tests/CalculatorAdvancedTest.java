package google.Calculator.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import google.Calculator.testcomponents.BaseTest;

public class CalculatorAdvancedTest extends BaseTest {
	
	@Test
	public void performAddingNegativeNumbers() {
		String sum = calcPage.addNegativeNumbers();
		Assert.assertEquals(sum, "-154");
	}
	
	@Test
	public void performSubtractingDecimalNumbers() {
		String diff = calcPage.subtractDecimalNumbers();
		Assert.assertEquals(diff, "24.93");
	}
	
	@Test
	public void performMultiplyingMaxValues() {
		String prod = calcPage.multiplyMaxValues();
		Assert.assertEquals(prod, "2e+12");
	}
	
	@Test
	public void performDivisionByZero() {
		String quo = calcPage.divideByZero();
		Assert.assertEquals(quo, "Infinity");
	}
	
	@Test(groups={"smoke"})
	public void performSeriesCalculations() {
		String res = calcPage.seriesCalc();
		Assert.assertEquals(res, "270");
	}

}
