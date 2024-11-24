package google.Calculator.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import google.Calculator.abstractcomponents.AbstractComponents;

public class CalculationPage extends AbstractComponents{
	
	WebDriver driver;
	
	public CalculationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@jsname='bkEvMb']")
	WebElement digitZero;
	
	@FindBy(xpath="//div[@jsname='N10B9']")
	WebElement digitOne;
	
	@FindBy(xpath="//div[@jsname='lVjWed']")
	WebElement digitTwo;
	
	@FindBy(xpath="//div[@jsname='KN1kY']")
	WebElement digitThree;
	
	@FindBy(xpath="//div[@jsname='xAP7E']")
	WebElement digitFour;
	
	@FindBy(xpath="//div[@jsname='Ax5wH']")
	WebElement digitFive;
	
	@FindBy(xpath="//div[@jsname='abcgof']")
	WebElement digitSix;
	
	@FindBy(xpath="//div[@jsname='rk7bOd']")
	WebElement digitSeven;
	
	@FindBy(xpath="//div[@jsname='T7PMFe']")
	WebElement digitEight;
	
	@FindBy(xpath="//div[@jsname='XoxYJ']")
	WebElement digitNine;
	
	@FindBy(xpath="//div[@jsname='XSr6wc']")
	WebElement add;
	
	@FindBy(xpath="//div[@jsname='pPHzQc']")
	WebElement subtract;
	
	@FindBy(xpath="//div[@jsname='YovRWb']")
	WebElement multiply;
	
	@FindBy(xpath="//div[@jsname='WxTTNd']")
	WebElement divide;
	
	@FindBy(xpath="//div[@jsname='YrdHyf']")
	WebElement decimal;
	
	@FindBy(xpath="//div[@jsname='Pt8tGc']")
	WebElement equal;
	
	@FindBy(xpath="//div[@jsname='H7sWPd']")
	WebElement clearEntry;
	
	@FindBy(xpath="//span[@jsname='VssY5c']")
	WebElement result;
	
	
	public String basicAddition() {
		digitEight.click();
		add.click();
		digitFour.click();
		equal.click();
		return result.getText();
		
	}
	
	public String basicSubtraction() {
		digitOne.click();
		digitZero.click();
		subtract.click();
		digitThree.click();
		equal.click();
		return result.getText();
	}
	
	public String basicMultiplication() {
		digitNine.click();
		digitOne.click();
		multiply.click();
		digitTwo.click();
		digitZero.click();
		multiply.click();
		digitThree.click();
		equal.click();
		return result.getText();
	}
	
	public String basicDivision() {
		digitFive.click();
		digitZero.click();
		digitZero.click();
		divide.click();
		digitFive.click();
		equal.click();
		return result.getText();
	}
	
	public String clearLastEntry() {
		digitSix.click();
		digitZero.click();
		clearEntry.click();
		multiply.click();
		digitOne.click();
		digitFive.click();
		equal.click();
		return result.getText();
	}
	
	public String addNegativeNumbers() {
		subtract.click();
		digitEight.click();
		digitOne.click();
		add.click();
		subtract.click();
		digitThree.click();
		add.click();
		subtract.click();
		digitSeven.click();
		digitZero.click();
		equal.click();
		return result.getText();
	}
	
	public String subtractDecimalNumbers() {
		digitSeven.click();
		digitThree.click();
		decimal.click();
		digitOne.click();
		digitFive.click();
		subtract.click();
		digitFour.click();
		digitEight.click();
		decimal.click();
		digitTwo.click();
		digitTwo.click();
		equal.click();
		return result.getText();		
	}
	
	public String multiplyMaxValues() {
		digitNine.click();
		digitNine.click();
		digitNine.click();
		digitNine.click();
		digitNine.click();
		digitNine.click();
		digitNine.click();
		digitNine.click();
		digitNine.click();
		digitNine.click();
		digitNine.click();
		digitNine.click();
		multiply.click();
		digitTwo.click();
		equal.click();
		return result.getText();
	}
	
	public String divideByZero() {
		digitFour.click();
		digitSix.click();
		divide.click();
		digitZero.click();
		equal.click();
		return result.getText();
	}
	
	public String seriesCalc() {
		digitFive.click();
		digitZero.click();
		digitZero.click();
		add.click();
		digitOne.click();
		digitTwo.click();
		digitZero.click();
		subtract.click();
		digitSeven.click();
		digitZero.click();
		multiply.click();
		digitThree.click();
		digitZero.click();
		divide.click();
		digitSix.click();
		equal.click();
		return result.getText();
	}

}
