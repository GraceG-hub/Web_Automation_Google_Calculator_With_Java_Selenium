package google.Calculator.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import google.Calculator.abstractcomponents.AbstractComponents;

public class SearchPage extends AbstractComponents{
	
	WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="APjFqb")
	WebElement searchBox;
	
	@FindBy(name="btnK")
	WebElement googleSearch;
	
	@FindBy(xpath="//div[@class='tyYmIf']")
	WebElement calcBlock;
	
	public CalculationPage calcSearch(String text) {
		driver.get("https://www.google.com/");
		searchBox.sendKeys(text);
		googleSearch.click();
		waitForElementToBeDisplayed(calcBlock);
		CalculationPage calcPage = new CalculationPage(driver);
		return calcPage;
	}

}
