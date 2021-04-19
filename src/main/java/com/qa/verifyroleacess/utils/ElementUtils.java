package com.qa.verifyroleacess.utils;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.xml.IWeaveXml;

import com.qa.opencart.factory.DriverFactory;


public class ElementUtils{

	private WebDriver driver;
	private Actions act;
	private JavaScriptUtil jsUtil;

	public ElementUtils(WebDriver driver) {
		this.driver = driver;
		act = new Actions(this.driver);
		jsUtil = new JavaScriptUtil(this.driver);
	}

	public WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		if(DriverFactory.highlight.equals("true")) {
			jsUtil.flash(element);
		}
		return element;
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void doSendKeys(By locator, String value) {
		WebElement element = getElement(locator);
		element.clear();
		element.sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public void doActionsSendKeys(By locator, String value){
		WebElement element = getElement(locator);
		Actions action = new Actions(driver);
		action.sendKeys(element, value).perform();
	}
	
	public void doActionsClick(By locator){
		WebElement element = getElement(locator);
		Actions action = new Actions(driver);
		action.click(element).perform();
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public boolean doIsEnabled(By locator) {
		return getElement(locator).isEnabled();
	}
	public boolean verifyelementIsDisplayed(By locator,int timeout) {
		Boolean Display= getElement(locator).isDisplayed();
		System.out.println(Display);
		return Display;
		
	}
	public boolean verifyelementIsnotDisplayed(By locator) {
		Boolean Display=   !getElement(locator).isDisplayed();
		System.out.println(Display);
		return Display;
		
	}
	
	public boolean doIsnotDisplayed(By locator) {
	
		return true;
	}
	
	public boolean checkWebElementPresent(By locator){
		int elementCount = driver.findElements(locator).size();
		System.out.println("total elements count: " + elementCount + " for " + locator);
		
		if(elementCount>0){
			return true;
		}else{
			return false;
		}
	}

	// *******************Drop down utils ***************
	public void doDropDownSelectByVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

	public void doDropDownSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public void doDropDownSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public List<String> getAllDropDownOptionsList(By locator) {

		WebElement element = getElement(locator);
		List<String> optionsValueList = new ArrayList<String>();

		Select select = new Select(element);
		List<WebElement> optionsList = select.getOptions();

		for (int i = 0; i < optionsList.size(); i++) {
			String text = optionsList.get(i).getText();
			optionsValueList.add(text);
		}

		return optionsValueList;

	}

	public void selectValueFromDropDown(By locator, String value) {

		WebElement element = getElement(locator);

		Select select = new Select(element);
		List<WebElement> optionsList = select.getOptions();

		for (int i = 0; i < optionsList.size(); i++) {
			String text = optionsList.get(i).getText();
			if (text.equals(value)) {
				optionsList.get(i).click();
				break;
			}
		}

	}
	
	public void selectDropDownValueWithoutSelectClass(By locator, String value) {
		List<WebElement> industry_options_list = driver.findElements(locator);
		for (WebElement ele : industry_options_list) {
			String text = ele.getText();
			if (text.equals(value)) {
				ele.click();
				break;
			}
		}
	}

	//**************************** Wait Utils ***************************************//
	
	public List<WebElement> visibilityOfAllElements(By locator, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public void getPageLinksText(By locator, int timeOut){
		visibilityOfAllElements(locator, timeOut).stream().forEach(ele -> System.out.println(ele.getText()));
	}
	
	public WebElement waitForElementToBeLocated(By locator, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public Boolean waitForElementToBeLocated3(By locator, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return true;
	}
	
	public WebElement waitForElementToBeLocated1(WebElement locator, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated((By) locator));
	}
	
	public void waitForElementToBeLocated2(String S1, int timeOut) {
		// TODO Auto-generated method stub
		
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		
		driver.findElement(By.partialLinkText(S1));
	}
	
	
	public WebElement waitForElementToBeVisible(By locator, int timeOut){
		WebElement element = getElement(locator);
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public String waitForPageTitlePresent(String titleValue, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleContains(titleValue));
		return driver.getTitle();
	}
	
	public String waitForTitleContains(int timeOut, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}

	public String waitForTitleIs(int timeOut, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}

	public boolean waitForTitle(int timeOut, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.titleIs(title));
	}

	
	public Alert waitForAlertToBePresent(int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public boolean waitForUrl(String url, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlContains(url));
	}
	
	public void clickWhenReady(By locator, int timeOut){
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}
	
	public WebElement waitForElementWithFluentWait(By locator, int timeOut, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofSeconds(pollingTime))
					.ignoring(NoSuchElementException.class);

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public void mouseaction(By locator1) {
		/*Actions actions = new Actions(driver); 
		WebElement menuOption = getElement(locator);
		actions.clickAndHold(menuOption);
		actions.moveByOffset(0, 100).release().build().perform();*/
		
		
		WebElement el1 = (getElement(locator1));
		//Used points class to get x and y coordinates of element.
		Point point = el1.getLocation();
		int xcord = point.getX();
		System.out.println("Position of the webelement from left side is "+xcord +" pixels");
		int ycord = point.getY();
		System.out.println("Position of the webelement from top side is "+ycord +" pixels");
		if (ycord > 1 && ycord < 200) {
			act.clickAndHold(el1);
			act.moveByOffset(0, 200).release().build().perform();
		}
		else if(ycord > 200 && ycord < 250) {
			act.clickAndHold(el1);
			act.moveByOffset(0, 30).release().build().perform();
		}
	}
	
	public boolean waitForElementToBeVisibleAssert(By locator, int timeOut){
		WebElement element = getElement(locator);
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
	//	return wait.until(ExpectedConditions.visibilityOf(element));
		if(wait.until(ExpectedConditions.visibilityOf(element)) != null){
			return true;
		}else{
			return false;
		}
	}
	
	public WebElement locateElement(String locatorType, String value,int timeout) {
		try {
			WebDriverWait	wait = new WebDriverWait(driver, timeout);
	//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementById(value)));
			switch(locatorType.toLowerCase()) {
			case "id": return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(value))));
			case "name":  return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name(value))));		
			case "class": return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className(value))));
			case "link": return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText(value))));
			case "xpath": return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(value))));
			case "PartialLinkText": return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.partialLinkText(value))));
			case "TagName": return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.tagName(value))));
			case "CssSelector": return  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(value))));
			}
		} catch (NoSuchElementException e) {
			System.err.println("The Element with locator:"+locatorType+" Not Found with value: "+value);
			throw new RuntimeException();
		}

		return null;
	}
	
	public Boolean waitfortexttopresent(By locator,String Value, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, Value));
		
	}
	
	public void doMoveToElement(By locator1, By locator2) {		
		
		act.clickAndHold(getElement(locator1)).moveByOffset(0,250).release(getElement(locator1)).build().perform();
//		act.clickAndHold(getElement(locator1));
//		System.out.println(getElement(locator1).getSize());
//		act.moveToElement(getElement(locator2)).release().build().perform();
//		act.moveByOffset(0, 70).release().build().perform();
		doActionsClick(locator2);
	} 
	
	public void getcoordinates(By locator1/* , By locator2 */) {
	WebElement element = (getElement(locator1));
	//Used points class to get x and y coordinates of element.
	Point point = element.getLocation();
	int xcord = point.getX();
	System.out.println("Position of the webelement from left side is "+xcord +" pixels");
	int ycord = point.getY();
	System.out.println("Position of the webelement from top side is "+ycord +" pixels");
	if (ycord > 541) {
	act.clickAndHold(getElement(locator1)).moveByOffset(0,250).release().build().perform();
	}
	}
}
