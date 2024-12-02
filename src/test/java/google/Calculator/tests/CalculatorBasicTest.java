package google.Calculator.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import google.Calculator.testcomponents.BaseTest;

public class CalculatorBasicTest extends BaseTest{
		
	@Test(dataProvider="getData", groups={"smoke", "testdataset"})
	public void performBasicAddition(HashMap<String, Integer> input) {
		int sum = calcPage.basicAddition(input.get("num1"), input.get("num2"));
		Assert.assertEquals(sum, input.get("num1")+input.get("num2"));
	}
	
	@Test(dataProvider="getData", groups={"testdataset"})
	public void performBasicSubtraction(HashMap<String, Integer> input) {
		int diff = calcPage.basicSubtraction(input.get("num1"), input.get("num2"));
		Assert.assertEquals(diff, input.get("num1")-input.get("num2"));
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
	
	@DataProvider
	public Object[][] getData() throws IOException {
		
		
		/*
		 * HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		 * map1.put("num1", 7); 
		 * map1.put("num2", 4);
		 * 
		 * HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		 * map2.put("num1", 2); 
		 * map2.put("num2", 8);
		 */
		 
		
		List<HashMap<String, Integer>> data = getJsonDataToMap(System.getProperty("user.dir") + "//src//test//java//google//Calculator//testdata//calculator.json");
		
		return new Object[][] {{data.get(0)}, {data.get(1)}};
		
	}
	
}
