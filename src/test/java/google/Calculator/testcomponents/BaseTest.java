package google.Calculator.testcomponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import google.Calculator.pageobjects.CalculationPage;
import google.Calculator.pageobjects.SearchPage;

public class BaseTest {
	
	public WebDriver driver;
	public CalculationPage calcPage;
	
	public WebDriver initializeDriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//google//Calculator//resources//GlobalData.properties");
		prop.load(fis);
		
		String browser = System.getProperty("browser")!=null ? System.getProperty("browser") : prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();	
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();	
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		return driver;
	}
	
	public List<HashMap<String, Integer>> getJsonDataToMap(String filePath) throws IOException {

		// read json to string
		String jsonContent = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);

		// Convert String to Hashmap using Jackson DataBind
		ObjectMapper mapper = new ObjectMapper();

		// Using the Object Mapper, we are reading the String value and convert that to List of Hashmaps
		List<HashMap<String, Integer>> data = mapper.readValue(jsonContent,
				new TypeReference<List<HashMap<String, Integer>>>() {
				});
		return data;

	}
	
	@BeforeTest(alwaysRun = true)
	public CalculationPage calculatorSetUp() throws IOException {
		driver = initializeDriver();
		SearchPage searchpage = new SearchPage(driver);
		calcPage = searchpage.calcSearch("calculator");
		return calcPage;
	}
	
	@AfterMethod(alwaysRun = true)
	public void clearScreen() {
		calcPage.clearScn();
	}
	
	@AfterTest(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
	

}
